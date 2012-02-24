package cactus.instructions;

import cactus.CentralProcessorUnit;
import cactus.MemoryManagementUnit;

/**
 * Instruction to Store Register To Memory
 * 
 */
public class STR extends Instruction{
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "STR";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "000010";
    
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
        
        //Set the content of MBR with the value of Register
        cpu.getMbr().setContent(cpu.getRegister(ac).getContent());
        
        //Insert into the memory
        mmu.insertMemoryContent();
        
        //Increment PC
        cpu.incrementPC();
        
    }
}
