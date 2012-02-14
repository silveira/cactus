package cactus.instructions;

/**
 * Abstract class for all instructions
 * 
 */
public abstract class Instruction {
    
    
    /**
     * Instruction Assembly Code
     */
    private String assemblyCode;

    /**
     * Instruction Opcode
     */
    private String opcode;
    
    /**
     * Method to return the value of assemblyCode
     * 
     * @return String 
     */
    public String getAssemblyCode() {
        return assemblyCode;
    }

    /**
     * Method to return the value of opcode
     * 
     * @return String 
     */
    public String getOpcode() {
        return opcode;
    }

}
