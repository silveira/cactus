package cactus;

public class Memory {
    
    private static final int MAXSIZE = 32768;
    private static final int WORD = 2;

    // 16-bit words/2 8-bit bytes
    // Memory of 16,384 words/32,768 bytes
    // Byte addressable
    private byte[] data = new byte[MAXSIZE];
    
    public void setByte(int address, byte value) {
        this.data[address] = value;
    }
    
    public byte getByte(int address) {
        return this.data[address];
    }
    
    public void setWord(int address, byte leftValue, byte rightValue) {
        this.setByte(address, leftValue);
        this.setByte(address+1, rightValue);
    }
    
    public byte[] getWord (int address) {
        return new byte[]{this.getByte(address), this.getByte(address+1)};
    }
}
 
