package com.prash;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] arr = {70, 60, 90, 40, 30, 100, 10};
//        MyBubbleSort bub = new MyBubbleSort();
//        bub.bubSort(arr);
//        MySelectionSort sel = new MySelectionSort();
//        sel.selectSort(arr);

        MyQuickSort sorter = new MyQuickSort();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
