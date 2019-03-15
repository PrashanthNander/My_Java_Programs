package com.prash;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinearSearch ls = new LinearSearch();
        int[] arr = {5,1,15,2,8,0};
        int key = 8;
//        ls.linearSerach(arr, key);
//        System.out.println("Calling Binary Search");
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        key = 3;
        BinarySearch bs = new BinarySearch();
        int pos = bs.binarySearch(arr1, key);
        System.out.println("Position=" + pos);
    }
}
