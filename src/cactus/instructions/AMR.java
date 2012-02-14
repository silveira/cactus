package cactus.instructions;

/**
 * Instruction to Add Memory To Register
 * 
 */
public class AMR extends Instruction {
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "AMR";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "000100";

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
