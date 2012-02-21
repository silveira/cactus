/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cactus;

/**
 *
 * @author silveira
 */
public class Word {
    public final int SIZE = 2;
    private byte[] representation = new byte[SIZE];
    
    
    public String toBinaryString(){
        String binary = "";
        
        for(int i=0; i < SIZE;i++) {
            binary = binary.concat(Integer.toBinaryString(representation[i]));
            if(i<SIZE){
                binary += " ";
            }
        }
        return binary;
    }
}
