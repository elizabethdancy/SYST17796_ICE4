/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Starter tests for ICE4. Use the description in the ICE to
 * complete the remaining tests as you complete the requirements.
 * @author dancye, 2019
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }

    

    /**
     * Test of checkLength method, of class PasswordValidator.
     * Uses a password that is length 10 so should return true.
     */
    @Test
    public void testCheckLengthGood() {
        System.out.println("checkLengthGood");
        String pass = "testing123";
        boolean expResult = true;
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(expResult, result);
       
    }
    
    /**
     * Checks that when we enter a password whose length is too
     * short, we get a false result from the method under test.
     */
    @Test
    public void testCheckLengthBad() {
        System.out.println("checkLengthBad");
        String pass = "testing";
        boolean expResult = false;
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(expResult, result);
       
    }
    
    /**
     * Tests that when we use a password that is exactly length
     * 8, we get a true result. This is right on the boundary
     * for the method under test.
     */
    @Test
    public void testCheckLengthBoundary() {
        System.out.println("checkLengthBoundary");
        String pass = "testing1";
        boolean expResult = true;
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(expResult, result);
       
    }
    
}
