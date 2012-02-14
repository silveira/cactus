package cactus;

public class MemoryManagementUnit implements Unit {
    
    private CentralProcessorUnit cpu;

    /**
     * Get the value of cpu
     *
     * @return the value of cpu
     */
    public CentralProcessorUnit getCpu() {
        return cpu;
    }

    /**
     * Set the value of cpu
     *
     * @param cpu new value of cpu
     */
    public void setCpu(CentralProcessorUnit cpu) {
        this.cpu = cpu;
    }

    /**
     * Reference for the a Memory object
     */
    private Memory memory;

    /**
     * Get the value of memory
     *
     * @return the value of memory
     */
    public Memory getMemory() {
        return memory;
    }

    /**
     * Set the value of memory
     *
     * @param memory new value of memory
     */
    public void setMemory(Memory memory) {
        this.memory = memory;
    }    
}