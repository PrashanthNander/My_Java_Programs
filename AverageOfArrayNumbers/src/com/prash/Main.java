package com.prash;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getInputs(5);
        printArray(myArray);
        System.out.println("Average of given numbers is " + averageOfNumbers(myArray));
        System.out.println();
        System.out.println("Numbers after sorting");
        myArray = sortIntegers(myArray);
        printArray(myArray);
    }

    public static int[] getInputs(int noOfValues) {
        int[] values = new int[noOfValues];
        System.out.println("Enter " + noOfValues + " input values\r");
        for (int i = 0; i < noOfValues; i ++) {
            values[i] = scan.nextInt();
        }
        return values;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i ++) {
            System.out.println("Element in postion "+ i + " is " + arr[i]);
        }
    }

    public static double averageOfNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return (double) sum / (double) arr.length;
    }
    //Method to sort integer values
    public static int[] sortIntegers(int[] myArray) {
        int sortedArray[] = myArray;
        int temp;
        for (int i = 0; i < sortedArray.length; i ++) {
           for (int j=i+1; j<sortedArray.length ; j++) {
               if (sortedArray[i] < sortedArray[j]) {
                    temp = myArray[i];
                   sortedArray[i] = sortedArray[j];
                   sortedArray[j] = temp;
               }
           }
        }
        return sortedArray;
    }
}
