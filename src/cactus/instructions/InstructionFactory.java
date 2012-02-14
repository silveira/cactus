package cactus.instructions;

import sun.net.www.content.image.gif;

/**
 *
 * Factory for Instructions
 */
public class InstructionFactory {
    private static final Class[] instructions = {
        AMR.class,
        AND.class,
        DIV.class,
        IAR.class,
        ISR.class,
        JCC.class,
        JMP.class,
        JNE.class,
        JSR.class,
        JZ.class,
        LDA.class,
        LDR.class,
        LDX.class,
        MUL.class,
        NOT.class,
        OR.class,
        RFS.class,
        RRC.class,
        SMR.class,
        SOB.class,
        SRC.class,
        STR.class,
        STX.class,
        TST.class
    };
    
    /**
     * Get instance from opcode string
     * @param opcode
     * @return 
     */
    public static Instruction fromOpcode(String opcode) {
        for (Class instruction : InstructionFactory.instructions) {
            
        }

        return null;
    }
}
