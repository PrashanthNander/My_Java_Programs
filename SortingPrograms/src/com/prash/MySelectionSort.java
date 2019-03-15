package com.prash;

public class MySelectionSort {

    public void selectSort(int[] arr) {
        int index;
        for (int i = 0; i < arr.length-1; i++) {
            index = i;
//            System.out.println("===========");
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            System.out.println("Index==" + index);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }
    }
}
