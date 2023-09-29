/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st10253866_prog6112_q2;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aveshan
 */
public class ItemListTest {
    
    public ItemListTest() {
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
     * Test of getItemList method, of class ItemList.
     */
    @Test
    public void testGetItemList() {
        System.out.println("getItemList");
        ItemList instance = new ItemList();
        ArrayList<Item> expResult = new ArrayList<>(); // Expect an empty ArrayList
        ArrayList<Item> result = instance.getItemList();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of addItem method, of class ItemList.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        String name = "";
        int quantity = 0;
        ItemList instance = new ItemList();
        instance.addItem(name, quantity);
  
    }

    /**
     * Test of removeItem method, of class ItemList.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        String name = "";
        int quantityToRemove = 0;
        ItemList instance = new ItemList();
        instance.removeItem(name, quantityToRemove);

    }

    /**
     * Test of changeQuantity method, of class ItemList.
     */
    @Test
    public void testChangeQuantity() {
        System.out.println("changeQuantity");
        String name = "";
        int newQuantity = 0;
        ItemList instance = new ItemList();
        instance.changeQuantity(name, newQuantity);
      
    }

    /**
     * Test of viewItemList method, of class ItemList.
     */
    @Test
    public void testViewItemList() {
        System.out.println("viewItemList");
        ItemList instance = new ItemList();
        instance.viewItemList();
    
    }
    
}
