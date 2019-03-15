package com.prash;

public class StringPrograms {
    public static void main(String[] args) {
        String sentence = "My name     is  Mark";
        String[] arr = sentence.split(" +"); // + removes multiple white spaces
        for (int i=arr.length-1 ; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
