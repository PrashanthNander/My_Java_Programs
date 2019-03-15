package com.prash;

public class Main {

    public static void main(String[] args) {
        System.out.println("I am in Main thread");

//        Thread threadOne = new ThreadCreationOne();
//        threadOne.start();
//
//        //Anonymous Class
//        new Thread() {
//            public void run() {
//                System.out.println("I am in Anonymous class");
//            }
//        }.start();
//
//        Thread runnable = new Thread(new MyRunnable());
//        runnable.start();

        int arr[] = new int[5];
        int myArray[] = {10,20,30,40,50};

        for (int i= 0; i<myArray.length; i ++) {
            arr[i] = myArray[i];
            System.out.println("Array Values " + myArray[i] + " is at index " + i);
        }

//        for (int i= 0; i<arr.length; i ++) {
//            System.out.println("Array Values " + arr[i] + " is at index " + i);
//        }

        int mulitiArray[][] = new int[3][4];

        int myMulti[][] = {
                {1,2,3}, {4,5,6}, {7,8,9}
        };

        for (int i =0; i<3; i ++) {
            for (int j=0; j<3; j++) {
                System.out.print(myMulti[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("I am in Main thread again..!!");
    }
}
