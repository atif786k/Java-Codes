package com.atif;

import java.util.*;

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

    static void sortArrByParity(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] % 2 == 0) {
                i++;
            } else {
                if (arr[j] % 2 != 0) {
                    j--;
                } else {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
        }
    }

    static int specialArray(int[] arr) {
        int count = 0;
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= i) {
                    count++;
                }
            }
            if (count == i) {
                return i;
            }
            count = 0;
        }
        return -1;
    }

    static double averageSalary(int[] arr) {
        int employee = arr.length - 2;
        double avgeSal = 0.0;
        for (int i = 1; i < arr.length - 1; i++) {
            avgeSal += arr[i];
        }
        return avgeSal / employee;
    }

    static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        int minDiff = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < minDiff) {
                minDiff = arr[i + 1] - arr[i];
            }
        }
        System.out.println("Absolute minimum distance : " + minDiff);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minDiff && i + 1 > i) {
                list.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return list;
    }

    static int heightChecker(int[] arr) {
        int count = 0;
        int[] expected = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            expected[i] = arr[i];
        }
        insertionSort(expected);
        for (int i = 0; i < arr.length; i++) {
            if (expected[i] != arr[i]) {
                count++;
            }
        }
        return count;
    }

    static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int x = 0;
        int[] copy = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            copy[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            int target = arr2[i];
            for (int j = 0; j < copy.length; j++) {
                if (target == copy[j]) {
                    arr1[x] = copy[j];
                    x++;
                    copy[j] = Integer.MIN_VALUE;
                }
            }
        }
        Arrays.sort(copy);
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] != Integer.MIN_VALUE) {
                arr1[x] = copy[i];
                x++;
            }
        }
        return arr1;
    }

    static int[] arrayRankTransform(int[] arr) {
        int[] arr1 = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] >= arr[j] && i != j) {
                    count++;
                }
//                else if(arr[i] == arr[j]){
//                    count = count;
//                }
            }

            int rank = count + 1;
            arr1[i] = rank;
            count = 0;

        }
        return arr1;
    }

    //    Time Limit Exceeds:- ( Second solution )
    static int findKthLargest(int[] nums, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            res.add(nums[i]);
        }
        for (int i = 1; i < k; i++) {
            res.remove(Collections.max(res));
        }
        int max = Collections.max(res);
        return max;
    }


    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        int[] arr = {3, 2, 1, 5, 6, 4};

//        insertionSort(arr);
//        cyclicSortI(arr);
        int[] sortedArr = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(sortedArr));
    }
}
