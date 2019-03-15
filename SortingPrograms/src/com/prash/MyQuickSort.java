package com.prash;

public class MyQuickSort {

    private int arr[];
    private int length;

    public void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            System.out.println("Please input elements to sort.");
            return;
        }
        length = inputArr.length;
        this.arr = inputArr;

        quickSort(0, length-1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = arr[(higherIndex + lowerIndex) / 2];
        System.out.println("Pivot value = "+ pivot);

        while (i <= j) {

            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {

                //swap numbers
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }



    }

}
