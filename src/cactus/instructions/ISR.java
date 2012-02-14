package cactus.instructions;

/**
 * Instruction to Immediate Subtract  from Register
 * 
 */
public class ISR extends Instruction {
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "ISR";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "000111";
    
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
