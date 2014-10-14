/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.List;
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
public class BillTest {

    public BillTest() {
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
     * Test of validate method, of class Bill.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        Bill bill = new Bill();
        bill.setBillName("BCHUH");
        bill.setBillAmount("2000");
        bill.setDueDate("01/01/15");
        boolean result = bill.validate();
        assertEquals("expected true", true, result);
        assertTrue(result);
    }

    /**
     * Test of equals method, of class Bill.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Bill tenant1 = new Bill();
        Bill tenant2 = new Bill();
        assertFalse(tenant1.equals(tenant2));
        tenant2.setBillName("BCHUH");
        assertFalse(tenant2.equals(tenant1));
        tenant1.setBillName("BMGALLEGOS");
    }

}
