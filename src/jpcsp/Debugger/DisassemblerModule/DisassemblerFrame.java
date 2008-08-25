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

package jpcsp.Debugger.DisassemblerModule;

import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import jpcsp.Emulator;
import jpcsp.Memory;
import jpcsp.Settings;
import jpcsp.util.JpcspDialogManager;
import jpcsp.util.OptionPaneMultiple;

/**
 *
 * @author  shadow
 */
public class DisassemblerFrame extends javax.swing.JFrame implements ClipboardOwner{
    int DebuggerPC;
    Emulator emu;
    private DefaultListModel listmodel = new DefaultListModel();
    int opcode_address; // store the address of the opcode used for offsetdecode
    DisasmOpcodes disOp = new DisasmOpcodes();
    ArrayList<Integer> breakpoints = new ArrayList<Integer>();
    /** Creates new form DisassemblerFrame */
    public DisassemblerFrame(Emulator emu) {
        this.emu=emu;
        DebuggerPC = 0;
        listmodel = new DefaultListModel();
        initComponents();
        
        RefreshDebugger();
    }
    
    
    public void RefreshDebugger() {
        int t;
        int cnt;
        if (DebuggerPC == 0) {
            DebuggerPC = Emulator.getProcessor().pc;
        }
        listmodel.clear();

        for (t = DebuggerPC , cnt = 0; t < (DebuggerPC + 0x000000A8); t += 0x00000004, cnt++) {

            int memread = Memory.get_instance().read32((int) t);

            if (memread == 0) {
                 if(breakpoints.indexOf(t)!=-1)
                      listmodel.addElement(String.format("<br>%08x:[%08x]: nop", t, memread));
                 else
                  listmodel.addElement(String.format("%08x:[%08x]: nop", t, memread));
            } else {
                opcode_address = t;
                if(breakpoints.indexOf(t)!=-1)
                {
                    listmodel.addElement(String.format("<br>%08x:[%08x]: %s", t, memread, disOp.disasm(memread,opcode_address)));
                }
                else
                {
                    listmodel.addElement(String.format("%08x:[%08x]: %s", t, memread, disOp.disasm(memread,opcode_address)));
                }
            }
        }
    //refreshregisters
        jTable1.setValueAt(Integer.toHexString(Emulator.getProcessor().pc), 0, 1);
        jTable1.setValueAt(Integer.toHexString(Emulator.getProcessor().hi()), 1, 1);
        jTable1.setValueAt(Integer.toHexString(Emulator.getProcessor().lo()), 2, 1);
        for (int i = 0; i < 32; i++) {
            jTable1.setValueAt(Integer.toHexString(Emulator.getProcessor().gpr[i]), 3 + i, 1);
        }
        for (int i = 0; i < 32; i++) {
            jTable3.setValueAt(Emulator.getProcessor().fpr[i], i, 1);
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DisMenu = new javax.swing.JPopupMenu();
        CopyAddress = new javax.swing.JMenuItem();
        CopyAll = new javax.swing.JMenuItem();
        BranchOrJump = new javax.swing.JMenuItem();
        disasmList = new javax.swing.JList(listmodel);
        DisasmToolbar = new javax.swing.JToolBar();
        RunDebugger = new javax.swing.JToggleButton();
        PauseDebugger = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        StepInto = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        ResetToPCbutton = new javax.swing.JButton();
        JumpToAddress = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        AddBreakpoint = new javax.swing.JButton();
        DeleteBreakpoint = new javax.swing.JButton();
        DeleteAllBreakpoints = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        DumpCodeToText = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTable1 = new javax.swing.JTable();
        jTable2 = new javax.swing.JTable();
        jTable3 = new javax.swing.JTable();

        CopyAddress.setText("Copy Address");
        CopyAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyAddressActionPerformed(evt);
            }
        });
        DisMenu.add(CopyAddress);

        CopyAll.setText("Copy All");
        CopyAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyAllActionPerformed(evt);
            }
        });
        DisMenu.add(CopyAll);

        BranchOrJump.setText("Copy Branch Or Jump address");
        BranchOrJump.setEnabled(false); //disable as default
        BranchOrJump.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BranchOrJumpActionPerformed(evt);
            }
        });
        DisMenu.add(BranchOrJump);

        setTitle("Debugger");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        disasmList.setFont(new java.awt.Font("Courier New", 0, 11));
        disasmList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        disasmList.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                disasmListMouseWheelMoved(evt);
            }
        });
        disasmList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disasmListMouseClicked(evt);
            }
        });
        disasmList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                disasmListKeyPressed(evt);
            }
        });

        DisasmToolbar.setFloatable(false);
        DisasmToolbar.setRollover(true);

        RunDebugger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpcsp/icons/PlayIcon.png"))); // NOI18N
        RunDebugger.setText("Run");
        RunDebugger.setFocusable(false);
        RunDebugger.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        RunDebugger.setIconTextGap(2);
        RunDebugger.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        RunDebugger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunDebuggerActionPerformed(evt);
            }
        });
        DisasmToolbar.add(RunDebugger);

        PauseDebugger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpcsp/icons/PauseIcon.png"))); // NOI18N
        PauseDebugger.setText("Pause");
        PauseDebugger.setFocusable(false);
        PauseDebugger.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        PauseDebugger.setIconTextGap(2);
        PauseDebugger.setInheritsPopupMenu(true);
        PauseDebugger.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PauseDebugger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PauseDebuggerActionPerformed(evt);
            }
        });
        DisasmToolbar.add(PauseDebugger);
        DisasmToolbar.add(jSeparator1);

        StepInto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpcsp/icons/StepIntoIcon.png"))); // NOI18N
        StepInto.setText("Step Into");
        StepInto.setFocusable(false);
        StepInto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        StepInto.setIconTextGap(2);
        StepInto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        StepInto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StepIntoActionPerformed(evt);
            }
        });
        DisasmToolbar.add(StepInto);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpcsp/icons/StepOverIcon.png"))); // NOI18N
        jButton2.setText("Step Over");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.setIconTextGap(2);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DisasmToolbar.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpcsp/icons/StepOutIcon.png"))); // NOI18N
        jButton3.setText("Step Out");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.setIconTextGap(2);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DisasmToolbar.add(jButton3);
        DisasmToolbar.add(jSeparator2);

        ResetToPCbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpcsp/icons/ResetToPc.png"))); // NOI18N
        ResetToPCbutton.setText("Reset To PC");
        ResetToPCbutton.setFocusable(false);
        ResetToPCbutton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ResetToPCbutton.setIconTextGap(2);
        ResetToPCbutton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ResetToPCbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetToPCbuttonActionPerformed(evt);
            }
        });
        DisasmToolbar.add(ResetToPCbutton);

        JumpToAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpcsp/icons/JumpTo.png"))); // NOI18N
        JumpToAddress.setText("Jump To");
        JumpToAddress.setFocusable(false);
        JumpToAddress.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JumpToAddress.setIconTextGap(2);
        JumpToAddress.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JumpToAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumpToAddressActionPerformed(evt);
            }
        });
        DisasmToolbar.add(JumpToAddress);
        DisasmToolbar.add(jSeparator4);

        AddBreakpoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpcsp/icons/NewBreakpointIcon.png"))); // NOI18N
        AddBreakpoint.setText("Add Break");
        AddBreakpoint.setFocusable(false);
        AddBreakpoint.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        AddBreakpoint.setIconTextGap(2);
        AddBreakpoint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AddBreakpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBreakpointActionPerformed(evt);
            }
        });
        DisasmToolbar.add(AddBreakpoint);

        DeleteBreakpoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpcsp/icons/DeleteBreakpointIcon.png"))); // NOI18N
        DeleteBreakpoint.setText("Delete Break");
        DeleteBreakpoint.setFocusable(false);
        DeleteBreakpoint.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        DeleteBreakpoint.setIconTextGap(2);
        DeleteBreakpoint.setInheritsPopupMenu(true);
        DeleteBreakpoint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DeleteBreakpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBreakpointActionPerformed(evt);
            }
        });
        DisasmToolbar.add(DeleteBreakpoint);

        DeleteAllBreakpoints.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpcsp/icons/DeleteAllBreakpointsIcon.png"))); // NOI18N
        DeleteAllBreakpoints.setText("DeleteAll");
        DeleteAllBreakpoints.setFocusable(false);
        DeleteAllBreakpoints.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        DeleteAllBreakpoints.setIconTextGap(2);
        DeleteAllBreakpoints.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DeleteAllBreakpoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAllBreakpointsActionPerformed(evt);
            }
        });
        DisasmToolbar.add(DeleteAllBreakpoints);
        DisasmToolbar.add(jSeparator3);

        DumpCodeToText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jpcsp/icons/Dump.png"))); // NOI18N
        DumpCodeToText.setText("Dump Code");
        DumpCodeToText.setFocusable(false);
        DumpCodeToText.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        DumpCodeToText.setIconTextGap(2);
        DumpCodeToText.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        DumpCodeToText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DumpCodeToTextActionPerformed(evt);
            }
        });
        DisasmToolbar.add(DumpCodeToText);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"PC", ""},
                {"HI", null},
                {"LO", null},
                {"zr", null},
                {"at", null},
                {"v0", null},
                {"v1", null},
                {"a0", null},
                {"a1", null},
                {"a2", null},
                {"a3", null},
                {"t0", null},
                {"t1", null},
                {"t2", null},
                {"t3", null},
                {"t4", null},
                {"t5", null},
                {"t6", null},
                {"t7", null},
                {"s0", null},
                {"s1", null},
                {"s2", null},
                {"s3", null},
                {"s4", null},
                {"s5", null},
                {"s6", null},
                {"s7", null},
                {"t8", null},
                {"t9", null},
                {"k0", null},
                {"k1", null},
                {"gp", null},
                {"sp", null},
                {"fp", null},
                {"ra", null}
            },
            new String [] {
                "REG", "HEX"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTabbedPane1.addTab("GPR", jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "REG", "HEX"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabbedPane1.addTab("COP0", jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"FPR0", null},
                {"FPR1", null},
                {"FPR2", null},
                {"FPR3", null},
                {"FPR4", null},
                {"FPR5", null},
                {"FPR6", null},
                {"FPR7", null},
                {"FPR8", null},
                {"FPR9", null},
                {"FPR10", null},
                {"FPR11", null},
                {"FPR12", null},
                {"FPR13", null},
                {"FPR14", null},
                {"FPR15", null},
                {"FPR16", null},
                {"FPR17", null},
                {"FPR18", null},
                {"FPR19", null},
                {"FPR20", null},
                {"FPR21", null},
                {"FPR22", null},
                {"FPR23", null},
                {"FPR24", null},
                {"FPR25", null},
                {"FPR26", null},
                {"FPR27", null},
                {"FPR28", null},
                {"FPR29", null},
                {"FPR30", null},
                {"FPR31", null}
            },
            new String [] {
                "REG", "FLOAT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabbedPane1.addTab("COP1", jTable3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DisasmToolbar, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(disasmList, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DisasmToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disasmList, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void disasmListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_disasmListKeyPressed
    if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_DOWN && disasmList.getSelectedIndex() == disasmList.getLastVisibleIndex()) {
        DebuggerPC += 4;
        RefreshDebugger();
        evt.consume();
        disasmList.setSelectedIndex(disasmList.getLastVisibleIndex());
    } else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_UP && disasmList.getSelectedIndex() == 0) {
        DebuggerPC -= 4;
        RefreshDebugger();
        evt.consume();
        disasmList.setSelectedIndex(0);
    } else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_PAGE_UP && disasmList.getSelectedIndex() == 0) {
        DebuggerPC -= 0x000000A8;
        RefreshDebugger();
        evt.consume();
        disasmList.setSelectedIndex(0);
    } else if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_PAGE_DOWN && disasmList.getSelectedIndex() == disasmList.getLastVisibleIndex()) {
        DebuggerPC += 0x000000A8;
        RefreshDebugger();
        evt.consume();
        disasmList.setSelectedIndex(disasmList.getLastVisibleIndex());
    }
}//GEN-LAST:event_disasmListKeyPressed

