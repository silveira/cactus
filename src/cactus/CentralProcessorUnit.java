package cactus;

/**
 * Central Processor Unit of a computer, where most of processor activities 
 * takes place.
 */
public class CentralProcessorUnit implements Unit {
    /**
     * Number of General Purpose Registers in the CPU
     */
    public static final int NREGISTERS = 4;
    
    /* Units */
    
    /**
     * CPU's Control Unit (CU) 
     */
    private ControlUnit cu;
    
    /**
     * CPU's Arithmetic Logic Unit (ALU)
     */
    private ArithmeticLogicUnit alu;
    
    /* Registers */
    
    /**
     * Program Counter (PC)
     */
    private Register16 pc;
    
    /**
     * Instruction Register (IR)
     */
    private Register16 ir;

    /**
     * Memory Buffer Register (MBR)
     */
    private Register16 mbr;

    /**
     * Memory Address Register (MAR)
     */
    private Register16 mar;

    /**
     * Memory Status Register (MSR)
     */
    private Register16 msr;

    /**
     * Memory Fault Register (MFR)
     */
    private Register4 mfr;
    
    /**
     * Index Register (X0)
     */
    private Register16 x0;    
    
    /**
     * Condition Code Register (CC)
     */
    private Register4 cc;
    
    /**
     * General Purpose Register File (GPR)
     */
    private Register16[] gpr;
    
    /**
     * Constructor
     */
    public CentralProcessorUnit() {
        // Instantiate Units
        this.cu = new ControlUnit(this);
        this.alu = new ArithmeticLogicUnit();
        
        // Instantiate GPR File
        this.gpr = new Register16[NREGISTERS];
        
        // Instatiate 4-bit Registers
        this.cc = new Register4();
        this.mfr = new Register4();
        
        // Instatiate 16-bit Registers
        this.pc = new Register16();
        this.ir = new Register16();
        this.mar = new Register16();
        this.mbr = new Register16();
        this.msr = new Register16();
        this.x0 = new Register16();
    }
    
    public Register16 getRegister(int index) {
        return gpr[index];
    }
    
    public Register16 getMar() {
        return mar;
    }

    public Register16 getMbr() {
        return mbr;
    }

    public Register16 getPc() {
        return pc;
    }

    public Register16 getX0() {
        return x0;
    }

    public Register16 getIr() {
        return ir;
    }
    
    public ArithmeticLogicUnit getAlu(){
        return this.alu;
    } 
    
    /*public void setMar(Register16 mar) {
        this.mar = mar;
    }*/

    public void setMbr(Register16 mbr) {
        this.mbr = mbr;
    }

    /*public void setPc(Register16 pc) {
        this.pc = pc;
    }*/

    public void setIr(Register16 ir) {
        this.ir = ir;
    }
    
    /**
     * This method increments the PC Register
     */
    public void incrementPC(){
        this.pc.set(this.pc.getInt()+1);
    }
}
