package cactus.instructions;

import cactus.Computer;

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
        
        //Set MAR register with the address from instruction
        comp.getCpu().getMar().set(addr);
        
        comp.getMmu().read();
        
        //Get the content from MBR and sum with register AC content and put the result into register AC
        comp.getCpu().getAlu().getOp1().set(comp.getCpu().getRegister(ac).get());
        comp.getCpu().getAlu().getOp2().set(addr);
        
        comp.getCpu().getAlu().addImmed();
        
        comp.getCpu().getRegister(ac).set(comp.getCpu().getAlu().getResult().get());
    }
    
}
