package cactus.instructions;

import cactus.CentralProcessorUnit;
import cactus.Computer;
import cactus.MemoryManagementUnit;

/**
 * Instruction to Load Index Register from Memory
 * 
 */
public class LDX extends Instruction{
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "LDX";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "100001";
    
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
     * @param Computer comp : instance of Computer to this instruction have access to cpu and memory
     */
    public void execute(Computer comp){
        
        //Get the number of the Instruction Register
        int ac = comp.getCpu().getIr().getInt(8, 2);
        //Get the indirect addressing bit
        int i = comp.getCpu().getIr().getInt(6,1);
        //Get the indexing bit
        int ix = comp.getCpu().getIr().getInt(7,1);
        
        //Get the efective address of the Instruction Register
        String addr = comp.getMmu().calculateEffectiveAddress(comp.getCpu().getIr().getString(10, 5), i, ix);
        
        //Set the value of X0 with the Effective Address
        comp.getCpu().getX0().set(addr);
    }
}
