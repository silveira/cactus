/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cactus.instructions;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 */
public class InstructionFactoryTest {
    
    public InstructionFactoryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of fromOpcode method, of class InstructionFactory.
     * 
     * TODO: Create a HashMap[opCode] = assemblyCode to test all the 
     * instructions iteratively
     */
    @Test
    public void testFromOpcode() {
        System.out.println("fromOpcode");
        String opcode = "000001";
        Instruction result = InstructionFactory.fromOpcode(opcode);
        try {
           assertTrue(result instanceof LDR);
        } catch(AssertionError ex) {
           fail("000001 should be LDR");   
        }
    }
}
