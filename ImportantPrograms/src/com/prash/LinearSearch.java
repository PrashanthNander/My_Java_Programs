package com.prash;

public class LinearSearch {

    public static void main(String[] args) {
        int[] numArr = {70, 30, 99, 131, 10, 45, 100};
        int key = 20;
        int found = linSearch(numArr, key);
        if (found < 0) {
            System.out.println("Key not found...");
        } else {
            System.out.println("Key found at index " + found);
        }
    }

    public static int linSearch(int[] arr, int key) {
        for (int i =0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
