package cactus.instructions;

/**
 * Instruction to Load Index Register from Memory
 * 
 */
public class LDX extends Instruction{
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "LDX";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "100001";
    
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
