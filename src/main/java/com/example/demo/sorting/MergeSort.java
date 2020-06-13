package com.example.demo.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int inputArray[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        mergeSort(inputArray, 0, inputArray.length - 1);
        System.out.println(Arrays.toString(inputArray));
    }

    private static void mergeSort(int[] inputArray, int startIndex, int endIndex) {

        if (startIndex < endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2; // Due to number overflow for large numbers due to negagive numbers.
            mergeSort(inputArray, 0, mid);
            mergeSort(inputArray, mid + 1, endIndex);
            merge(inputArray, startIndex, mid, endIndex);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {

        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
