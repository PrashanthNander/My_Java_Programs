package com.prash;

public class BinarySearch_DivideConquer {
    public static void main(String[] args) {
        int[] numArr = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        int result = binSearch(numArr, key);
        System.out.println("Result="+ result);
        if (result < 0) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at position "+ result);
        }
    }

    public static int binSearch(int[] inputArr, int key) {
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
