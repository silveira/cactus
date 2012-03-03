package cactus;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Register16 extends Register {
    
    /**
     * Content of Register
     */
    private byte[] value = new byte[2];

    
    /*************************************************
     *** Gets
     *************************************************/
    
    /**
     * Get value of register
     * @return byte[2]
     */
    public byte[] get(){
        return this.value;
    }
    
    /**
     * Get the string value of the register
     * @return String
     */
    public String getString() {        
        return new BigInteger(this.value).toString();
    }
    
    /**
     * Get the integer value of the register
     * @return Integer
     */
    public int getInt(){
        return new BigInteger(this.value).intValue();
    }
    
     /**
     * Get a substring of the value of register
     * @param int from
     * @param int length
     * @return int String
     */
    @Override
    public String getString(int from, int length) {
        return this.getString().substring(from, from+length);
    }
    
    /**
     * Get an integer value from a substring of the value of register
     * @param int from
     * @param int length
     * @return int
     */
    @Override
    public String getInt(int from, int length) {
        return this.getString().substring(from, from+length);
    }
  
    /*************************************************
     *** Sets
     *************************************************/
    
    /**
     * Set the value of register
     * @param byte[] value 
     */
    public void set(byte[] value) {
        this.value = value;
    }
    
    /**
     * Set the value of register from a integer value
     * @param int value 
     */
    public void set(int value) {
        this.value = BigInteger.valueOf(value).toByteArray();
    }
    
    /**
     * Set the value of register
     * @param String value
     */
    public void set(String value){
        this.value = value.getBytes();
    }
    
}