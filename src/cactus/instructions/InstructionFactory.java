package cactus.instructions;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Factory for Instructions
 */
public class InstructionFactory {
    /**
     * Array of Instructions Used
     */
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
     * Creates a Instruction instance from a Opcode
     * @param opcode Opcode in String. Ex: "000011"
     * @return A instance of Instruction
     */
    public static Instruction fromOpcode(String opcode) {
        for (Class instruction : InstructionFactory.instructions) {
            try {
                Method getOpcode = instruction.getMethod("getOpcode");
                Object instOpcode = getOpcode.invoke(null);
                
                if (instOpcode.equals(opcode)) {
                    try {
                        return (Instruction)instruction.newInstance();
                    } catch (InstantiationException | IllegalAccessException ex) {
                        Logger.getLogger(InstructionFactory.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
                Logger.getLogger(InstructionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    /**
     * Creates a Instruction from a AssemblyCode
     * @param assemblyCode AssemblyCode in String. Ex: "LDR"
     * @return A instance of Instruction
     */
    public static Instruction fromAssemblyCode(String assemblyCode) {
        for (Class instruction : InstructionFactory.instructions) {
            try {
                Method getOpcode = instruction.getMethod("getAssemblyCode");
                Object instOpcode = getOpcode.invoke(null);
                
                if (instOpcode.equals(assemblyCode)) {
                    try {
                        return (Instruction)instruction.newInstance();
                    } catch (InstantiationException | IllegalAccessException ex) {
                        Logger.getLogger(InstructionFactory.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
                Logger.getLogger(InstructionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
