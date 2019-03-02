/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplicationControllerPattern;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author seth
 */
public class ApplicationControllerPatternTest {
    
    public ApplicationControllerPatternTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of ApplicationControllerPat method, of class ApplicationControllerPattern.
     */
    @Test
    public void testApplicationControllerPat() {
        System.out.println("ApplicationControllerPat");
        ApplicationControllerPattern instance = new ApplicationControllerPattern();
        instance.ApplicationControllerPat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleCommand method, of class ApplicationControllerPattern.
     */
    @Test
    public void testHandleCommand() {
        System.out.println("handleCommand");
        String command = "";
        Integer num1 = null;
        Integer num2 = null;
        ApplicationControllerPattern.handleCommand(command, num1, num2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
