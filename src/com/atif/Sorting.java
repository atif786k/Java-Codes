package com.atif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
    }

    //    Only for continuous numbers for range 1 to N
    static void cyclicSortI(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int current = arr[i] - 1;
            if (arr[i] != arr[current]) {
                int temp = arr[i];
                arr[i] = arr[current];
                arr[current] = temp;
            } else {
                i++;
            }
        }
    }

    //    Cyclic Sort whose range is 0 to N
    static void cyclicSortII(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < arr.length) {
            int current = arr[i];
            if (arr[i] == n) {
                i++;
            } else if (arr[i] != arr[current]) {
                int temp = arr[i];
                arr[i] = arr[current];
                arr[current] = temp;
            } else {
                i++;
            }
        }
    }

    static int findMissingNum(int[] arr) {
        int store = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                store = i;
                break;
            } else {
                store = arr.length;
            }
        }
        return store;
    }

    static List<Integer> findAllMissingNum(int[] arr) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                res.add(i + 1);
            }
        }
        return res;
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

    static int findDuplicate(int[] arr) {
        int store = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                store = arr[i];
            }
        }
        return store;
    }

    //    Q-Set Mismatch :-
    static int[] findErrorNum(int[] arr) {
        int[] arr1 = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                arr1[0] = arr[i];
            }
            if (arr[i] != i + 1) {
                arr1[1] = i + 1;
            }
        }
        return arr1;
    }

    static int maximumProduct(int[] arr) {
        int i = arr.length - 1;
        int j = arr.length - 2;
        int result = (arr[i] - 1) * (arr[j] - 1);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,2};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(maximumProduct(arr));

    }
}
