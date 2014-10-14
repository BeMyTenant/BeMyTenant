/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author catherinehuh
 */
public class LoginTest {

    public LoginTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of validate method, of class Login.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        Login login = new Login();
        login.setUsername("chuh");
        login.setPassword("regis");
        boolean result = login.validate();
        assertEquals("expected true", true, result);
        assertTrue(result);
    }

    /**
     * Test of equals method, of class Login.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Login user1 = new Login();
        Login user2 = new Login();
        assertFalse(user1.equals(user2));
        user2.setUsername("chuh");
        assertFalse(user2.equals(user1));
        user1.setUsername("mgallegos");
    }

}
