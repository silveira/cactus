package cactus;

/**
 * A 16-bit words with words of 2 x 8-bit bytes.
 * A total of 16,384 words or 32,768 bytes.
 * Byte and Word addressable.
 */

public class Memory {
    /* Memory size */
    private static final int MAXSIZE = 32768;

    /* Internal representation of memory as an byte (8 bits) array */
    private byte[] data = new byte[MAXSIZE];
    
    /**
     * A byte addressable Memory mutator.
     * 
     * Example:
     * <pre>{@code 
     *  Memory mem = new Memory();
     *  System.out.println(mem.getByte(41)); // prints 0
     *  mem.setByte(41, 22);
     *  System.out.println(mem.getByte(41)); // prints 22
     * }</pre>
     * @param address the byte index of the desired memory position.
     * @param value new value for memory index
     * @throws ArrayIndexOutOfBoundsException if {@code address > MAXSIZE-1}
     *         or {@code address < 0}
     */
    public void setByte(int address, byte value) {
        this.data[address] = value;
    }
    
    /**
     * A byte addressable Memory accessor.
     * 
     * Example:
     * <pre>{@code 
     *  Memory mem = new Memory();
     *  System.out.println(mem.getByte(41)); // prints 0
     *  mem.setByte(41, 14);
     *  System.out.println(mem.getByte(41)); // prints 14
     * }</pre>
     * 
     * @param address the byte index of the desired memory position.
     * @return a byte for this memory address
     * @throws ArrayIndexOutOfBoundsException if {@code address > MAXSIZE-1}
     *         or {@code address < 0}
     */
    public byte getByte(int address) {
        return this.data[address];
    }
    
    /**
     * A word addressable Memory mutator.
     * 
     * @param address the word index of the desired memory position.
     * @param leftValue 
     * @param rightValue
     * @throws ArrayIndexOutOfBoundsException if {@code address > MAXSIZE-1}
     *         or {@code address < 0}
     */
    public void setWord(int address, byte leftValue, byte rightValue) {
        this.setByte(address, leftValue);
        this.setByte(address+1, rightValue);
    }
    
    /**
     * A word addressable Memory accessor.
     * @param address the word index of the desired memory position.
     * @return a array of 2 bytes (16-bits of information)
     * @throws ArrayIndexOutOfBoundsException if {@code address > MAXSIZE-1}
     *         or {@code address < 0}
     */
    public byte[] getWord (int address) {
        return new byte[]{this.getByte(address), this.getByte(address+1)};
    }
}
 
