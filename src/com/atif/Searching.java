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


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Searching sr = new Searching();
        int[] nums = {3, 0, 4, 2, 1};

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
        int[] numbers = {2, 3, 4};
        int target = 6;
        System.out.println(Arrays.toString(sr.twoSumII(numbers, target)));

    }
}
