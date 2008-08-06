/*
This file is part of jpcsp.

Jpcsp is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Jpcsp is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Jpcsp.  If not, see <http://www.gnu.org/licenses/>.
 */
package jpcsp;

import jpcsp.format.Elf32ProgramHeader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.util.List;
import jpcsp.ElfHeader.ShFlags;
import jpcsp.format.Elf32;
import jpcsp.format.Elf32Header;
import jpcsp.format.Elf32SectionHeader;
import jpcsp.format.PBP;
import jpcsp.format.PSPModuleInfo;
import jpcsp.util.Utilities;

public class FileManager {
    // TODO : Define a way to use this insteast ElfHeader.ElfInfo; ElfHeader.PbpInfo; ElfHeader.SectInfo

    public static String ElfInfo,  PbpInfo,  SectInfo; // TODO : think a better way

    private PSPModuleInfo moduleInfo;
    private PBP pbp;
    private Elf32 elf;
    private RandomAccessFile actualFile;
    private String filePath;
    public final static int FORMAT_ELF = 0;
    public final static int FORMAT_PBP = 10;
    public final static int FORMAT_UMD = 20;
    public final static int FORMAT_ISO = 30;
    private int type = -1;
    private long elfoffset = 0;
    private long baseoffset = 0;
    private boolean relocate = false;

    public FileManager(String filePath) throws FileNotFoundException, IOException {
        this.filePath = filePath;
        loadAndDefine(filePath);
    }

    public PSPModuleInfo getPSPModuleInfo() {
        return moduleInfo;
    }

    public PBP getPBP() {
        return pbp;
    }

    public Elf32 getElf32() {
        return elf;
    }

    public RandomAccessFile getActualFile() {
        return actualFile;
    }

    private void setActualFile(RandomAccessFile f) {
        actualFile = f;
    }

    private void loadAndDefine(String filePath) throws FileNotFoundException, IOException {
        RandomAccessFile f = new RandomAccessFile(filePath, "r");
        setActualFile(f);
        try {
            elfoffset = 0;
            baseoffset = 0;
            relocate = false;

            moduleInfo = new PSPModuleInfo();

            //makes sense put the more used first...

            /*try pbp format*/
            pbp = new PBP(getActualFile());
            processPbp();
            if (getType() == FORMAT_PBP) {
                return;
            }
            /*end try pbp format*/

            /*try elf32 format*/
            elf = new Elf32(getActualFile());
            processElf();
            if (getType() == FORMAT_ELF) {
                return;
            }
            /*end try elf32 format*/


            /*try xxxx format*/
            /*try xxxx format*/


            //NONE FORMAT SELECTED OR DETECTED :(
        } finally {
           // f.close(); // close or let it open...

        }
    }

    public int getType() {
        return type;
    }

    private void processElf() throws IOException {
        readElf32Header();
        readElfProgramHeaders();
        readElfSectionHeaders();
    }

    private void readElf32Header() {
        if (!getElf32().getHeader().isValid()) {
            System.out.println("NOT AN ELF FILE");
        } else {
            type = FORMAT_ELF;
        }
        if (!getElf32().getHeader().isMIPSExecutable()) {
            System.out.println("NOT A MIPS executable");
        }
        ElfInfo = getElf32().getHeader().toString();
        getElf32().getHeader().setInfo(ElfInfo);
                


        if (getElf32().getHeader().isPRXDetected()) {
            System.out.println("PRX detected, requires relocation");
            baseoffset = 0x08900000;
            relocate = true;
        } else if (getElf32().getHeader().requiresRelocation()) {
            // seen in .elf's generated by pspsdk with BUILD_PRX=1 before conversion to .prx
            System.out.println("ELF requires relocation");
            baseoffset = 0x08900000;
            relocate = true;
        }
    }

    private void processPbp() throws IOException {

        if (getPBP().isValid()) {

            if (Settings.get_instance().readBoolEmuoptions("pbpunpack")){
                getPBP().unpackPBP(getActualFile());
            }
            elfoffset = getPBP().getOffsetPspData();
            getActualFile().seek(elfoffset); //seek the new offset
            PbpInfo = getPBP().toString(); //inteast this use PBP.getInfo()
            
            elf = new Elf32(getActualFile()); //the elf of pbp
            getPBP().setElf32(elf); //composite the pbp...
            processElf();
            
            type = FORMAT_PBP;
        } else {
            elfoffset = 0;
            getActualFile().seek(0);
            getPBP().setInfo("-----NOT A PBP FILE---------\n");
        }
    }

