package com.prash;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	    boolean quit = false;
	    int choice = 0;
	    printInstructions();
	    while (!quit) {
            System.out.println("Enter your choice.");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    copyItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    public static void addItem() {
        System.out.print("Enter the item to be added.");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter the position of the item to be modified.");
        int position = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the new Item");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(position, newItem );

    }
    public static void removeItem() {
        System.out.println("Enter the item to be removed");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void copyItem() {
        groceryList.copyArray();
    }




    public static void printInstructions() {
        System.out.println("0 - To print choice options");
        System.out.println("1 - To print the list of grocery items");
        System.out.println("2 - To add an Item to the List");
        System.out.println("3 - TO modify an item in the List");
        System.out.println("4 - To remove an item from the List");
        System.out.println("5 - To serach for an item in the List");
        System.out.println("6 - To quit the application");
    }
}
