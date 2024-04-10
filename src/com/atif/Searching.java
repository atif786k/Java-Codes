package com.atif;

import java.util.Arrays;
import java.util.Scanner;
//Sorting Questions :

public class Searching {
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

    static int searchInsetPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/ 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target) {
                return mid;
            }

        }
        return start;
    }

    static int missingNumber(int[] arr){
        return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4, 5, 21, 32, 45, 90};

//        Q-Search Insert Position:-
//        int ans=searchInsetPosition(nums, 10);
//        System.out.println(ans);

//        Q-Missing Number:-
        int ans=missingNumber(nums);
        System.out.println(ans);

    }
}
