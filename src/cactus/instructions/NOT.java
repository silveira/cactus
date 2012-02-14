package cactus.instructions;

/**
 * Instruction to Logical Not of Register To Register
 * 
 */
public class NOT extends Instruction {
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "NOT";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "010101";
    
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
