package cactus.instructions;

/**
 * Abstract class for all instructions
 * 
 */
public abstract class Instruction {
    
    
    /**
     * Instruction Assembly Code
     */
    private static String assemblyCode;

    /**
     * Instruction Opcode
     */
    private static String opcode;
    
    /**
     * Method to return the value of assemblyCode
     * 
     * @return String 
     */
    public static String getAssemblyCode() {
        return assemblyCode;
    }

    /**
     * Method to return the value of opcode
     * 
     * @return String 
     */
    public static String getOpcode() {
        return opcode;
    }

}
