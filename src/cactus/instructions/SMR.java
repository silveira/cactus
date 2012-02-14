package cactus.instructions;

/**
 * Instruction to Subtract Memory From Register
 * 
 */
public class SMR extends Instruction {
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "SMR";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "000101";
    
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
