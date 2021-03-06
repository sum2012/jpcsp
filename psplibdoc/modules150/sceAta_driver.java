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

public class sceAta_driver implements HLEModule {
	@Override
	public String getName() { return "sceAta_driver"; }
	
	@Override
	public void installModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.addFunction(sceAta_driver_4222D6F3Function, 0x4222D6F3);
			mm.addFunction(sceAta_driver_4D225674Function, 0x4D225674);
			mm.addFunction(sceAtaAhbSetAtaBlockFunction, 0xAE100256);
			mm.addFunction(sceAtaAhbEnableIntrFunction, 0x7DE9E14A);
			mm.addFunction(sceAtaAhbSetupBusFunction, 0x12805193);
			mm.addFunction(sceAta_driver_F61EAFC0Function, 0xF61EAFC0);
			mm.addFunction(sceAta_driver_76C0923DFunction, 0x76C0923D);
			mm.addFunction(sceAta_driver_E3E1EED7Function, 0xE3E1EED7);
			mm.addFunction(sceAta_driver_0B53CAD8Function, 0x0B53CAD8);
			mm.addFunction(sceAtaExecPacketCmdFunction, 0xC74F04B7);
			mm.addFunction(sceAtaExecPacketCmdIEFunction, 0xBDD30DEE);
			mm.addFunction(sceAtaExecSetFeaturesCmdFunction, 0x010F750B);
			mm.addFunction(sceAtaGetIntrStateFlagFunction, 0x1C29566B);
			mm.addFunction(sceAtaSetIntrStateFlagFunction, 0x7F551D66);
			mm.addFunction(sceAtaClearIntrStateFlagFunction, 0x68DEA2FF);
			mm.addFunction(sceAtaEnableClkIoFunction, 0xD1E6E175);
			mm.addFunction(sceAtaDisableClkIoFunction, 0xAC800B1D);
			mm.addFunction(sceAtaStartFunction, 0xC8BC8B83);
			mm.addFunction(sceAtaStopFunction, 0xCDC50BF0);
			mm.addFunction(sceAtaGetAtaDriveFunction, 0x52D9A4CA);
			mm.addFunction(sceAtaSetupAtaBlockFunction, 0xEBB91566);
			mm.addFunction(sceAtaWaitBusBusy1Function, 0x6C58F096);
			mm.addFunction(sceAtaWaitBusBusy2Function, 0xC21318E6);
			mm.addFunction(sceAtaWaitBusBusyIEFunction, 0xA77C230B);
			mm.addFunction(sceAtaSelectDeviceFunction, 0x3AA3FA39);
			mm.addFunction(sceAta_driver_ACCEE63FFunction, 0xACCEE63F);
			mm.addFunction(sceAtaScanDeviceFunction, 0x6E639701);
			mm.addFunction(sceAtaCheckDeviceReadyFunction, 0xB863FD83);
			mm.addFunction(sceAtaAccessDataPortFunction, 0xB6BED47E);
			mm.addFunction(sceAtaAccessDataPortIEFunction, 0x6DE1C65F);
			mm.addFunction(sceAta_driver_84E14690Function, 0x84E14690);
			mm.addFunction(sceAta_driver_C7B02795Function, 0xC7B02795);
			mm.addFunction(sceAta_driver_1F05F48CFunction, 0x1F05F48C);
			mm.addFunction(sceAta_driver_BA09142AFunction, 0xBA09142A);
			mm.addFunction(sceAtaSetDeviceIntrFunction, 0x1C8DA2FD);
			mm.addFunction(sceAta_driver_2AE26E08Function, 0x2AE26E08);
			mm.addFunction(sceAtaSetBusErrorIntrFunction, 0x9D98086E);
			mm.addFunction(sceAta_driver_689FCB7DFunction, 0x689FCB7D);
			mm.addFunction(sceAta_driver_C144826EFunction, 0xC144826E);
			mm.addFunction(sceAtaGetAtaCallBackFunction, 0xFCF939D9);
			mm.addFunction(sceAtaGetDriveStatFunction, 0x9AE67E14);
			mm.addFunction(sceAtaSetDriveStatFunction, 0x110D3739);
			mm.addFunction(sceAtaClearDriveStatFunction, 0x7BBA095C);
			mm.addFunction(sceAtaIsNormalDriveStatFunction, 0x3A61BF97);
			mm.addFunction(sceAta_driver_ACFF7CB5Function, 0xACFF7CB5);
			mm.addFunction(sceAtaGetIntrFlagFunction, 0xD8E525CB);
			mm.addFunction(sceAtaSetIntrFlagFunction, 0xB7F5B2CA);
			mm.addFunction(sceAta_driver_638EEA14Function, 0x638EEA14);
			mm.addFunction(sceAta_driver_B5982381Function, 0xB5982381);
			mm.addFunction(sceAta_driver_7C6B31D8Function, 0x7C6B31D8);
			mm.addFunction(sceAta_driver_6FD8E2ABFunction, 0x6FD8E2AB);
			mm.addFunction(sceAta_driver_BE07B3A7Function, 0xBE07B3A7);
			mm.addFunction(sceAtaIsUmdDriveFunction, 0xDCC8A89E);
			mm.addFunction(sceAtaIsDvdDriveFunction, 0x6FC42083);
			
		}
	}
	
	@Override
	public void uninstallModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.removeFunction(sceAta_driver_4222D6F3Function);
			mm.removeFunction(sceAta_driver_4D225674Function);
			mm.removeFunction(sceAtaAhbSetAtaBlockFunction);
			mm.removeFunction(sceAtaAhbEnableIntrFunction);
			mm.removeFunction(sceAtaAhbSetupBusFunction);
			mm.removeFunction(sceAta_driver_F61EAFC0Function);
			mm.removeFunction(sceAta_driver_76C0923DFunction);
			mm.removeFunction(sceAta_driver_E3E1EED7Function);
			mm.removeFunction(sceAta_driver_0B53CAD8Function);
			mm.removeFunction(sceAtaExecPacketCmdFunction);
			mm.removeFunction(sceAtaExecPacketCmdIEFunction);
			mm.removeFunction(sceAtaExecSetFeaturesCmdFunction);
			mm.removeFunction(sceAtaGetIntrStateFlagFunction);
			mm.removeFunction(sceAtaSetIntrStateFlagFunction);
			mm.removeFunction(sceAtaClearIntrStateFlagFunction);
			mm.removeFunction(sceAtaEnableClkIoFunction);
			mm.removeFunction(sceAtaDisableClkIoFunction);
			mm.removeFunction(sceAtaStartFunction);
			mm.removeFunction(sceAtaStopFunction);
			mm.removeFunction(sceAtaGetAtaDriveFunction);
			mm.removeFunction(sceAtaSetupAtaBlockFunction);
			mm.removeFunction(sceAtaWaitBusBusy1Function);
			mm.removeFunction(sceAtaWaitBusBusy2Function);
			mm.removeFunction(sceAtaWaitBusBusyIEFunction);
			mm.removeFunction(sceAtaSelectDeviceFunction);
			mm.removeFunction(sceAta_driver_ACCEE63FFunction);
			mm.removeFunction(sceAtaScanDeviceFunction);
			mm.removeFunction(sceAtaCheckDeviceReadyFunction);
			mm.removeFunction(sceAtaAccessDataPortFunction);
			mm.removeFunction(sceAtaAccessDataPortIEFunction);
			mm.removeFunction(sceAta_driver_84E14690Function);
			mm.removeFunction(sceAta_driver_C7B02795Function);
			mm.removeFunction(sceAta_driver_1F05F48CFunction);
			mm.removeFunction(sceAta_driver_BA09142AFunction);
			mm.removeFunction(sceAtaSetDeviceIntrFunction);
			mm.removeFunction(sceAta_driver_2AE26E08Function);
			mm.removeFunction(sceAtaSetBusErrorIntrFunction);
			mm.removeFunction(sceAta_driver_689FCB7DFunction);
			mm.removeFunction(sceAta_driver_C144826EFunction);
			mm.removeFunction(sceAtaGetAtaCallBackFunction);
			mm.removeFunction(sceAtaGetDriveStatFunction);
			mm.removeFunction(sceAtaSetDriveStatFunction);
			mm.removeFunction(sceAtaClearDriveStatFunction);
			mm.removeFunction(sceAtaIsNormalDriveStatFunction);
			mm.removeFunction(sceAta_driver_ACFF7CB5Function);
			mm.removeFunction(sceAtaGetIntrFlagFunction);
			mm.removeFunction(sceAtaSetIntrFlagFunction);
			mm.removeFunction(sceAta_driver_638EEA14Function);
			mm.removeFunction(sceAta_driver_B5982381Function);
			mm.removeFunction(sceAta_driver_7C6B31D8Function);
			mm.removeFunction(sceAta_driver_6FD8E2ABFunction);
			mm.removeFunction(sceAta_driver_BE07B3A7Function);
			mm.removeFunction(sceAtaIsUmdDriveFunction);
			mm.removeFunction(sceAtaIsDvdDriveFunction);
			
		}
	}
	
	
	public void sceAta_driver_4222D6F3(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_4222D6F3 [0x4222D6F3]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_4D225674(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_4D225674 [0x4D225674]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaAhbSetAtaBlock(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaAhbSetAtaBlock [0xAE100256]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaAhbEnableIntr(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaAhbEnableIntr [0x7DE9E14A]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaAhbSetupBus(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaAhbSetupBus [0x12805193]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_F61EAFC0(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_F61EAFC0 [0xF61EAFC0]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_76C0923D(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_76C0923D [0x76C0923D]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_E3E1EED7(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_E3E1EED7 [0xE3E1EED7]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_0B53CAD8(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_0B53CAD8 [0x0B53CAD8]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaExecPacketCmd(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaExecPacketCmd [0xC74F04B7]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaExecPacketCmdIE(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaExecPacketCmdIE [0xBDD30DEE]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaExecSetFeaturesCmd(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaExecSetFeaturesCmd [0x010F750B]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaGetIntrStateFlag(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaGetIntrStateFlag [0x1C29566B]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaSetIntrStateFlag(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaSetIntrStateFlag [0x7F551D66]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaClearIntrStateFlag(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaClearIntrStateFlag [0x68DEA2FF]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaEnableClkIo(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaEnableClkIo [0xD1E6E175]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaDisableClkIo(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaDisableClkIo [0xAC800B1D]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaStart(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaStart [0xC8BC8B83]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaStop(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaStop [0xCDC50BF0]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaGetAtaDrive(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaGetAtaDrive [0x52D9A4CA]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaSetupAtaBlock(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaSetupAtaBlock [0xEBB91566]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaWaitBusBusy1(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaWaitBusBusy1 [0x6C58F096]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaWaitBusBusy2(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaWaitBusBusy2 [0xC21318E6]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaWaitBusBusyIE(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaWaitBusBusyIE [0xA77C230B]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaSelectDevice(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaSelectDevice [0x3AA3FA39]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_ACCEE63F(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_ACCEE63F [0xACCEE63F]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaScanDevice(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaScanDevice [0x6E639701]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaCheckDeviceReady(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaCheckDeviceReady [0xB863FD83]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaAccessDataPort(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaAccessDataPort [0xB6BED47E]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaAccessDataPortIE(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaAccessDataPortIE [0x6DE1C65F]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_84E14690(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_84E14690 [0x84E14690]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_C7B02795(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_C7B02795 [0xC7B02795]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_1F05F48C(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_1F05F48C [0x1F05F48C]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_BA09142A(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_BA09142A [0xBA09142A]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaSetDeviceIntr(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaSetDeviceIntr [0x1C8DA2FD]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_2AE26E08(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_2AE26E08 [0x2AE26E08]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaSetBusErrorIntr(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaSetBusErrorIntr [0x9D98086E]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_689FCB7D(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_689FCB7D [0x689FCB7D]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_C144826E(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_C144826E [0xC144826E]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaGetAtaCallBack(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaGetAtaCallBack [0xFCF939D9]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaGetDriveStat(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaGetDriveStat [0x9AE67E14]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaSetDriveStat(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaSetDriveStat [0x110D3739]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaClearDriveStat(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaClearDriveStat [0x7BBA095C]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaIsNormalDriveStat(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaIsNormalDriveStat [0x3A61BF97]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_ACFF7CB5(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_ACFF7CB5 [0xACFF7CB5]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaGetIntrFlag(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaGetIntrFlag [0xD8E525CB]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaSetIntrFlag(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaSetIntrFlag [0xB7F5B2CA]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_638EEA14(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_638EEA14 [0x638EEA14]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_B5982381(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_B5982381 [0xB5982381]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_7C6B31D8(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_7C6B31D8 [0x7C6B31D8]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_6FD8E2AB(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_6FD8E2AB [0x6FD8E2AB]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAta_driver_BE07B3A7(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAta_driver_BE07B3A7 [0xBE07B3A7]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaIsUmdDrive(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaIsUmdDrive [0xDCC8A89E]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceAtaIsDvdDrive(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceAtaIsDvdDrive [0x6FC42083]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public final HLEModuleFunction sceAta_driver_4222D6F3Function = new HLEModuleFunction("sceAta_driver", "sceAta_driver_4222D6F3") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_4222D6F3(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_4222D6F3(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_4D225674Function = new HLEModuleFunction("sceAta_driver", "sceAta_driver_4D225674") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_4D225674(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_4D225674(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaAhbSetAtaBlockFunction = new HLEModuleFunction("sceAta_driver", "sceAtaAhbSetAtaBlock") {
		@Override
		public final void execute(Processor processor) {
			sceAtaAhbSetAtaBlock(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaAhbSetAtaBlock(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaAhbEnableIntrFunction = new HLEModuleFunction("sceAta_driver", "sceAtaAhbEnableIntr") {
		@Override
		public final void execute(Processor processor) {
			sceAtaAhbEnableIntr(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaAhbEnableIntr(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaAhbSetupBusFunction = new HLEModuleFunction("sceAta_driver", "sceAtaAhbSetupBus") {
		@Override
		public final void execute(Processor processor) {
			sceAtaAhbSetupBus(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaAhbSetupBus(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_F61EAFC0Function = new HLEModuleFunction("sceAta_driver", "sceAta_driver_F61EAFC0") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_F61EAFC0(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_F61EAFC0(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_76C0923DFunction = new HLEModuleFunction("sceAta_driver", "sceAta_driver_76C0923D") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_76C0923D(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_76C0923D(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_E3E1EED7Function = new HLEModuleFunction("sceAta_driver", "sceAta_driver_E3E1EED7") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_E3E1EED7(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_E3E1EED7(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_0B53CAD8Function = new HLEModuleFunction("sceAta_driver", "sceAta_driver_0B53CAD8") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_0B53CAD8(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_0B53CAD8(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaExecPacketCmdFunction = new HLEModuleFunction("sceAta_driver", "sceAtaExecPacketCmd") {
		@Override
		public final void execute(Processor processor) {
			sceAtaExecPacketCmd(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaExecPacketCmd(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaExecPacketCmdIEFunction = new HLEModuleFunction("sceAta_driver", "sceAtaExecPacketCmdIE") {
		@Override
		public final void execute(Processor processor) {
			sceAtaExecPacketCmdIE(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaExecPacketCmdIE(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaExecSetFeaturesCmdFunction = new HLEModuleFunction("sceAta_driver", "sceAtaExecSetFeaturesCmd") {
		@Override
		public final void execute(Processor processor) {
			sceAtaExecSetFeaturesCmd(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaExecSetFeaturesCmd(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaGetIntrStateFlagFunction = new HLEModuleFunction("sceAta_driver", "sceAtaGetIntrStateFlag") {
		@Override
		public final void execute(Processor processor) {
			sceAtaGetIntrStateFlag(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaGetIntrStateFlag(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaSetIntrStateFlagFunction = new HLEModuleFunction("sceAta_driver", "sceAtaSetIntrStateFlag") {
		@Override
		public final void execute(Processor processor) {
			sceAtaSetIntrStateFlag(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaSetIntrStateFlag(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaClearIntrStateFlagFunction = new HLEModuleFunction("sceAta_driver", "sceAtaClearIntrStateFlag") {
		@Override
		public final void execute(Processor processor) {
			sceAtaClearIntrStateFlag(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaClearIntrStateFlag(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaEnableClkIoFunction = new HLEModuleFunction("sceAta_driver", "sceAtaEnableClkIo") {
		@Override
		public final void execute(Processor processor) {
			sceAtaEnableClkIo(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaEnableClkIo(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaDisableClkIoFunction = new HLEModuleFunction("sceAta_driver", "sceAtaDisableClkIo") {
		@Override
		public final void execute(Processor processor) {
			sceAtaDisableClkIo(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaDisableClkIo(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaStartFunction = new HLEModuleFunction("sceAta_driver", "sceAtaStart") {
		@Override
		public final void execute(Processor processor) {
			sceAtaStart(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaStart(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaStopFunction = new HLEModuleFunction("sceAta_driver", "sceAtaStop") {
		@Override
		public final void execute(Processor processor) {
			sceAtaStop(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaStop(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaGetAtaDriveFunction = new HLEModuleFunction("sceAta_driver", "sceAtaGetAtaDrive") {
		@Override
		public final void execute(Processor processor) {
			sceAtaGetAtaDrive(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaGetAtaDrive(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaSetupAtaBlockFunction = new HLEModuleFunction("sceAta_driver", "sceAtaSetupAtaBlock") {
		@Override
		public final void execute(Processor processor) {
			sceAtaSetupAtaBlock(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaSetupAtaBlock(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaWaitBusBusy1Function = new HLEModuleFunction("sceAta_driver", "sceAtaWaitBusBusy1") {
		@Override
		public final void execute(Processor processor) {
			sceAtaWaitBusBusy1(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaWaitBusBusy1(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaWaitBusBusy2Function = new HLEModuleFunction("sceAta_driver", "sceAtaWaitBusBusy2") {
		@Override
		public final void execute(Processor processor) {
			sceAtaWaitBusBusy2(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaWaitBusBusy2(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaWaitBusBusyIEFunction = new HLEModuleFunction("sceAta_driver", "sceAtaWaitBusBusyIE") {
		@Override
		public final void execute(Processor processor) {
			sceAtaWaitBusBusyIE(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaWaitBusBusyIE(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaSelectDeviceFunction = new HLEModuleFunction("sceAta_driver", "sceAtaSelectDevice") {
		@Override
		public final void execute(Processor processor) {
			sceAtaSelectDevice(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaSelectDevice(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_ACCEE63FFunction = new HLEModuleFunction("sceAta_driver", "sceAta_driver_ACCEE63F") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_ACCEE63F(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_ACCEE63F(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaScanDeviceFunction = new HLEModuleFunction("sceAta_driver", "sceAtaScanDevice") {
		@Override
		public final void execute(Processor processor) {
			sceAtaScanDevice(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaScanDevice(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaCheckDeviceReadyFunction = new HLEModuleFunction("sceAta_driver", "sceAtaCheckDeviceReady") {
		@Override
		public final void execute(Processor processor) {
			sceAtaCheckDeviceReady(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaCheckDeviceReady(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaAccessDataPortFunction = new HLEModuleFunction("sceAta_driver", "sceAtaAccessDataPort") {
		@Override
		public final void execute(Processor processor) {
			sceAtaAccessDataPort(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaAccessDataPort(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaAccessDataPortIEFunction = new HLEModuleFunction("sceAta_driver", "sceAtaAccessDataPortIE") {
		@Override
		public final void execute(Processor processor) {
			sceAtaAccessDataPortIE(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaAccessDataPortIE(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_84E14690Function = new HLEModuleFunction("sceAta_driver", "sceAta_driver_84E14690") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_84E14690(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_84E14690(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_C7B02795Function = new HLEModuleFunction("sceAta_driver", "sceAta_driver_C7B02795") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_C7B02795(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_C7B02795(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_1F05F48CFunction = new HLEModuleFunction("sceAta_driver", "sceAta_driver_1F05F48C") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_1F05F48C(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_1F05F48C(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_BA09142AFunction = new HLEModuleFunction("sceAta_driver", "sceAta_driver_BA09142A") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_BA09142A(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_BA09142A(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaSetDeviceIntrFunction = new HLEModuleFunction("sceAta_driver", "sceAtaSetDeviceIntr") {
		@Override
		public final void execute(Processor processor) {
			sceAtaSetDeviceIntr(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaSetDeviceIntr(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_2AE26E08Function = new HLEModuleFunction("sceAta_driver", "sceAta_driver_2AE26E08") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_2AE26E08(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_2AE26E08(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaSetBusErrorIntrFunction = new HLEModuleFunction("sceAta_driver", "sceAtaSetBusErrorIntr") {
		@Override
		public final void execute(Processor processor) {
			sceAtaSetBusErrorIntr(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaSetBusErrorIntr(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_689FCB7DFunction = new HLEModuleFunction("sceAta_driver", "sceAta_driver_689FCB7D") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_689FCB7D(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_689FCB7D(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_C144826EFunction = new HLEModuleFunction("sceAta_driver", "sceAta_driver_C144826E") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_C144826E(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_C144826E(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaGetAtaCallBackFunction = new HLEModuleFunction("sceAta_driver", "sceAtaGetAtaCallBack") {
		@Override
		public final void execute(Processor processor) {
			sceAtaGetAtaCallBack(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaGetAtaCallBack(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaGetDriveStatFunction = new HLEModuleFunction("sceAta_driver", "sceAtaGetDriveStat") {
		@Override
		public final void execute(Processor processor) {
			sceAtaGetDriveStat(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaGetDriveStat(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaSetDriveStatFunction = new HLEModuleFunction("sceAta_driver", "sceAtaSetDriveStat") {
		@Override
		public final void execute(Processor processor) {
			sceAtaSetDriveStat(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaSetDriveStat(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaClearDriveStatFunction = new HLEModuleFunction("sceAta_driver", "sceAtaClearDriveStat") {
		@Override
		public final void execute(Processor processor) {
			sceAtaClearDriveStat(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaClearDriveStat(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaIsNormalDriveStatFunction = new HLEModuleFunction("sceAta_driver", "sceAtaIsNormalDriveStat") {
		@Override
		public final void execute(Processor processor) {
			sceAtaIsNormalDriveStat(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaIsNormalDriveStat(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_ACFF7CB5Function = new HLEModuleFunction("sceAta_driver", "sceAta_driver_ACFF7CB5") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_ACFF7CB5(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_ACFF7CB5(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaGetIntrFlagFunction = new HLEModuleFunction("sceAta_driver", "sceAtaGetIntrFlag") {
		@Override
		public final void execute(Processor processor) {
			sceAtaGetIntrFlag(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaGetIntrFlag(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaSetIntrFlagFunction = new HLEModuleFunction("sceAta_driver", "sceAtaSetIntrFlag") {
		@Override
		public final void execute(Processor processor) {
			sceAtaSetIntrFlag(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaSetIntrFlag(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_638EEA14Function = new HLEModuleFunction("sceAta_driver", "sceAta_driver_638EEA14") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_638EEA14(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_638EEA14(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_B5982381Function = new HLEModuleFunction("sceAta_driver", "sceAta_driver_B5982381") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_B5982381(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_B5982381(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_7C6B31D8Function = new HLEModuleFunction("sceAta_driver", "sceAta_driver_7C6B31D8") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_7C6B31D8(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_7C6B31D8(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_6FD8E2ABFunction = new HLEModuleFunction("sceAta_driver", "sceAta_driver_6FD8E2AB") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_6FD8E2AB(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_6FD8E2AB(processor);";
		}
	};
    
	public final HLEModuleFunction sceAta_driver_BE07B3A7Function = new HLEModuleFunction("sceAta_driver", "sceAta_driver_BE07B3A7") {
		@Override
		public final void execute(Processor processor) {
			sceAta_driver_BE07B3A7(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAta_driver_BE07B3A7(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaIsUmdDriveFunction = new HLEModuleFunction("sceAta_driver", "sceAtaIsUmdDrive") {
		@Override
		public final void execute(Processor processor) {
			sceAtaIsUmdDrive(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaIsUmdDrive(processor);";
		}
	};
    
	public final HLEModuleFunction sceAtaIsDvdDriveFunction = new HLEModuleFunction("sceAta_driver", "sceAtaIsDvdDrive") {
		@Override
		public final void execute(Processor processor) {
			sceAtaIsDvdDrive(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceAta_driverModule.sceAtaIsDvdDrive(processor);";
		}
	};
    
};
