package cactus.instructions;

/**
 * Instruction to Jump and Save Return Address
 * 
 */
public class JSR extends Instruction {
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "JSR";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "001100";
    
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
