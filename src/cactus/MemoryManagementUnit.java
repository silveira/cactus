package cactus;

public class MemoryManagementUnit implements Unit {

    // 16-bit words/2 8-bit bytes
    // Memory of 16,384 words/32,768 bytes
    // Byte addressable
    // TODO write MAR register handle
    // TODO write MBR register handle

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
    
    /**
     * Get the content of MAR from memory
     * 
     * @return String
     */
    public String getMemoryContent(){
        //TODO Create the method to get content from memory (MAR) and put it into MBR
        //Esse método poderia ser VOID
        return null;
    }
    
    /**
     * This method put the content of MBR into the memory
     */
    public void insertMemoryContent(){
        //TODO pegar o valor da MBR e colocar no endereço da MAR
        
    }
    
    /**
     * This method calculates the effective address of an instruction
     * @param add address of the instruction
     * @param indirectAddress bit that indicates if the address is indirect or not
     * @param indexing bit that indicates if the address is indexed or not
     * @return effective address calculated
     */
    public String calculateEffectiveAddress(String add, int indirectAddress, int indexing){
        String ea = add;
        
        if(indexing == 1){            
            //Get memory content of the sum of add an X0 register
            ea =  Integer.toBinaryString(
                    Integer.parseInt(this.cpu.getX0().getContent(),2) //X0
                        + 
                    Integer.parseInt(add,2) //Add
                    );   
        }
        
        //Get the value of the sum of X0 with Address
        if(indirectAddress == 1){
            this.cpu.getMar().setContent(ea);
            this.getMemory();
            ea = this.cpu.getMbr().getContent();
        }
        
        return ea;
    }
}