private void disasmListMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_disasmListMouseWheelMoved
    if (evt.getWheelRotation() < 0) {
        evt.consume();
        if (disasmList.getSelectedIndex() == 0 || disasmList.getSelectedIndex() == -1) {
            DebuggerPC -= 4;
            RefreshDebugger();
            disasmList.setSelectedIndex(0);
        } else {
            disasmList.setSelectedIndex(disasmList.getSelectedIndex() - 1);
        }
    } else {
        evt.consume();
        if (disasmList.getSelectedIndex() == disasmList.getLastVisibleIndex()) {
            DebuggerPC += 4;
            RefreshDebugger();
            disasmList.setSelectedIndex(disasmList.getLastVisibleIndex());
        } else {
            disasmList.setSelectedIndex(disasmList.getSelectedIndex() + 1);
        }
    }
}//GEN-LAST:event_disasmListMouseWheelMoved

private void ResetToPCbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetToPCbuttonActionPerformed
    DebuggerPC = Emulator.getProcessor().pc;
    RefreshDebugger();
}//GEN-LAST:event_ResetToPCbuttonActionPerformed

private void JumpToAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumpToAddressActionPerformed
    String input = (String) JOptionPane.showInputDialog(this, "Enter the address to which to jump (Hex)", "Jpcsp", JOptionPane.QUESTION_MESSAGE, null, null, String.format("%08x", Emulator.getProcessor().pc));
    if (input == null) {
        return;
    }
    int value=0;
         try {
            value = Integer.parseInt(input, 16);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The Number you enter is not correct");
            return;
        }
        DebuggerPC = value;
        RefreshDebugger();

}//GEN-LAST:event_JumpToAddressActionPerformed

