package cactus.instructions;

/**
 * Abstract class for all instructions
 * 
 */
public abstract class instruction {
    
    
    /**
     * Instruction Assembly Code
     */
    private String assemblyCode;

    /**
     * Instruction Binary Opcode
     */
    private String binaryOpcode;
    
    /**
     * Method to return the value of assemblyCode
     * 
     * @return String 
     */
    public String getAssemblyCode() {
        return assemblyCode;
    }

    /**
     * Method to return the value of binaryOpcode
     * 
     * @return String 
     */
    public String getBinaryOpcode() {
        return binaryOpcode;
    }

    /**
     * Method to set the value of assemblyCode
     * 
     * @param assemblyCode 
     */
    public void setAssemblyCode(String assemblyCode) {
        this.assemblyCode = assemblyCode;
    }

    /**
     * Method to set the value of assemblyCode
     * 
     * @param binaryOpcode  
     */
    public void setBinaryOpcode(String binaryOpcode) {
        this.binaryOpcode = binaryOpcode;
    }
    
    
}
