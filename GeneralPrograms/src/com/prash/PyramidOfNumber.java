package com.prash;

public class PyramidOfNumber {

    //              1
//                 2 2
//                3 3 3
//               4 4 4 4
    public void patternNum(int rows) {
        int count = 1;

        for( int i = rows; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= count; j++) {
                System.out.print(count + " "); //For printing row numbers in the pattern
//                System.out.print("* "); //fOR PRINTING * in place of numbers
                System.out.print(j + " "); //For printing sequence numbers in the pattern
            }

            System.out.println();
            count++;
        }

    }
}
