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

public class sceMeMemory_driver implements HLEModule {
	@Override
	public String getName() { return "sceMeMemory_driver"; }
	
	@Override
	public void installModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.addFunction(sceMeMallocFunction, 0xA177798D);
			mm.addFunction(sceMeCallocFunction, 0xC86500E3);
			mm.addFunction(sceMeFreeFunction, 0x5AD660FA);
			
		}
	}
	
	@Override
	public void uninstallModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.removeFunction(sceMeMallocFunction);
			mm.removeFunction(sceMeCallocFunction);
			mm.removeFunction(sceMeFreeFunction);
			
		}
	}
	
	
	public void sceMeMalloc(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceMeMalloc [0xA177798D]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceMeCalloc(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceMeCalloc [0xC86500E3]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceMeFree(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceMeFree [0x5AD660FA]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public final HLEModuleFunction sceMeMallocFunction = new HLEModuleFunction("sceMeMemory_driver", "sceMeMalloc") {
		@Override
		public final void execute(Processor processor) {
			sceMeMalloc(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceMeMemory_driverModule.sceMeMalloc(processor);";
		}
	};
    
	public final HLEModuleFunction sceMeCallocFunction = new HLEModuleFunction("sceMeMemory_driver", "sceMeCalloc") {
		@Override
		public final void execute(Processor processor) {
			sceMeCalloc(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceMeMemory_driverModule.sceMeCalloc(processor);";
		}
	};
    
	public final HLEModuleFunction sceMeFreeFunction = new HLEModuleFunction("sceMeMemory_driver", "sceMeFree") {
		@Override
		public final void execute(Processor processor) {
			sceMeFree(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceMeMemory_driverModule.sceMeFree(processor);";
		}
	};
    
};