private void DumpCodeToTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DumpCodeToTextActionPerformed
    OptionPaneMultiple opt=new OptionPaneMultiple(Integer.toHexString(DebuggerPC),Integer.toHexString(DebuggerPC + 0x000000A4));
    if(opt.completed()){
        //Here the input can be used to actually dump code
        System.out.println("Start address: "+opt.getInput()[0]);
        System.out.println("End address: "+opt.getInput()[1]);
        System.out.println("File name: "+opt.getInput()[2]);

        BufferedWriter bufferedWriter = null;
        try {

            //Construct the BufferedWriter object
            bufferedWriter = new BufferedWriter(new FileWriter(opt.getInput()[2]));

            //Start writing to the output stream
            bufferedWriter.write("-------JPCSP DISASM-----------");
            bufferedWriter.newLine();
            int Start = Integer.parseInt(opt.getInput()[0],16);
            int End = Integer.parseInt(opt.getInput()[1],16);
            for(int i =Start; i<=End; i+=4)
            {
               int memread = Memory.get_instance().read32((int) i);
             if (memread == 0) {
                bufferedWriter.write(String.format("%08x : [%08x]: nop", i, memread));
                bufferedWriter.newLine();
             } else {
                opcode_address = i;
                bufferedWriter.write(String.format("%08x : [%08x]: %s", i, memread, disOp.disasm(memread,opcode_address)));
                bufferedWriter.newLine();
             }
            }


        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            //Close the BufferedWriter
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    //System.out.println("dump code dialog done");
    opt=null;
}//GEN-LAST:event_DumpCodeToTextActionPerformed



//Following methods are for the JPopmenu in Jlist
private void CopyAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyAddressActionPerformed
    String value = (String)disasmList.getSelectedValue();
    String address;
    if(value.startsWith("<br>"))
      address = value.substring(4, 12);
    else
      address = value.substring(0, 8);
    StringSelection stringSelection = new StringSelection( address);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, this);
}//GEN-LAST:event_CopyAddressActionPerformed

