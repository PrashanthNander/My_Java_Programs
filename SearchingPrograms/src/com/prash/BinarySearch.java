package com.prash;

public class BinarySearch {

    public int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length-1;
//        System.out.println("End=" + end);
//        int mid;
//        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        while (start <= end) {
            int mid = (start + end) / 2;

            System.out.println("start Element is =" + start);
            System.out.println("Mid Element Index =" + mid);
            System.out.println("end Element is =" + end);
//            System.out.println("Mid Element is =" + arr[mid]);


            if (key == arr[mid]) {
                System.out.println("Key Found");
                return mid;
            } if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            System.out.println("============================");

        }
        return -1;
    }
}
