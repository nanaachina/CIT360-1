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
import static org.hamcrest.CoreMatchers.*;

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
        System.out.println("Test Case #1 assertEquals:");
        int input = 0;
        boolean expResult = true;
        boolean result = MathTest.result(input);
        assertEquals(expResult, result);
        System.out.println(input + " < 25 = " + result);
        
        //test to see if the value isn't null
        System.out.println("Test Case #2 assertNotNull:");
        input = 15;
        result = MathTest.result(input);
        assertNotNull(input);
        System.out.println(input + " isn't null. = " + result);
        
        System.out.println("Test Case #3 assertNull:");
        String str1 = null;
        assertNull(str1);
        System.out.println(str1 + " is null. = " + result);
        
        System.out.println("Test Case #4 assertSame:");
        String str2 = "seth";
        String str3 = "pumpkins";
        String str4 = "seth";
        assertSame(str2, str4);
        System.out.println(str2 + " and " + str4 + " are the same. = " + result);

        System.out.println("Test Case #5 assertNotSame:");
        assertNotSame(str2, str3);
        System.out.println(str2 + " and " + str3 + " are not the same. = " + result);
        
        System.out.println("Test Case #5 assertFalse:");
        input = 99;
        result = MathTest.result(input);
        assertFalse(result);
        System.out.println(input + " < 25 = " + result);
        
        System.out.println("Test Case #6 assertTrue:");
        input = 1;
        result = MathTest.result(input);
        assertTrue(result);
        System.out.println(input + " < 25 = " + result);

        System.out.println("Test Case #7 AssertThat:");
        assertThat(str4,is("seth"));
        System.out.println("I do assert that " + str4 + " is in fact seth" + " = " + result
                + " Otherwise he's got issues…");

    }
    
}