    private void readElfProgramHeaders() throws IOException {
        List<Elf32ProgramHeader> programheaders = new LinkedList<Elf32ProgramHeader>();
        StringBuffer phsb = new StringBuffer();

        for (int i = 0; i < getElf32().getHeader().getE_phnum(); i++) {
            getActualFile().seek(elfoffset + getElf32().getHeader().getE_phoff() + (i * getElf32().getHeader().getE_phentsize()));
            Elf32ProgramHeader phdr = new Elf32ProgramHeader(getActualFile());
            programheaders.add(phdr);

            phsb.append("-----PROGRAM HEADER #" + i + "-----" + "\n");
            phsb.append(phdr.toString());

            // yapspd: if the PRX file is a kernel module then the most significant
            // bit must be set in the phsyical address of the first program header.
            if (i == 0 && (phdr.getP_paddr() & 0x80000000L) == 0x80000000L) {
                // kernel mode prx
                System.out.println("Kernel mode PRX detected");
            }
            //SegInfo = phsb.toString();
            ElfInfo += phsb.toString();
            getElf32().getHeader().setInfo(ElfInfo);
        }
    }

    private void readElfSectionHeaders() throws IOException {
        List<Elf32SectionHeader> sectionheaders = new LinkedList<Elf32SectionHeader>(); //use in more than one step
        Elf32SectionHeader shstrtab = null; //use in more than one step
        shstrtab = firstStep(getElf32().getHeader(), getActualFile(),  sectionheaders);
        secondStep(sectionheaders, shstrtab, getActualFile(),  getPSPModuleInfo());
    }

    private Elf32SectionHeader firstStep(Elf32Header elf32, RandomAccessFile f, List<Elf32SectionHeader> sectionheaders) throws IOException {
        /** Read the ELF section headers (1st pass) */
        sectionheaders = new LinkedList<Elf32SectionHeader>();
        getElf32().setListSectionHeader(sectionheaders); //make the connection

        Elf32SectionHeader shstrtab = null;
        for (int i = 0; i < elf32.getE_shnum(); i++) {
            f.seek(elfoffset + elf32.getE_shoff() + (i * elf32.getE_shentsize()));
            Elf32SectionHeader shdr = new Elf32SectionHeader(f);
            sectionheaders.add(shdr);

            if (shdr.getSh_type() == 3 && shstrtab == null) //ShType.STRTAB
            {
                shstrtab = shdr;
            }

            // Load some sections into memory
            if ((shdr.getSh_flags() & ShFlags.Allocate.getValue()) == ShFlags.Allocate.getValue()) {
                switch (shdr.getSh_type()) {
                    case 1: //ShType.PROGBITS
                        //System.out.println("FEED MEMORY WITH IT!");

                        f.seek(elfoffset + shdr.getSh_offset());
                        int offsettoread = (int) getBaseoffset() + (int) shdr.getSh_addr() - MemoryMap.START_RAM;
                        f.read(Memory.get_instance().mainmemory, offsettoread, (int) shdr.getSh_size());
                        break;
                    case 8: // ShType.NOBITS

                        System.out.println("NO BITS");
                        // zero out this memory(?), from shdr.sh_addr to shdr.sh_addr + shdr.sh_size
                        break;
                }
            }
        }

        return shstrtab;
    }

    private void secondStep(List<Elf32SectionHeader> sectionheaders, Elf32SectionHeader shstrtab, RandomAccessFile f,PSPModuleInfo moduleinfo) throws IOException {
        // 2nd pass generate info string for the GUI and get module infos
        //moduleinfo = new PSPModuleInfo(); moved to loadAndDefine()
         StringBuffer shsb = new StringBuffer();
        int SectionCounter = 0;
        for (Elf32SectionHeader shdr : sectionheaders) {
            // Number the section
            shsb.append("-----SECTION HEADER #" + SectionCounter + "-----" + "\n");

            // Resolve section name (if possible)
            if (shstrtab != null) {
                f.seek(elfoffset + shstrtab.getSh_offset() + shdr.getSh_name());
                String SectionName = Utilities.readStringZ(f);
                if (SectionName.length() > 0) {
                    shdr.setSh_namez(SectionName);
                    shsb.append(SectionName + "\n");

                    // Get module infos
                    if (SectionName.matches(".rodata.sceModuleInfo")) {
                        f.seek(elfoffset + shdr.getSh_offset());
                        moduleinfo.read(f);
                        //System.out.println(Long.toHexString(moduleinfo.m_gp));

                        System.out.println("Found ModuleInfo name:'" + moduleinfo.getM_namez() + "' version:" + Utilities.formatString("short", Integer.toHexString(moduleinfo.getM_version() & 0xFFFF).toUpperCase()));

                        if ((moduleinfo.getM_attr() & 0x1000) != 0) {
                            System.out.println("Kernel mode module detected");
                        }
                        if ((moduleinfo.getM_attr() & 0x0800) != 0) {
                            System.out.println("VSH mode module detected");
                        }
                    }
                }
            }

            // Add the normal info
            shsb.append(shdr.toString());
            SectionCounter++;
        }
        SectInfo = shsb.toString();
        
        getElf32().getSectionHeader().setInfo(SectInfo);

    }

    public long getBaseoffset() {
        return baseoffset;
    }

    public long getElfoffset(){
        return elfoffset;
    }
}
