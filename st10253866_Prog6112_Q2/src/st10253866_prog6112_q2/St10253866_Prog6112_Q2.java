/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st10253866_prog6112_q2;
import java.util.Scanner;

/**
 *
 * @author Aveshan
 */
public class St10253866_Prog6112_Q2 {

    /**
     * @param args the command line arguments
     */
   
     public static void main(String[] args) {
         // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Item List Program!");

        // Create an instance of ItemList to manage items
        ItemList itemList = new ItemList();

        while (true) {
            displayMenu(); // Display the program menu
            String choice = scanner.nextLine(); // Read user's choice

            switch (choice) {
                case "1":
                    System.out.print("Enter the name of the item: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the quantity of " + name + ": ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    itemList.addItem(name, quantity); // Add the item to the list
                    break;
                case "2":
                    System.out.print("Enter the name of the item to remove: ");
                    String itemNameToRemove = scanner.nextLine();
                    System.out.print("Enter the quantity of " + itemNameToRemove + " to remove: ");
                    int quantityToRemove = scanner.nextInt();
                    scanner.nextLine();
                    itemList.removeItem(itemNameToRemove, quantityToRemove); // Remove the item
                    break;
                case "3":
                    System.out.print("Enter the name of the item to change the quantity: ");
                    String itemNameToChange = scanner.nextLine();
                    System.out.print("Enter the new quantity: ");
                    int newQuantity = scanner.nextInt();
                    scanner.nextLine();
                    itemList.changeQuantity(itemNameToChange, newQuantity); // Change item quantity
                    break;
                case "4":
                    itemList.viewItemList(); // View the current item list
                    break;
                case "5":
                    System.out.println("Thank you for using the Item List Program. Goodbye!");
                    System.exit(0); // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Display the program menu
    private static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add a part");
        System.out.println("2. Remove a part");
        System.out.println("3. Change quantity of a part");
        System.out.println("4. View current item list");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
}