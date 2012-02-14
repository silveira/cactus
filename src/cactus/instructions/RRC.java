package cactus.instructions;

/**
 * Instruction to Rotate Register by Count
 * 
 */
public class RRC extends Instruction {
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "RRC";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "011010";
    
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
