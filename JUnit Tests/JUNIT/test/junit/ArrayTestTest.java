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
public class ArrayTestTest {
    
    public ArrayTestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class ArrayTest.
     */
    @Test
    public void testMain() {
        System.out.println("\tTest Case #1");
        int[] input = {1, 3, 7, 8, 2, 5, 1};
        int[] expResult = {1, 1, 2, 3, 5, 7, 8};
        int[] result = ArrayTest.main(input);
        assertArrayEquals(expResult, result);
    }
    
}
