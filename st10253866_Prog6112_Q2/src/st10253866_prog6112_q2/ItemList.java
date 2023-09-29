/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st10253866_prog6112_q2;

import java.util.ArrayList;

/**
 *
 * @author Aveshan
 */
public class ItemList {
 // Create an ArrayList to store items
    private final ArrayList<Item> itemList = new ArrayList<>();

    // Get the item list
    public ArrayList<Item> getItemList() {
        return itemList;
    }

    // Add an item to the item list based on its name and quantity
    public void addItem(String name, int quantity) {
        Item newItem;

        // Check if the name contains "part" to determine the type of item
        if (name.toLowerCase().contains("part")) {
            newItem = new Part(name, quantity);
        } else {
            newItem = new Tool(name, quantity);
        }

        // Add the new item to the item list
        itemList.add(newItem);
        System.out.println(name + " added to the item list.");
    }

    // Remove a specified quantity of an item from the item list
    public void removeItem(String name, int quantityToRemove) {
        for (int i = 0; i < itemList.size(); i++) {
            Item item = itemList.get(i);

            // Check if the name of the item matches the specified name (case-insensitive)
            if (item.getName().equalsIgnoreCase(name)) {
                int currentQuantity = item.getQuantity();

                // Check if there's enough quantity to remove
                if (currentQuantity >= quantityToRemove) {
                    item.setQuantity(currentQuantity - quantityToRemove);
                    System.out.println(quantityToRemove + " " + name + "(s) removed from the item list.");
                } else {
                    System.out.println("Not enough " + name + " in the item list.");
                }
                return;
            }
        }
        System.out.println(name + " is not in the item list.");
    }

    // Change the quantity of a specified item in the item list
    public void changeQuantity(String name, int newQuantity) {
        for (Item item : itemList) {

            // Check if the name of the item matches the specified name (case-insensitive)
            if (item.getName().equalsIgnoreCase(name)) {
                item.setQuantity(newQuantity);
                System.out.println("Quantity of " + name + " changed to " + newQuantity);
                return;
            }
        }
        System.out.println(name + " is not in the item list.");
    }

    // View the current contents of the item list
    public void viewItemList() {
        if (itemList.isEmpty()) {
            System.out.println("The item list is currently empty.");
        } else {
            System.out.println("Current Item List:");

            // Print each item in the item list
            itemList.forEach((item) -> {
                System.out.println(item);
            });
        }
    }
}