private void CopyAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyAllActionPerformed
String value = (String)disasmList.getSelectedValue();
    StringSelection stringSelection = new StringSelection( value);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, this);
}//GEN-LAST:event_CopyAllActionPerformed

private void BranchOrJumpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BranchOrJumpActionPerformed
String value = (String)disasmList.getSelectedValue();
    int address = value.indexOf("0x");
    if(address==-1)
    {
      JpcspDialogManager.showError(this, "Can't find the jump or branch address");
      return;
    }
    else
    {
      String add = value.substring(address+2,value.length());

      // Remove syscall code, if present
      int addressend = add.indexOf(" ");
      if (addressend != -1)
        add = add.substring(0, addressend);

      StringSelection stringSelection = new StringSelection(add);
      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      clipboard.setContents(stringSelection, this);

    }
}//GEN-LAST:event_BranchOrJumpActionPerformed
    @Override
public void lostOwnership( Clipboard aClipboard, Transferable aContents) {
     //do nothing
 }
private void disasmListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disasmListMouseClicked
        BranchOrJump.setEnabled(false);
       if (SwingUtilities.isRightMouseButton(evt) && !disasmList.isSelectionEmpty() && disasmList.locationToIndex(evt.getPoint()) == disasmList.getSelectedIndex())
       {
           //check if we can enable branch or jump address copy
           String line = (String)disasmList.getSelectedValue();
           int finddot = line.indexOf("]:");
           String opcode = line.substring(finddot+3,line.length());
           if(opcode.startsWith("b") || opcode.startsWith("j"))//it is definately a branch or jump opcode
           {
               BranchOrJump.setEnabled(true);
           }
            DisMenu.show(disasmList, evt.getX(), evt.getY());
       }
}//GEN-LAST:event_disasmListMouseClicked

