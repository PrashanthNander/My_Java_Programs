package com.prash;

import javax.sound.midi.Soundbank;

public class Temp {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,3,7};
        int counter = 1;
        for (int i =0;i<arr.length;i++) {
            int froCounter = 1;
            for (int j = i+1; j< arr.length-1; j++) {
                if (arr[i] == arr[j]) {
                    counter ++;
                    froCounter ++;
                }
            }
            System.out.println(arr[i] +" exist " + froCounter + " no of times");
        }
        System.out.println("Counter=" + counter);

    }
}
