package com.prash;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String>  groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " item in your List");
//        System.out.println("Array=" + groceryList);
        for (int i=0; i<groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item "+ newItem +" removed from position " + position);
    }

    public void removeGroceryItem(String item) {
        groceryList.remove(item);
    }

    public String findItem(String searchItem) {
//        groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }

    public void copyArray() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray = groceryList;
        System.out.println("New ARray =" + newArray);
    }

}
