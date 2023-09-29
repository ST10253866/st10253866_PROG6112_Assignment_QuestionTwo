/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st10253866_prog6112_q2;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aveshan
 */
public class ItemTest {
    
   
    private Item item;

    @Before
    public void setUp() {
        item = new Item("Example Item", 10);
    }

    @Test
    public void testGetName() {
        assertEquals("Example Item", item.getName());
    }

    @Test
    public void testSetName() {
        item.setName("New Name");
        assertEquals("New Name", item.getName());
    }

    @Test
    public void testGetQuantity() {
        assertEquals(10, item.getQuantity());
    }

    @Test
    public void testSetQuantity() {
        item.setQuantity(20);
        assertEquals(20, item.getQuantity());
    }

    @Test
    public void testToString() {
        assertEquals("Example Item: 10", item.toString());
    }
}

    

