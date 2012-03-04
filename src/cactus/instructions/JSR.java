package cactus.instructions;

import cactus.Computer;

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
    
    /**
     * Execute the instruction
     * @param Computer comp : instance of Computer to this instruction have access to cpu and memory
     */
    public void execute(Computer comp){
        
        //Get the number of the Instruction Register
        int ac = comp.getCpu().getIr().getInt(8, 2);
        //Get the indirect addressing bit
        int i = comp.getCpu().getIr().getInt(6,1);
        //Get the indexing bit
        int ix = comp.getCpu().getIr().getInt(7,1);
        
        //Get the efective address of the Instruction Register
        String addr = comp.getMmu().calculateEffectiveAddress(comp.getCpu().getIr().getString(10, 5), i, ix);
        
        //Save the next instruction into Register R3
        comp.getCpu().getRegister(3).set(comp.getCpu().getPc().getInt()+1);
        
        //Get the content from memory
        comp.getCpu().getMar().set(addr);
        
        comp.getMmu().read();
        
        comp.getCpu().getPc().set(comp.getCpu().getMbr().get());
        
        //Save the argument pointer into the R0
        comp.getCpu().getRegister(0).set(addr);
    }
    
}
