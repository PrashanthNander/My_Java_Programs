package com.prash;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myArray = getIntegers(5);
        printArray(myArray);
        System.out.println("Sorted Array=======");
        printArray(sortIntegers(myArray));



    }

    public static int[] getIntegers(int num) {
        System.out.println("Enter " + num + " Integer values");
        int[] thisArray = new int[num];
        for (int i = 0 ; i< thisArray.length ; i++) {
            thisArray[i] = scanner.nextInt();
        }
        return thisArray;
    }

    public static void printArray(int[] arr) {
        for (int i=0 ; i<arr.length ; i++) {
            System.out.println("Element at " + i + " typed value : " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = array;
        for (int i=0; i<array.length; i++) {
//            sortedArray[i] = array[i];
            System.out.println("Value here===" + sortedArray[i]);
        }

//        boolean flag = true;
//        int tempValue = 0;
//
//        while (flag) {
//            flag = false;
//
//            for (int i=0; i< sortedArray.length-1; i++) {
//     //           System.out.println("Initial value=="+ i + "  ");
//                if (sortedArray[i] < sortedArray[i+1]) {
//                    tempValue = sortedArray[i];
//                    sortedArray[i] = sortedArray[i+1];
//                    sortedArray[i+1] = tempValue;
//                    System.out.println("I value=="+ i);
//                    flag = true;
//                }
//            }
//        }
        System.out.println("I am going to maldives");
        return sortedArray;

    }
}
