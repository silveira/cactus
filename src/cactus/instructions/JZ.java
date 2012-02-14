package cactus.instructions;

/**
 * Instruction to Jump If Zero
 * 
 */
public class JZ extends Instruction {
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "JZ";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "001000";
    
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
