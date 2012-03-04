package cactus;

import java.math.BigInteger;

public class ArithmeticLogicUnit implements Unit {
    
    private Register16 op1,op2,result;

    public Register16 getOp1() {
        return op1;
    }

    public void setOp1(Register16 op1) {
        this.op1 = op1;
    }

    public Register16 getOp2() {
        return op2;
    }

    public void setOp2(Register16 op2) {
        this.op2 = op2;
    }

    public Register16 getResult() {
        return result;
    }

    public void setResult(Register16 result) {
        this.result = result;
    }
    
    /* dummy. just to try a junit test */
    public int add(int a, int b){
        return a+b;
    }
    
    /**
     * Sum the op1 with op2 and put it into result
     */
    public void add(){
        this.result.set(BigInteger.valueOf(this.op1.getInt() + this.op2.getInt()).toByteArray());
    }
    
    /**
     * Subtract the op1 from cp2 and put it into result
     */
    public void sub(){
        this.result.set(BigInteger.valueOf(this.op1.getInt() - this.op2.getInt()).toByteArray());
    }
    
    /**
     * Add immediate value to register and put it into result
     */
    public void addImmed(){
        if(this.op2.getInt() != 0){
            
            if(this.op1.getInt() == 0){
                this.op1.set(this.op2.get());
            }else{
                this.result.set(this.op1.getInt() + this.op2.getInt());
            }
        }
    }
    
    /**
     * Subtract immediate value from register and put it into result
     */
    public void subImmed(){
        if(this.op2.getInt() != 0){
            
            if(this.op1.getInt() == 0){
                this.op1.set((-1)*this.op2.getInt());
            }else{
                this.result.set(this.op1.getInt() - this.op2.getInt());
            }
        }
    }
    
}
 
