package cactus.instructions;

import cactus.Computer;

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
        
        //Save the immediate into the R0
        comp.getCpu().getRegister(0).set(addr);
        
        //Put the R3 content into the PC
        comp.getCpu().getMar().set(comp.getCpu().getRegister(3).get());
        
        comp.getMmu().read();
        
        comp.getCpu().getPc().set(comp.getCpu().getMbr().get());
    }
    
}
