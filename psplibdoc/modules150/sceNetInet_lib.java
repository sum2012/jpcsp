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

public class sceNetInet_lib implements HLEModule {
	@Override
	public String getName() { return "sceNetInet_lib"; }
	
	@Override
	public void installModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.addFunction(sceNetInet_lib_6A046357Function, 0x6A046357);
			mm.addFunction(sceNetInet_lib_5155EC8AFunction, 0x5155EC8A);
			mm.addFunction(sceNetInet_lib_4F68DB0EFunction, 0x4F68DB0E);
			mm.addFunction(sceNetInet_lib_4459EAAFFunction, 0x4459EAAF);
			mm.addFunction(sceNetInet_lib_EB7A7E4FFunction, 0xEB7A7E4F);
			mm.addFunction(sceNetInet_lib_7776A492Function, 0x7776A492);
			mm.addFunction(sceNetInet_lib_8FE19FC4Function, 0x8FE19FC4);
			mm.addFunction(sceNetInet_lib_3FDDB0BAFunction, 0x3FDDB0BA);
			mm.addFunction(sceNetInet_lib_E6F67D14Function, 0xE6F67D14);
			mm.addFunction(sceNetInet_lib_3D905F34Function, 0x3D905F34);
			mm.addFunction(sceNetInet_lib_59561561Function, 0x59561561);
			mm.addFunction(sceNetInet_lib_DC38FEE9Function, 0xDC38FEE9);
			mm.addFunction(sceNetInet_lib_DE9E5174Function, 0xDE9E5174);
			mm.addFunction(sceNetInet_lib_824CBC6DFunction, 0x824CBC6D);
			mm.addFunction(sceNetInet_lib_AC9D90A5Function, 0xAC9D90A5);
			mm.addFunction(sceNetInet_lib_AAF4895AFunction, 0xAAF4895A);
			mm.addFunction(sceNetInet_lib_AEE60F84Function, 0xAEE60F84);
			mm.addFunction(sceNetInet_lib_B3FF98EBFunction, 0xB3FF98EB);
			mm.addFunction(sceNetInet_lib_7CB1D9E3Function, 0x7CB1D9E3);
			mm.addFunction(sceNetInet_lib_4C13BE10Function, 0x4C13BE10);
			mm.addFunction(sceNetInet_lib_D7928A6DFunction, 0xD7928A6D);
			mm.addFunction(sceNetInet_lib_2595064CFunction, 0x2595064C);
			
		}
	}
	
	@Override
	public void uninstallModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.removeFunction(sceNetInet_lib_6A046357Function);
			mm.removeFunction(sceNetInet_lib_5155EC8AFunction);
			mm.removeFunction(sceNetInet_lib_4F68DB0EFunction);
			mm.removeFunction(sceNetInet_lib_4459EAAFFunction);
			mm.removeFunction(sceNetInet_lib_EB7A7E4FFunction);
			mm.removeFunction(sceNetInet_lib_7776A492Function);
			mm.removeFunction(sceNetInet_lib_8FE19FC4Function);
			mm.removeFunction(sceNetInet_lib_3FDDB0BAFunction);
			mm.removeFunction(sceNetInet_lib_E6F67D14Function);
			mm.removeFunction(sceNetInet_lib_3D905F34Function);
			mm.removeFunction(sceNetInet_lib_59561561Function);
			mm.removeFunction(sceNetInet_lib_DC38FEE9Function);
			mm.removeFunction(sceNetInet_lib_DE9E5174Function);
			mm.removeFunction(sceNetInet_lib_824CBC6DFunction);
			mm.removeFunction(sceNetInet_lib_AC9D90A5Function);
			mm.removeFunction(sceNetInet_lib_AAF4895AFunction);
			mm.removeFunction(sceNetInet_lib_AEE60F84Function);
			mm.removeFunction(sceNetInet_lib_B3FF98EBFunction);
			mm.removeFunction(sceNetInet_lib_7CB1D9E3Function);
			mm.removeFunction(sceNetInet_lib_4C13BE10Function);
			mm.removeFunction(sceNetInet_lib_D7928A6DFunction);
			mm.removeFunction(sceNetInet_lib_2595064CFunction);
			
		}
	}
	
	
	public void sceNetInet_lib_6A046357(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_6A046357 [0x6A046357]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_5155EC8A(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_5155EC8A [0x5155EC8A]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_4F68DB0E(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_4F68DB0E [0x4F68DB0E]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_4459EAAF(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_4459EAAF [0x4459EAAF]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_EB7A7E4F(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_EB7A7E4F [0xEB7A7E4F]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_7776A492(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_7776A492 [0x7776A492]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_8FE19FC4(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_8FE19FC4 [0x8FE19FC4]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_3FDDB0BA(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_3FDDB0BA [0x3FDDB0BA]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_E6F67D14(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_E6F67D14 [0xE6F67D14]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_3D905F34(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_3D905F34 [0x3D905F34]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_59561561(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_59561561 [0x59561561]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_DC38FEE9(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_DC38FEE9 [0xDC38FEE9]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_DE9E5174(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_DE9E5174 [0xDE9E5174]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_824CBC6D(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_824CBC6D [0x824CBC6D]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_AC9D90A5(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_AC9D90A5 [0xAC9D90A5]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_AAF4895A(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_AAF4895A [0xAAF4895A]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_AEE60F84(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_AEE60F84 [0xAEE60F84]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_B3FF98EB(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_B3FF98EB [0xB3FF98EB]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_7CB1D9E3(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_7CB1D9E3 [0x7CB1D9E3]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_4C13BE10(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_4C13BE10 [0x4C13BE10]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_D7928A6D(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_D7928A6D [0xD7928A6D]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceNetInet_lib_2595064C(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceNetInet_lib_2595064C [0x2595064C]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public final HLEModuleFunction sceNetInet_lib_6A046357Function = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_6A046357") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_6A046357(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_6A046357(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_5155EC8AFunction = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_5155EC8A") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_5155EC8A(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_5155EC8A(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_4F68DB0EFunction = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_4F68DB0E") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_4F68DB0E(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_4F68DB0E(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_4459EAAFFunction = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_4459EAAF") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_4459EAAF(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_4459EAAF(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_EB7A7E4FFunction = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_EB7A7E4F") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_EB7A7E4F(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_EB7A7E4F(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_7776A492Function = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_7776A492") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_7776A492(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_7776A492(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_8FE19FC4Function = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_8FE19FC4") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_8FE19FC4(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_8FE19FC4(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_3FDDB0BAFunction = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_3FDDB0BA") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_3FDDB0BA(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_3FDDB0BA(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_E6F67D14Function = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_E6F67D14") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_E6F67D14(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_E6F67D14(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_3D905F34Function = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_3D905F34") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_3D905F34(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_3D905F34(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_59561561Function = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_59561561") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_59561561(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_59561561(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_DC38FEE9Function = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_DC38FEE9") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_DC38FEE9(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_DC38FEE9(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_DE9E5174Function = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_DE9E5174") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_DE9E5174(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_DE9E5174(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_824CBC6DFunction = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_824CBC6D") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_824CBC6D(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_824CBC6D(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_AC9D90A5Function = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_AC9D90A5") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_AC9D90A5(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_AC9D90A5(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_AAF4895AFunction = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_AAF4895A") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_AAF4895A(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_AAF4895A(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_AEE60F84Function = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_AEE60F84") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_AEE60F84(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_AEE60F84(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_B3FF98EBFunction = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_B3FF98EB") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_B3FF98EB(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_B3FF98EB(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_7CB1D9E3Function = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_7CB1D9E3") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_7CB1D9E3(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_7CB1D9E3(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_4C13BE10Function = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_4C13BE10") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_4C13BE10(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_4C13BE10(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_D7928A6DFunction = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_D7928A6D") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_D7928A6D(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_D7928A6D(processor);";
		}
	};
    
	public final HLEModuleFunction sceNetInet_lib_2595064CFunction = new HLEModuleFunction("sceNetInet_lib", "sceNetInet_lib_2595064C") {
		@Override
		public final void execute(Processor processor) {
			sceNetInet_lib_2595064C(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceNetInet_libModule.sceNetInet_lib_2595064C(processor);";
		}
	};
    
};
