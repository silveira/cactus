package cactus.instructions;

/**
 * Instruction to Logical And of Register and Register
 * 
 */
public class AND extends Instruction {
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "AND";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "010011";
 
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
