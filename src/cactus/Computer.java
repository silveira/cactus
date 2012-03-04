package cactus;

/**
 * The main class of our computer simulator.
 * Contains all the necessary parts of the computer.
 */
public class Computer {
    /**
     * Represents the Central Processor Unit (CPU)
     */
    private CentralProcessorUnit cpu; 
    /**
     * Represents Memory Management Unit (MU)
     */
    private MemoryManagementUnit mmu;
    /**
     * Main memory of the computer, where programs and data are stored.
     */
    private Memory memory;
    
    /**
     * Set the program code into the memory
     */
    public void setProgram(String program) {
        
    }

    public CentralProcessorUnit getCpu() {
        return cpu;
    }

    public void setCpu(CentralProcessorUnit cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public MemoryManagementUnit getMmu() {
        return mmu;
    }

    public void setMmu(MemoryManagementUnit mmu) {
        this.mmu = mmu;
    }    
    
}
 
