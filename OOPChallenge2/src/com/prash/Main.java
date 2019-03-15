package com.prash;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here

        int[] myArray =  getIntegers(5);
        for (int i =0; i<myArray.length ; i++) {
            System.out.println("Element " + i + " typed value was : "+ myArray[i]) ;
        }

    }

    public static int[] getIntegers(int num) {
        System.out.println("Enter " + num + " Integer values\r");
        int[] arrayHere =  new int[num];

        for (int i=0; i < arrayHere.length; i++) {
            arrayHere[i] =  scanner.nextInt();
        }
        return arrayHere;
    }
}
