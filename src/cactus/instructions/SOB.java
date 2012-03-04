package cactus.instructions;

import cactus.Computer;

/**
 * Instruction to Subtract One And Branch
 * 
 */
public class SOB extends Instruction {
    
    /**
     * Instruction Assembly Code
     */
    private static final String assemblyCode = "SOB";

    /**
     * Instruction Binary Opcode
     */
    private static final String opcode = "001110";
    
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
        
        //Get the register AC's content from memory
        comp.getCpu().getMar().set(addr);
        
        comp.getMmu().read();
        
        //Subtract one from register 
        comp.getCpu().getRegister(ac).set(comp.getCpu().getMbr().getInt() - 1);
        
        if(comp.getCpu().getRegister(ac).getInt() > 0 ){
            comp.getCpu().getPc().set(addr);
        }else{
            comp.getCpu().incrementPC();
        }
        
    }
    
}
