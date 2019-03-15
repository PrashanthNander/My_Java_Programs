package com.prash;

public class SumOfAllDigitsInNumber {

    public static void main(String[] args) {
        sumOfAllDigits(12);
        sumOfAllDigits(342);
        sumOfAllDigits(111);
    }

    static void sumOfAllDigits(int inputNumber) {

        int copyOfInputNumber = inputNumber;
        int sum = 0;
        while (copyOfInputNumber != 0) {
            //Getting last digit of the input number
            int lastDigit = copyOfInputNumber % 10;
            //Adding last digit to sum
            sum = sum + lastDigit; //sum = sum + copyOfInputNumber % 10;
            //Removing last digit from the input number
            copyOfInputNumber = copyOfInputNumber/10;
        }
        //Printing sum
        System.out.println("Sum Of All Digits In "+inputNumber+" = "+sum);
    }
}
