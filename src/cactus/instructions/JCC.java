package cactus.instructions;

/**
 * Instruction to Jump If Condition Code
 * 
 */
public class JCC extends Instruction {
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "JCC";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "001010";
    
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
