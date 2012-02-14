package cactus.instructions;

/**
 * Instruction to Logical Or of Register and Register
 * 
 */
public class OR extends Instruction {
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "OR";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "010100";
    
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
