package cactus.instructions;

/**
 * Instruction to Multiply Register by Register
 * 
 */
public class MUL extends Instruction {
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "MUL";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "010000";
    
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
