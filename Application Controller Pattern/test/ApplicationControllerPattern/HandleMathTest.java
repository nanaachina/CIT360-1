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
public class HandleMathTest {
    
    public HandleMathTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of execute method, of class HandleMath.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        Integer num1 = null;
        Integer num2 = null;
        HandleMath instance = new HandleMathImpl();
        instance.execute(num1, num2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class HandleMathImpl implements HandleMath {

        public void execute(Integer num1, Integer num2) {
        }
    }
    
}
