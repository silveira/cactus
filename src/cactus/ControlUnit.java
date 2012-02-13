package cactus;

/**
 * Control Unit for a CPU
 */
public class ControlUnit implements Unit {
    /**
     * Parent CPU
     */
    private CentralProcessorUnit cpu;
    
    /**
     * Constructor
     */
    public ControlUnit(CentralProcessorUnit cpu) {
        this.cpu = cpu;
    }
}
 
