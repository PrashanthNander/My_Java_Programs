package com.prash;

/**
 * Selection sort is not difficult to analyze compared to other sorting algorithms since none of the loops depend
 * on the data in the array. Selecting the lowest element requires scanning all n elements (this takesn − 1 comparisons)
 * and then swapping it into the first position. Finding the next lowest element requires scanning the remaining
 * n − 1 elements and so on, for (n − 1) + (n − 2) + ... + 2 + 1 = n(n − 1) / 2 ∈ Θ(n2) comparisons. Each of these
 * scans requires one swap for n − 1 elements.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
        //selc_sort(arr1);
        selc_sort(arr1);
        prinArr(arr1);
    }

    public static void selc_sort(int[] arr) {
        for ( int i=0; i< arr.length-1; i ++) {
            int index = i;
            for (int j= i+1; j< arr.length ; j++) {
                //System.out.println("index="+index +" and j="+j);
                if ( arr[index] > arr[j]) {
                    //System.out.println(arr[index] +" is greater than " + arr[j]);
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            prinArr(arr);
            System.out.println();
        }
    }

    public static void prinArr(int[] inputArr) {
        for(int i = 0; i < inputArr.length; i++) {
            System.out.print(inputArr[i]+ " ");
        }
    }
}
