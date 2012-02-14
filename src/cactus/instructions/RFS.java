package cactus.instructions;

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
}
