/* This autogenerated file is part of jpcsp. */
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

package jpcsp.HLE.modules150;

import jpcsp.HLE.modules.HLEModule;
import jpcsp.HLE.modules.HLEModuleFunction;
import jpcsp.HLE.modules.HLEModuleManager;

import jpcsp.Memory;
import jpcsp.Processor;

import jpcsp.Allegrex.CpuState; // New-Style Processor

public class sceLibUpdateDL implements HLEModule {
	@Override
	public String getName() { return "sceLibUpdateDL"; }
	
	@Override
	public void installModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.addFunction(sceUpdateDownloadInitFunction, 0xFC1AB540);
			mm.addFunction(sceUpdateDownloadInitExFunction, 0xF6690A9A);
			mm.addFunction(sceLibUpdateDL_88FF3935Function, 0x88FF3935);
			mm.addFunction(sceUpdateDownloadSetServerRegionFunction, 0xB5DB018D);
			mm.addFunction(sceLibUpdateDL_F7E66CB4Function, 0xF7E66CB4);
			mm.addFunction(sceUpdateDownloadSetVersionFunction, 0xC1AF1076);
			mm.addFunction(sceUpdateDownloadEndFunction, 0xD6A09757);
			mm.addFunction(sceUpdateDownloadConnectServerFunction, 0xFD675E8D);
			mm.addFunction(sceUpdateDownloadReadDataFunction, 0xFA9AA797);
			mm.addFunction(sceUpdateDownloadAbortFunction, 0x4F49C9C1);
			
		}
	}
	
	@Override
	public void uninstallModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.removeFunction(sceUpdateDownloadInitFunction);
			mm.removeFunction(sceUpdateDownloadInitExFunction);
			mm.removeFunction(sceLibUpdateDL_88FF3935Function);
			mm.removeFunction(sceUpdateDownloadSetServerRegionFunction);
			mm.removeFunction(sceLibUpdateDL_F7E66CB4Function);
			mm.removeFunction(sceUpdateDownloadSetVersionFunction);
			mm.removeFunction(sceUpdateDownloadEndFunction);
			mm.removeFunction(sceUpdateDownloadConnectServerFunction);
			mm.removeFunction(sceUpdateDownloadReadDataFunction);
			mm.removeFunction(sceUpdateDownloadAbortFunction);
			
		}
	}
	
	
	public void sceUpdateDownloadInit(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceUpdateDownloadInit [0xFC1AB540]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceUpdateDownloadInitEx(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceUpdateDownloadInitEx [0xF6690A9A]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceLibUpdateDL_88FF3935(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceLibUpdateDL_88FF3935 [0x88FF3935]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceUpdateDownloadSetServerRegion(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceUpdateDownloadSetServerRegion [0xB5DB018D]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceLibUpdateDL_F7E66CB4(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceLibUpdateDL_F7E66CB4 [0xF7E66CB4]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceUpdateDownloadSetVersion(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceUpdateDownloadSetVersion [0xC1AF1076]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceUpdateDownloadEnd(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceUpdateDownloadEnd [0xD6A09757]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceUpdateDownloadConnectServer(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceUpdateDownloadConnectServer [0xFD675E8D]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceUpdateDownloadReadData(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceUpdateDownloadReadData [0xFA9AA797]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceUpdateDownloadAbort(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceUpdateDownloadAbort [0x4F49C9C1]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public final HLEModuleFunction sceUpdateDownloadInitFunction = new HLEModuleFunction("sceLibUpdateDL", "sceUpdateDownloadInit") {
		@Override
		public final void execute(Processor processor) {
			sceUpdateDownloadInit(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceLibUpdateDLModule.sceUpdateDownloadInit(processor);";
		}
	};
    
	public final HLEModuleFunction sceUpdateDownloadInitExFunction = new HLEModuleFunction("sceLibUpdateDL", "sceUpdateDownloadInitEx") {
		@Override
		public final void execute(Processor processor) {
			sceUpdateDownloadInitEx(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceLibUpdateDLModule.sceUpdateDownloadInitEx(processor);";
		}
	};
    
	public final HLEModuleFunction sceLibUpdateDL_88FF3935Function = new HLEModuleFunction("sceLibUpdateDL", "sceLibUpdateDL_88FF3935") {
		@Override
		public final void execute(Processor processor) {
			sceLibUpdateDL_88FF3935(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceLibUpdateDLModule.sceLibUpdateDL_88FF3935(processor);";
		}
	};
    
	public final HLEModuleFunction sceUpdateDownloadSetServerRegionFunction = new HLEModuleFunction("sceLibUpdateDL", "sceUpdateDownloadSetServerRegion") {
		@Override
		public final void execute(Processor processor) {
			sceUpdateDownloadSetServerRegion(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceLibUpdateDLModule.sceUpdateDownloadSetServerRegion(processor);";
		}
	};
    
	public final HLEModuleFunction sceLibUpdateDL_F7E66CB4Function = new HLEModuleFunction("sceLibUpdateDL", "sceLibUpdateDL_F7E66CB4") {
		@Override
		public final void execute(Processor processor) {
			sceLibUpdateDL_F7E66CB4(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceLibUpdateDLModule.sceLibUpdateDL_F7E66CB4(processor);";
		}
	};
    
	public final HLEModuleFunction sceUpdateDownloadSetVersionFunction = new HLEModuleFunction("sceLibUpdateDL", "sceUpdateDownloadSetVersion") {
		@Override
		public final void execute(Processor processor) {
			sceUpdateDownloadSetVersion(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceLibUpdateDLModule.sceUpdateDownloadSetVersion(processor);";
		}
	};
    
	public final HLEModuleFunction sceUpdateDownloadEndFunction = new HLEModuleFunction("sceLibUpdateDL", "sceUpdateDownloadEnd") {
		@Override
		public final void execute(Processor processor) {
			sceUpdateDownloadEnd(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceLibUpdateDLModule.sceUpdateDownloadEnd(processor);";
		}
	};
    
	public final HLEModuleFunction sceUpdateDownloadConnectServerFunction = new HLEModuleFunction("sceLibUpdateDL", "sceUpdateDownloadConnectServer") {
		@Override
		public final void execute(Processor processor) {
			sceUpdateDownloadConnectServer(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceLibUpdateDLModule.sceUpdateDownloadConnectServer(processor);";
		}
	};
    
	public final HLEModuleFunction sceUpdateDownloadReadDataFunction = new HLEModuleFunction("sceLibUpdateDL", "sceUpdateDownloadReadData") {
		@Override
		public final void execute(Processor processor) {
			sceUpdateDownloadReadData(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceLibUpdateDLModule.sceUpdateDownloadReadData(processor);";
		}
	};
    
	public final HLEModuleFunction sceUpdateDownloadAbortFunction = new HLEModuleFunction("sceLibUpdateDL", "sceUpdateDownloadAbort") {
		@Override
		public final void execute(Processor processor) {
			sceUpdateDownloadAbort(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceLibUpdateDLModule.sceUpdateDownloadAbort(processor);";
		}
	};
    
};
