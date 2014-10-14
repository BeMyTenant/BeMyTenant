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
public class AccountTest {

    public AccountTest() {
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
     * Test of validate method, of class Account.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        Account account = new Account();
        account.setAccountName("CHUH");
        account.setLandlordName("MGALLEGOS");
        account.setTenantName("Catherine Huh");
        account.setPropertyAddress("3333 Regis Boulevard");
        account.setApartmentNumber("A001");
        account.setCity("Denver");
        account.setState("Colorado");
        account.setUsername("chuh");
        account.setPassword("regis");
        account.setEmail("chuh@regis.edu");
        boolean result = account.validate();
        assertEquals("expected true", true, result);
        assertTrue(result);
    }

    /**
     * Test of equals method, of class Account.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Account user1 = new Account();
        Account user2 = new Account();
        assertFalse(user1.equals(user2));
        user2.setAccountName("CHUH");
        assertFalse(user2.equals(user1));
        user1.setAccountName("MGALLEGOS");
    }

}
