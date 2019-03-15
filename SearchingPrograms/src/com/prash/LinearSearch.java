package com.prash;

public class LinearSearch {

    public int linearSerach(int[] arr, int key) {
        int size = arr.length;
        for (int i = 0 ; i < arr.length ; i ++) {
            if (key == arr[i]) {
                System.out.println("Item found at at position " + i);
                return 1;
            }
        }
        System.out.println("Item not found");
        return 1;
    }
}
