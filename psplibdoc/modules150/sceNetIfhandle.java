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

public class sceNetIfhandle implements HLEModule {
	@Override
	public String getName() { return "sceNetIfhandle"; }
	
	@Override
	public void installModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.addFunction(sceNetGetDropRateFunction, 0xC80181A2);
			mm.addFunction(sceNetSetDropRateFunction, 0xFD8585E1);
			
		}
	}
	
	@Override
	public void uninstallModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.removeFunction(sceNetGetDropRateFunction);
			mm.removeFunction(sceNetSetDropRateFunction);
			
		}
	}
	
	
	public void sceNetGetDropRate(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetGetDropRate [0xC80181A2]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetSetDropRate(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetSetDropRate [0xFD8585E1]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public final HLEModuleFunction sceNetGetDropRateFunction = new HLEModuleFunction("sceNetIfhandle", "sceNetGetDropRate") {
		@Override
		public final void execute(Processor processor) {
			sceNetGetDropRate(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetIfhandleModule.sceNetGetDropRate(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetSetDropRateFunction = new HLEModuleFunction("sceNetIfhandle", "sceNetSetDropRate") {
		@Override
		public final void execute(Processor processor) {
			sceNetSetDropRate(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetIfhandleModule.sceNetSetDropRate(processor);";
		}
	};
    
};
