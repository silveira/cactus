package cactus.instructions;

/**
 * Instruction to Test the Equality of Register and Register
 * 
 */
public class TST extends Instruction {
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "TST";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "010010";
    
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