private void AddBreakpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBreakpointActionPerformed
          String value =(String)disasmList.getSelectedValue();
          if(value != null)
          {
            String address = value.substring(0, 8);
            int addr = Integer.parseInt(address,16);
            breakpoints.add(addr);
            RefreshDebugger();
          }
          else
          {
            JpcspDialogManager.showInformation(this, "Breakpoint Help : " + "Select the line to add a breakpoint to.");
          }
}//GEN-LAST:event_AddBreakpointActionPerformed

private void DeleteAllBreakpointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAllBreakpointsActionPerformed
       if(!breakpoints.isEmpty())
            breakpoints.clear();
}//GEN-LAST:event_DeleteAllBreakpointsActionPerformed
         
private void DeleteBreakpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBreakpointActionPerformed
          String value =(String)disasmList.getSelectedValue();
          if(value != null)
          {
            boolean breakpointexists = value.startsWith("<br>");
            if(breakpointexists)
            {
              String address = value.substring(4, 12);
              int addr = Integer.parseInt(address,16);
              int b = breakpoints.indexOf(addr);
              breakpoints.remove(b);
              RefreshDebugger();
            }
          }
          else
          {
            JpcspDialogManager.showInformation(this, "Breakpoint Help : " + "Select the line to remove a breakpoint from.");
          }
}//GEN-LAST:event_DeleteBreakpointActionPerformed

private void StepIntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StepIntoActionPerformed
   // try {
        Emulator.getProcessor().step();
        jpcsp.HLE.ThreadMan.get_instance().step();
        jpcsp.HLE.pspdisplay.get_instance().step();
    //} catch(GeneralJpcspException e) {
    //    JpcspDialogManager.showError(this, "General Error : " + e.getMessage());
   // }
    DebuggerPC = 0;
    RefreshDebugger();
}//GEN-LAST:event_StepIntoActionPerformed

private void RunDebuggerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunDebuggerActionPerformed
      //while(breakpoints.indexOf(Emulator.getProcessor().pc) != -1)//check if there is a breakpoint
      //{
     //     emu.PauseEmu();
      //    RunDebugger.setSelected(false);
      //    DebuggerPC = 0;
      //    RefreshDebugger();
     // }
     // else
     // {
        emu.RunEmu();
     // }
}//GEN-LAST:event_RunDebuggerActionPerformed

private void PauseDebuggerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PauseDebuggerActionPerformed
    emu.PauseEmu();
    RunDebugger.setSelected(false);
    DebuggerPC = 0;
    RefreshDebugger();
}//GEN-LAST:event_PauseDebuggerActionPerformed

private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    Point location = getLocation();
    //location.x
    String[] coord = new String[2];
    coord[0]=Integer.toString(location.x);
    coord[1]=Integer.toString(location.y);
    Settings.get_instance().writeWindowPos("disassembler", coord);
}//GEN-LAST:event_formWindowClosing

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBreakpoint;
    private javax.swing.JMenuItem BranchOrJump;
    private javax.swing.JMenuItem CopyAddress;
    private javax.swing.JMenuItem CopyAll;
    private javax.swing.JButton DeleteAllBreakpoints;
    private javax.swing.JButton DeleteBreakpoint;
    private javax.swing.JPopupMenu DisMenu;
    private javax.swing.JToolBar DisasmToolbar;
    private javax.swing.JButton DumpCodeToText;
    private javax.swing.JButton JumpToAddress;
    private javax.swing.JButton PauseDebugger;
    private javax.swing.JButton ResetToPCbutton;
    private javax.swing.JToggleButton RunDebugger;
    private javax.swing.JButton StepInto;
    private javax.swing.JList disasmList;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

}
