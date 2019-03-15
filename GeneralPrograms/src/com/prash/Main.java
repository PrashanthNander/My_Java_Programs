package com.prash;

public class Main {

    public static void main(String[] args) {
	// write your code here

        PyramidOfNumber num = new PyramidOfNumber();
        num.patternNum(5);

        //Calling
        sumOfAllNumbers(111);
    }


    public static void sumOfAllNumbers(int inputNumber) {
        //Creating a copy of input number
        int copyNumber = inputNumber;
        //Initializing sum to 0
        int sum = 0;

        while (copyNumber != 0) {
            //Getting last digit of the input number
            int lastDigit = copyNumber%10;
            System.out.println("LastDigit = " + lastDigit);
            //Adding last digit to Sum
            sum = sum + lastDigit;
            //Removing last digit from the input
            copyNumber = copyNumber/10;
        }

        //Printing sum
        System.out.println("Sum Of All Digits In " + inputNumber+" = " + sum);
    }
}
