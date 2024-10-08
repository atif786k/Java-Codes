package com.atif;

import java.util.*;
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
//        int[] arr = {10, 11, 12, 0, 1, 2, 3};
//        int target = 0;
//        boolean ans = searchingUsingPivot(arr, target);
//        System.out.println(ans);
//        System.out.println(findPivotInDuplicate(arr));

//        System.out.println(findMinimumInRotatedArray(arr));

//        Q-Finding minimum element in the rotated array :-
//        int[] arr = {1,2,3,4,5,3,1};
//        System.out.println(findMinInRotatedDuplicateArray(arr));

//        Q-Count smaller num after self :- ( Time limit exceeds )
//        int[] arr = {5,2,6,1};
//        System.out.println(countSmaller(arr));

//        Q-Intersection of two arrays :-
//        int[] num1 = {1, 2, 1};
//        int[] num2 = {2, 2};
//        System.out.println(Arrays.toString(intersectionII(num1, num2)));
        //4,5,9
        //4,4,8,9,9


//        Q-Count negative numbers :-
//        int[][] arr = {
//                {4, 3, 2, -1},
//                {3, 2, 1, -1},
//                {1, 1, -1, -2},
//                {-1, -1, -2, -3}
////                {5,1,0},
////                {-5,-5,-5}
//        };
//        System.out.println(countNegatives(arr));

//        Q-Find square root & validate if perfect square exist or not for x :-
//        int x = 15;
//        System.out.println(squareRoot(x));
//        System.out.println("Is x is perfect square or not : " + isPerfectSqr(x));

//        int[] arr = {3,5};
//        System.out.println(specialArray(arr));

        int target = 3;
//        System.out.println(reachNumber(target));
//        double = 11 / 4;

        int[] citations = {0, 1, 3, 5, 6};
//        System.out.println(hIndex(citations));
    }

    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = nums.length - 1;
                while (k < l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;

                        while (k < l && nums[k] == nums[k - 1]) {
                            k++;
                        }
                        while (k < l && nums[l] == nums[l + 1]) {
                            l--;
                        }
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return res;
    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];
                if (total > 0) {
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while (nums[j] == nums[j - 1] && j < k) {
                        j++;
                    }
                }
            }
        }
        return res;
    }

    static int arrangingCoins(int n) {
        int row = 0;
        while (n > 0 && n > row) {
            row++;
            n = n - row;
        }
        return row;
    }

    static int hIndex(int[] citations) {
        int i = 0;
        int j = citations.length - 1;
        int h = 0;
        while (i <= j) {
            int temp = citations[i];
            citations[i] = citations[j];
            citations[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(citations));
        for (int x = 0; x < citations.length; x++) {
            if (x > citations[x]) {
                System.out.println("X : " + x);
                h = x;
                break;
            }
        }
        return h;
    }


    //    Wrong :-
    static int reachNumber(int target) {
        int steps = 0;
        int i = 1;
        int count = 0;
        while (count <= target) {
            if (count == target) {
                return steps;
            } else if (count + i < target) {
                count = count + i;
                steps++;
                i++;
            } else if (count + i > target) {
                count = count - i;
                steps++;
                i++;
            }
        }
        return -1;
    }

    static boolean isPerfectSqr(int x) {
        int start = 0;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return true;
            } else if ((long) mid * mid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    static int squareRoot(int x) {
        int start = 0;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return Math.round(mid);
            } else if (mid * mid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return Math.round(end);
    }

    static int countNegatives(int[][] arr) {
        int count = 0;
        int r = 0;
        int c = arr[0].length - 1;
        System.out.println(c);
        while (r < arr.length && c >= 0) {
            if (arr[r][c] < 0) {
                count += arr.length - r;
                c--;
            } else if (arr[r][c] >= 0) {
                r++;
            }
        }
        return count;
    }

    static boolean search2Dmatrix(int[][] arr, int target) {
        int r = 0;
        int c = arr[0].length - 1;
        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return true;
            } else if (target < arr[r][c]) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }

    static int findDuplicate(int[] arr) {
        HashSet<Integer> res = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (res.contains(arr[i])) {
                return arr[i];
            }
            res.add(arr[i]);
        }
        return -1;
    }

    static int[] intersectionII(int[] num1, int[] num2) {
        Arrays.sort(num1);
        Arrays.sort(num2);
        ArrayList<Integer> res = new ArrayList<>();

//        Time limit exceeds :
//        for (int i = 0; i < num1.length; i++) {
//            int s = 0;
//            int e = num2.length - 1;
//            int target = num1[i];
//            while (s <= e) {
//                int mid = s + (e - s) / 2;
//                if (num2[mid] == target) {
//                    res.add(target);
//                    break;
//                } else if (target < num2[mid]) {
//                    e = mid - 1;
//                } else {
//                    s = mid + 1;
//                }
//            }
//            while (i < num1.length - 1 && num1[i] == num1[i + 1]) {
//                i++;
//            }
//        }
        int i = 0;
        int j = 0;
        while (i < num1.length && j < num2.length) {
            if (num1[i] < num2[j]) {
                i++;
            } else if (num1[i] > num2[j]) {
                j++;
            } else if (num1[i] == num2[j]) {
                res.add(num1[i]);
                i++;
                j++;
            }
        }
        int[] arr = new int[res.size()];
        for (int k = 0; k < res.size(); k++) {
            arr[k] = res.get(k);
        }
        return arr;
    }

    static int[] intersection(int[] num1, int[] num2) {
        HashSet<Integer> res1 = new HashSet<>();
        ArrayList<Integer> res2 = new ArrayList<>();
        for (int i = 0; i < num1.length; i++) {
            res1.add(num1[i]);
        }
        for (int i = 0; i < num2.length; i++) {
            if (res1.contains(num2[i])) {
                res2.add(num2[i]);
                res1.remove(num2[i]);
            }
        }
        int[] arr = new int[res2.size()];
        for (int i = 0; i < res2.size(); i++) {
            arr[i] = res2.get(i);
        }
        return arr;
    }

    //    @Contract(pure = true)
//    static List<Integer> countSmaller(int[] arr) {
//        ArrayList<Integer> count = new ArrayList<Integer>();
//        int counter = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    counter += 1;
//                }
//            }
//            count.add(counter);
//            counter = 0;
//        }
//        return count;
//    }


    static int findMinInRotatedDuplicateArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else if (arr[mid] < arr[start]) {
                end = mid;
            } else {
                end--;
            }
        }
        return arr[start];
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
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
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
