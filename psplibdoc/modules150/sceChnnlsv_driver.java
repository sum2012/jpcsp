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

import jpcsp.HLE.Modules;
import jpcsp.HLE.modules.HLEModule;
import jpcsp.HLE.modules.HLEModuleFunction;
import jpcsp.HLE.modules.HLEModuleManager;

import jpcsp.Memory;
import jpcsp.Processor;

import jpcsp.Allegrex.CpuState; // New-Style Processor

public class sceChnnlsv_driver implements HLEModule {
	@Override
	public String getName() { return "sceChnnlsv_driver"; }
	
	@Override
	public void installModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.addFunction(sceSdSetIndexFunction, 0xE7833020);
			mm.addFunction(sceSdRemoveValueFunction, 0xF21A1FCA);
			mm.addFunction(sceSdGetLastIndexFunction, 0xC4C494F8);
			mm.addFunction(sceSdCreateListFunction, 0xABFDFC8B);
			mm.addFunction(sceSdSetMemberFunction, 0x850A7FA1);
			mm.addFunction(sceChnnlsv_driver_21BE78B4Function, 0x21BE78B4);
			
		}
	}
	
	@Override
	public void uninstallModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.removeFunction(sceSdSetIndexFunction);
			mm.removeFunction(sceSdRemoveValueFunction);
			mm.removeFunction(sceSdGetLastIndexFunction);
			mm.removeFunction(sceSdCreateListFunction);
			mm.removeFunction(sceSdSetMemberFunction);
			mm.removeFunction(sceChnnlsv_driver_21BE78B4Function);
			
		}
	}
	
	
	public void sceSdSetIndex(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceSdSetIndex [0xE7833020]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceSdRemoveValue(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceSdRemoveValue [0xF21A1FCA]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceSdGetLastIndex(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceSdGetLastIndex [0xC4C494F8]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceSdCreateList(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceSdCreateList [0xABFDFC8B]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceSdSetMember(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceSdSetMember [0x850A7FA1]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceChnnlsv_driver_21BE78B4(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceChnnlsv_driver_21BE78B4 [0x21BE78B4]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public final HLEModuleFunction sceSdSetIndexFunction = new HLEModuleFunction("sceChnnlsv_driver", "sceSdSetIndex") {
		@Override
		public final void execute(Processor processor) {
			sceSdSetIndex(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceChnnlsv_driverModule.sceSdSetIndex(processor);";
		}
	};
    
	public final HLEModuleFunction sceSdRemoveValueFunction = new HLEModuleFunction("sceChnnlsv_driver", "sceSdRemoveValue") {
		@Override
		public final void execute(Processor processor) {
			sceSdRemoveValue(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceChnnlsv_driverModule.sceSdRemoveValue(processor);";
		}
	};
    
	public final HLEModuleFunction sceSdGetLastIndexFunction = new HLEModuleFunction("sceChnnlsv_driver", "sceSdGetLastIndex") {
		@Override
		public final void execute(Processor processor) {
			sceSdGetLastIndex(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceChnnlsv_driverModule.sceSdGetLastIndex(processor);";
		}
	};
    
	public final HLEModuleFunction sceSdCreateListFunction = new HLEModuleFunction("sceChnnlsv_driver", "sceSdCreateList") {
		@Override
		public final void execute(Processor processor) {
			sceSdCreateList(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceChnnlsv_driverModule.sceSdCreateList(processor);";
		}
	};
    
	public final HLEModuleFunction sceSdSetMemberFunction = new HLEModuleFunction("sceChnnlsv_driver", "sceSdSetMember") {
		@Override
		public final void execute(Processor processor) {
			sceSdSetMember(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceChnnlsv_driverModule.sceSdSetMember(processor);";
		}
	};
    
	public final HLEModuleFunction sceChnnlsv_driver_21BE78B4Function = new HLEModuleFunction("sceChnnlsv_driver", "sceChnnlsv_driver_21BE78B4") {
		@Override
		public final void execute(Processor processor) {
			sceChnnlsv_driver_21BE78B4(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceChnnlsv_driverModule.sceChnnlsv_driver_21BE78B4(processor);";
		}
	};
    
};
