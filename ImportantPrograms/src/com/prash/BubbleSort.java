package com.prash;

/**
 * Bubble sort, also referred to as sinking sort, is a simple sorting algorithm that works by repeatedly stepping
 * through the list to be sorted, comparing each pair of adjacent items and swapping them if they are in the wrong order.
 * The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.
 * The algorithm gets its name from the way smaller elements "bubble" to the top of the list.
 * Because it only uses comparisons to operate on elements, it is a comparison sort. Although the algorithm is simple,
 * most of the other sorting algorithms are more efficient for large lists.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] inputArr = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        int[] result = bub_sort(inputArr);
        System.out.println("------------------------------------------");
        System.out.println("Final Out put");
        prinArr(inputArr);

    }

    public static int[] bub_sort(int[] inputArr) {
        int temp;
        for(int i = 0; i < inputArr.length-1; i++) {
            for (int j = i+1; j< inputArr.length; j++) {
                if (inputArr[i] > inputArr[j]) {
                    //System.out.println("i=["+inputArr[i]+"] and j=["+inputArr[j] +"]");
                    temp = inputArr[i];
                    inputArr[i] = inputArr[j];
                    inputArr[j] = temp;
                }
            }
            //System.out.println("=========================================");
            prinArr(inputArr);
            System.out.println();
        }
        return inputArr;
    }

    public static void prinArr(int[] inputArr) {
        for(int i = 0; i < inputArr.length; i++) {
            System.out.print(inputArr[i]+ " ");
        }
    }
}
