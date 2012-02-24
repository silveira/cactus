package cactus.instructions;

import cactus.CentralProcessorUnit;
import cactus.MemoryManagementUnit;

/**
 * Instruction to Store Index Register to Memory
 * 
 */
public class STX extends Instruction{
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "STR";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "100010";
    
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
        
        //Set the content of MBR with the value of Register X0
        cpu.getMbr().setContent(cpu.getX0().getContent());
        
        //Insert into the memory
        mmu.insertMemoryContent();
        
        //Increment PC
        cpu.incrementPC();
        
    }
}
