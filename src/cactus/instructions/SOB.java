package cactus.instructions;

import cactus.CentralProcessorUnit;
import cactus.MemoryManagementUnit;

/**
 * Instruction to Subtract One And Branch
 * 
 */
public class SOB extends Instruction {
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "SOB";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "001110";
    
    /**
     * Method to return the assembly code of the instruction
     * @return 
     */
    public static String getAssemblyCode() {
        return assemblyCode;
    }
    
    /**
     * Method to return the value of opcode
     * @return Opcode in binary string
     */
    public static String getOpcode() {
       return opcode; 
    }
    
    /**
     * Execute the instruction
     * @param cpu instance of CentralProcessorUnit to this instruction have access to registers
     */
    public void execute(CentralProcessorUnit cpu){
        MemoryManagementUnit mmu = new MemoryManagementUnit();
        //Set the CPU into the memory instance to give to the memory access to registers
        mmu.setCpu(cpu);
        
        //Get the register number of the Instruction Register
        int ac = Integer.parseInt(cpu.getIr().getContent().substring(8, 9), 2);
        int i = Integer.parseInt(cpu.getIr().getContent().substring(6));
        int ix = Integer.parseInt(cpu.getIr().getContent().substring(7));
        
        //Get the efective address of the Instruction Register
        String add = mmu.calculateEffectiveAddress(cpu.getIr().getContent().substring(10, 15), i, ix);
        
        //Set the value of Register AC as its value - 1
        cpu.getRegister(ac).setContent(
                Integer.toBinaryString(
                    Integer.parseInt(cpu.getRegister(ac).getContent(),2) - 1 //Subtract 1 from the content of AC 
                    )
                );
        
        if(Integer.parseInt(cpu.getRegister(ac).getContent(),2) == 0){
            cpu.getPc().setContent(add);
        }else{
            cpu.incrementPC();
        }
        
    }
}
