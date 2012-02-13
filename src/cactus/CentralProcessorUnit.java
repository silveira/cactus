package cactus;

/**
 * Central Processor Unit of a computer, where most of processor activities 
 * takes place.
 */
public class CentralProcessorUnit implements Unit {
    /* Units */
    
    /**
     * CPU's Control Unit (CU) 
     */
    private ControlUnit cu;
    
    /**
     * CPU's Memory Unit (MU)
     */
    private MemoryUnit mu;
    
    /**
     * CPU's Arithmetic Logic Unit (ALU)
     */
    private ArithmeticLogicUnit alu;
    
    /* Register */
    // TODO: Add GPR's, decide whether vector or several variables
    
    /**
     * Program Counter (PC)
     */
    private Register16 pc;
    
    /**
     * Instruction Register (IR)
     */
    private Register16 ir;
    
    /**
     * Index Register (X0)
     */
    private Register16 x0;    
    
    /**
     * Condition Code Register (CC)
     */
    private Register4 cc;
}
 
