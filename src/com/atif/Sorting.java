package com.atif;

import java.util.Arrays;

public class Sorting {

    static int[] linearSorting(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxEleInd = maxElementIndex(arr, 0, last);
            int temp = arr[maxEleInd];
            arr[maxEleInd] = arr[last];
            arr[last] = temp;
        }
    }

    static int maxElementIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = 0; i <= end; i++) {
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static boolean containDuplicate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 3, 4, -1, 10, -20, -100};
//        System.out.println(Arrays.toString(linearSorting(arr)));

//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(containDuplicate(arr));

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
