package cactus.instructions;

import cactus.CentralProcessorUnit;
import cactus.MemoryManagementUnit;

/**
 * Instruction to Return From Subroutine w/ return code in Immed portion (optional) stored in R0
 * 
 */
public class RFS extends Instruction {
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "RFS";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "001101";
    
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
        
        //Set the Immediate portion into Register R0
        cpu.getRegister(0).setContent(add);
        
        //Get the content of Register R3
        cpu.getMar().setContent(cpu.getRegister(3).getContent());
        
        mmu.getMemoryContent();
        
        //Set the content of R3 into PC
        cpu.getPc().setContent(cpu.getMbr().getContent());
        
    }
    
}
