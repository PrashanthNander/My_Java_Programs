package com.prash;

public class MyBubbleSort {

    public void bubSort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n-1 ; i++) {
//            System.out.println("IIIII===" + i);
            for (int j = i + 1; j < n ; j++ ) {
//                System.out.println("I===="+ i + "=======J=======" + j);
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
            }
        }

        for (int i = 0; i < n; i ++) {
            System.out.println("Sorted ARray=" + arr[i]);
        }

    }


}
