/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author seth
 */
public class MathTestTest {
    
    public MathTestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of result method, of class MathTest.
     */
    @Test
    public void testResult() {
        System.out.println("Test Case #1:");
        int input = 0;
        boolean expResult = true;
        boolean result = MathTest.result(input);
        assertEquals(expResult, result);
        System.out.println(input + " < 25 = " + result);
        
        System.out.println("Test Case #2:");
        input = 15;
        expResult = true;
        result = MathTest.result(input);
        assertEquals(expResult, result);
        System.out.println(input + " < 25 = " + result);
        
        System.out.println("Test Case #3:");
        input = 56;
        expResult = false;
        result = MathTest.result(input);
        assertEquals(expResult, result);
        System.out.println(input + " < 25 = " + result);
        
        System.out.println("Test Case #4:");
        input = 5690;
        expResult = false;
        result = MathTest.result(input);
        assertEquals(expResult, result);
        System.out.println(input + " < 25 = " + result);
        
        System.out.println("Test Case #5:");
        input = 99;
        result = MathTest.result(input);
        assertFalse(result);
        System.out.println(input + " < 25 = " + result);
        
        System.out.println("Test Case #6:");
        input = 1;
        result = MathTest.result(input);
        assertTrue(result);
        System.out.println(input + " < 25 = " + result);
    }
    
}
