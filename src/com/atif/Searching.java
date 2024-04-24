package com.atif;

import java.util.Arrays;
import java.util.Scanner;
//Searching ( Linear and Binary ) Questions :

public class Searching {
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


    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;

    }

    static int searchInsetPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

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

    //    Finding the missing number in the range of the length of given array:--
    static int missingNumber(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);
        int missNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (missNum == arr[i]) {
                missNum += 1;
            }
        }
        return missNum;
    }

    public char findingChar(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

    //    public int[] twoSumII(int[] numbers, int target) {
//        int[] indicies = new int[2];
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == target && i != j) {
//                    indicies[0] = i + 1;
//                    indicies[1] = j + 1;
//                }
//            }
//        }
//        return indicies;
//    }

    //    Two Pointer algorithm :-
    public int[] twoSumII(int[] numbers, int target) {
        int[] indicies = new int[2];
        int s = 0;
        int e = numbers.length - 1;
        while (s < e) {
            int sum = numbers[s] + numbers[e];
            if (sum == target) {
                indicies[0] = s + 1;
                indicies[1] = e + 1;
                break;
            } else if (sum > target) {
                e -= 1;
            } else {
                s += 1;
            }
        }
        return indicies;
    }

    public int peakIndexMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

//        First approach :-
//        while (s <= e) {
//            if (arr[s] > arr[e] && arr.length >= 3) {
//                e--;
//            } else {
//                s++;
//            }
//        }
//        return e;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid + 1]) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

//    Q-Find the first bad version :-
//    public int firstBadVersion(int n) {
//        int s = 1;
//        int e = n;
//        int ans = 0;
//        while(s <= e){
//            int mid = s + (e - s) / 2;
//            boolean x = isBadVersion(mid);
//            if(x == true){
//                ans = mid;
//                e = mid - 1;
//            } else{
//                s = mid + 1;
//            }
//        }
//        return ans;
//    }

    public boolean checkIfExists(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    static int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] == nums[mid + 1]) {
                s = mid + 2;
            } else {
                e = mid;
            }
        }
        return nums[s];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Searching sr = new Searching();
//        int[] nums = {3, 0, 4, 2, 1};

//        Q-Search Insert Position:-
//        int ans=searchInsetPosition(nums, 10);
//        System.out.println(ans);

//        Q-Missing Number:-
//        int ans = missingNumber(nums);
//        System.out.println(ans);

//        Q-Find smallest letter greater than target:-
//        char[] letters = {'c', 'f', 'j'};
//        char target = 'a';
//        int ans = sr.findingChar(letters, target);
//        System.out.println(ans);

//        Q-Two Sum II:-
//        int[] numbers = {2, 3, 4};
//        int target = 6;
//        System.out.println(Arrays.toString(sr.twoSumII(numbers, target)));

//        Q-Peak Index in Mountain Array :-
//        int[] arr = {0, 10, 1, 2, 3, 4, 50};
//        System.out.println(sr.peakIndexMountainArray(arr));

//        Q-check if N and it's double exists or not :-
//        int[] arr = {10, 2, 5, 3};
//        System.out.println(sr.checkIfExists(arr));

//        Q-Search non-duplicate number in the given array :-
//        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};
//        System.out.println(singleNonDuplicate(arr));

//        Q-Searching in rotated sorted array :-
        int[] arr = {10, 11, 12, 0, 1, 2, 3};
//        int target = 0;
//        boolean ans = searchingUsingPivot(arr, target);
//        System.out.println(ans);
//        System.out.println(findPivotInDuplicate(arr));

        System.out.println(findMinimumInRotatedArray(arr));

    }

    static int findMinimumInRotatedArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            } else if (start == end) {
                return arr[start];
            } else if (arr[start] < arr[mid] && arr[mid] < arr[end] || arr[start] < arr[end]) {
                return arr[start];
            } else if (arr[start] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int findPivotInDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                if (start < end && arr[start] < arr[start + 1]) {
                    return start;
                }
                start += 1;
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end += 1;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    static boolean binarySearchUsingPivot(int start, int end, int[] arr, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target) {
                return true;
            }
        }
        return false;
    }

    static boolean searchingUsingPivot(int[] arr, int target) {
        int pivot = findPivotInDuplicate(arr);
        if (pivot == -1) {
            return binarySearchUsingPivot(0, arr.length - 1, arr, target);
        }
        if (arr[pivot] == target) {
            return true;
        }
        if (target >= arr[0]) {
            return binarySearchUsingPivot(0, pivot - 1, arr, target);
        }
        return binarySearchUsingPivot(pivot + 1, arr.length - 1, arr, target);
    }


//    Searching in rotated sorted array :-
//    static int findPivot(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (mid < end && arr[mid] > arr[mid + 1]) {
//                return mid;
//            } else if (mid > start && arr[mid] < arr[mid - 1]) {
//                return mid - 1;
//            } else if (arr[mid] < arr[start]) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//        return -1;
//    }
//
//    static int binarySearchUsingPivot(int start, int end, int[] arr, int target) {
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid] > target) {
//                end = mid - 1;
//            } else if (arr[mid] < target) {
//                start = mid + 1;
//            } else if (arr[mid] == target) {
//                return mid;
//            }
//        }
//        return -1;
//    }
//
//    static int searchingUsingPivot(int[] arr, int target){
//        int pivot = findPivot(arr);
//        if (pivot == -1){
//            return binarySearchUsingPivot(0, arr.length - 1, arr, target);
//        }
//        if (arr[pivot] == target){
//            return pivot;
//        }
//        if (target >= arr[0]){
//            return binarySearchUsingPivot(0, pivot - 1, arr, target);
//        }
//        return binarySearchUsingPivot(pivot + 1, arr.length - 1, arr, target);
//    }
}
