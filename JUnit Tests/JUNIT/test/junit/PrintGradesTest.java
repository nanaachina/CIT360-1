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
public class PrintGradesTest {
    
    public PrintGradesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of print method, of class PrintGrades.
     */
    @Test
    public void testPrint() {
        System.out.println("\tFirst Test Case");
        PrintGrades pg = new PrintGrades();
        String result = pg.print(95);
        assertEquals("Incorrect Message was recieved", "You got an A! Shhh! Be quiet about it, or they might recalculate your score.", result);
        
        System.out.println("\tSecond Test Case");
        pg = new PrintGrades();
        result = pg.print(85);
        assertEquals("Incorrect Message was recieved", "Booyah! You got a B!!", result);
        
        System.out.println("\tThird Test Case");
        pg = new PrintGrades();
        result = pg.print(75);
        assertEquals("Incorrect Message was recieved", "Cs still pass!!!.", result);
        
        System.out.println("\tFourth Test Case");
        pg = new PrintGrades();
        result = pg.print(69);
        assertEquals("Incorrect Message was recieved", "You'll be retaking this class… again.", result);
        
    }
    
}
