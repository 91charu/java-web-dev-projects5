package org.launchcode;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here


        MenuItem item1 = new MenuItem("Burger", 9.99, "Delicious burger", "Main Course", true);
        MenuItem item2 = new MenuItem("Pizza", 10.99, "Tasty pizza", "Main Course", false);
        MenuItem item3 = new MenuItem("Salad", 5.99, "Healthy salad", "Appetizer", true);

        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        Date lastUpdated = new Date();
        Menu menu = new Menu(lastUpdated, items);

        System.out.println("Menu:");
        for (MenuItem menuItem : menu.getItems()) {
            System.out.println(menuItem.getName() + " - $" + menuItem.getPrice());
            System.out.println("Description: " + menuItem.getDescription());
            System.out.println("Category: " + menuItem.getCategory());
            System.out.println("Is New: " + menuItem.isNew());
            System.out.println("---------------");
        }

        while (true) {
            System.out.println("Menu Options:");
            System.out.println("1. View All Items");
            System.out.println("2. Search for Item");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            if (choice == 1) {

                System.out.println("Menu:");
                for (MenuItem menuItem : menu.getItems()) {
                    System.out.println(menuItem.getName() + " - $" + menuItem.getPrice());
                    System.out.println("Description: " + menuItem.getDescription());
                    System.out.println("Category: " + menuItem.getCategory());
                    System.out.println("Is New: " + menuItem.isNew());
                    System.out.println("---------------");
                }
            }

                else if (choice == 2) {
                    System.out.print("Enter the item name to search for: ");
                    input.nextLine();
                    String itemNameToSearch = input.nextLine();

                    MenuItem foundItem = menu.getItem(itemNameToSearch);

                    if (foundItem != null) {
                        System.out.println("Found Item:");
                        System.out.println("Name: " + foundItem.getName());
                        System.out.println("Price: $" + foundItem.getPrice());
                        System.out.println("Description: " + foundItem.getDescription());
                        System.out.println("Category: " + foundItem.getCategory());
                        System.out.println("Is New: " + foundItem.isNew());
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                }
            }
        }
    }







