package com.atif;

import java.util.*;
// Basics and Arrays questions :

public class BasicsPractice {
    static void max_min(int arr[], int max, int min) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum Number: " + max);
        System.out.print("Minimum number: " + min);
    }

    public static void pythagoreanTriplet(int a, int b, int c) {
        if ((a * a) + (b * b) == c * c || (a * a) + (c * c) == b * b || (b * b) + (c * c) == a * a) {
            System.out.println("Given number is a Pythagorean Triplet");
        } else {
            System.out.println("Not a Pythagorean Triplet");
        }
    }

    public static void printPrime(int start, int end) {
        int flag = 0;
        for (int i = start; i < end; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println("Number is Prime: " + i);
            }
        }
    }

    public static void printNatural(int n) {
        int sum = 0;
        System.out.println("Natural numbers are as follow:-");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
            sum += i;
        }
        System.out.println("Sum of n natural number is : " + sum);
    }

    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                arr.add(nums[i]);
            }
        }
        arr.add(nums[nums.length - 1]);
        int res = arr.size();
        System.out.println(arr);
        return res;
    }

    public void rotateArray(int[] num, int k) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        if (num.length >= k) {
            for (int i = 0; i < num.length - k; i++) {
                newArr.add(num[i]);
            }
            int remain = num.length - k;
            int newIndx = 0;
            for (int j = remain; j < num.length; j++) {
                num[newIndx] = num[j];
                newIndx++;
            }
            int x = 0;
            for (int l = k; l < num.length; l++) {
                num[l] = newArr.get(x);
                x++;
            }
        } else if (num.length < k) {
            k = k - num.length;
            rotateArray(num, k);
        }
        System.out.println("Result : " + Arrays.toString(num));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Q-Find even or odd number:-
//        System.out.print("Enter the number: ");
//        int a = sc.nextInt();
//        if (a%2==0){
//            System.out.println("Even Number");
//        } else{
//            System.out.println("Odd Number");
//        }

//        Q-Find the largest between two numbers:-
//        System.out.print("Enter the first number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter the second number: ");
//        int b = sc.nextInt();
//        if (a>b){
//            System.out.println(a + " is greater");
//        } else{
//            System.out.println(b + " is greater");
//        }

//        Q-Fibonacci series up to n number:-
//        System.out.print("Enter the n number of the series: ");
//        int n = sc.nextInt();
//        int a=0, b=1;
//        int sum =0;
//        while (sum<=n){
//            System.out.println(sum);
//            a=b;
//            b=sum;
//            sum = a+b;
//        }

//        Q-Given string is palindrome or not:-
//        String str="mom", reverseStr="";
//        for (int i=(str.length()-1); i>=0; --i){
//            reverseStr += str.charAt(i);
//        }
//        if (str.equals(reverseStr)){
//            System.out.println("String is Palindrome");
//        } else{
//            System.out.println("String is not Palindrome");
//        }

//        Q-Take integer inputs till the user enters 0 and print the sum of all numbers & print the largest number from all.:-
//        int sum = 0, variables = 0;
//        while (true) {
//            System.out.print("Enter the number: ");
//            int a = sc.nextInt();
//            if (a == 0) {
//                break;
//            } else if (a >= variables) {
////                sum+=a;
//                variables = a;
//            }
//        }
////        System.out.println(sum);
//        System.out.println(variables);


//        Q-Reverse an array to K integer and print it with the rest of it :-   IMPORTANT
//        more the loop more the Time Complexity

//        int n=5;
//        int []arr={1,2,3,4,5};
//        System.out.print("Enter the k value: ");
//        int k=sc.nextInt();
//        int []newArr1=new int[n];
//        for(int i=k-1; i>=0; i--){
//            newArr1[k-(i+1)]=arr[i];
//        }
//        for(int i=k; i<arr.length; i++){
//            newArr1[i]=arr[i];
//        }
//        System.out.println(Arrays.toString(newArr1));

//        Q-Kunal is allowed to go out on even days of a month. Write a program to count the number of days he can go out in the month of August:-
//            int monthDays=31;
//            int allowed=0;
//            for(int i=1; i<=monthDays; i++){
//               if (i%2==0){
//                   allowed++;
//               }
//            }
//        System.out.println("Kunal is allowed to go out for only " +allowed+ " days in a month of August.");

//        Q-Sum of negative numbers, sum of positive even and odd numbers from a list of number entered by user:-
//        int positiveEven=0, positiveOdd=0, negativeSum=0;
//        while(true){
//            System.out.print("Enter the number : ");
//            int a=sc.nextInt();
//            if (a==0){
//                break;
//            } else if(a<0){
//                negativeSum+=a;
//            }
//            else if (a%2==0){
//                positiveEven+=a;
//            } else{
//                positiveOdd+=a;
//            }
//        }
//        System.out.println("Positive Odd number: " + positiveOdd);
//        System.out.println("Positive Even number: " + positiveEven);
//        System.out.println("Negative Number: " + negativeSum);

//        Q-Find largest and smallest in 3 inputs from user by using Method:-
//        int []arr=new int[3];
//        for (int i=0; i<arr.length; i++){
//            System.out.print("Enter the number "+i+ " : ");
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        max_min(arr, arr[0], arr[0]);

//        Q-Find the number is prime or not:-
//        System.out.print("Enter the number: ");
//        int a=sc.nextInt();
//        int flag=0;
//        for (int i=2; i<a; i++){
//            if (a==0 || a==1){
//                flag=0;
//            } else if (a%i==0){
//                flag=0;
//                break;
//            } else{
//                flag=1;
//            }
//        }
//        if (flag==1){
//            System.out.println("Number is Prime: "+a);
//        } else{
//            System.out.println("Not Prime...");
//        }

//        Q-Factorial of n number:-   (without using recursive function)
//        System.out.print("Enter the number: ");
//        int a=sc.nextInt();
//        int result=1;
//        if (a==0){
//            result=0;
//        } else{
//            for (int i=1; i<=a; i++){
//                result*=i;
//            }
//        }
//        System.out.println("Factorial of " +a+ "! is: "+result);

//        Q-Function to find a pythagoras triplet:-
//        pythagoreanTriplet(96,247,265);

//        Q-Function that returns all prime numbers between two given numbers:-
//        printPrime(50, 100);

//        Q-Function to print first n natural numbers:-
//        printNatural(10);

//        int []nums={1,2,3,4};
//        int res=0;
//        for (int i=0; i<nums.length; i++){
//            res+=nums[i];
//        }
//        System.out.println(res);


//        Q-LeetCode question on Richest customer wealth:-
//        int[][] arr = new int[3][3];
//        int[] store = new int[arr.length];
//        int sum = 0;
//        int max = store[0];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = sc.nextInt();
//                sum += arr[i][j];
//                store[i] = sum;
//            }
//            sum = 0;
//        }
//        for (int i = 0; i < store.length; i++) {
//            if (max < store[i]) {
//                max = store[i];
//            }
//        }
//        System.out.println(max);

//
//        Q-LeetCode Shuffle the Array:-
//        int []arr={1,3,5,7,2,4,6,8};
//        int len=arr.length;
//        int n=4;
//        int j=0;
//        int k=0;
////        int []arr1=new int[n];
////        int []arr2=new int[len-arr1.length];
//        int []shuffle=new int[len];
//
////        for (int i=0; i<n; i++){
////            arr1[i]=arr[i];
////        }
////        for (int i=n; i<len; i++){
////            arr2[i-n]=arr[i];
////        }
//        for (int i=0; i<len; i+=2){
//            shuffle[i]=arr[k];
//            k++;
//        }
//        for (int i=1; i<shuffle.length; i+=2){
//            shuffle[i]=arr[n+j];
//            j++;
//        }
//        System.out.println(Arrays.toString(shuffle));


//        Q-LeetCode Kids with Candies:-
//        int[] candies = {4, 2, 1, 1, 2};
//        int flag = 0;
//        int extraCandies = 1;
//        int[] newCandies = new int[candies.length];
//        boolean[] output = new boolean[candies.length];
//        for (int i = 0; i < newCandies.length; i++) {
//            newCandies[i] = candies[i] + extraCandies;
//            for (int j = 0; j < candies.length; j++) {
//                if (newCandies[i] < candies[j]) {
//                    flag = 0;
//                    break;
//                } else {
//                    flag = 1;
//                }
//            }
//            if (flag == 0) {
//                output[i] = false;
//            } else {
//                output[i] = true;
//            }
//        }
//        System.out.println(Arrays.toString(output));


//        int[] nums = {1,2,3};
//        int pairs = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == nums[j] && i < j) {
//                    pairs += 1;
//                }
////                else{
////                    pairs=0;
////                }
//            }
//        }
//        System.out.println(pairs);


//        int [] nums={8,1,2,2,3};
//        int []arr=new int[nums.length];
//        int smaller=0;
//        for (int i=0; i<nums.length; i++){
//            for (int j=0; j<nums.length; j++){
//                if (nums[i]>nums[j] && j!=i){
//                    smaller+=1;
//                    arr[i]=smaller;
//                }
//            }
//            smaller=0;
//        }
//        System.out.println(Arrays.toString(arr));


//        int []nums={0,1,2,3,4};
//        int []index={0,1,2,2,1};
////        int []target=new int[nums.length];
//        List<Integer> list=new ArrayList<>();
//        for (int i=0; i<nums.length; i++){
////            target[index[i]]=nums[i];
//            list.add(index[i],nums[i]);
//        }
//        System.out.println(list);


//        int []gain={-4,-3,-2,-1,4,3,2};
//        int compare=0;
//        int []highest=new int[gain.length+1];
//        for (int i=0; i<gain.length; i++){
//            highest[i]=compare;
//            highest[i+1]=(gain[i])+compare;
//            compare=highest[i+1];
//        }
//        int max = Arrays.stream(highest).max().getAsInt();
////        if(max>0){
////            System.out.println(max);
////        } else{
////            System.out.println("0");
////        }
//        System.out.println(max);


//        int [][]image={{1,1,0},{1,0,1},{0,0,0}};
//        int [][]flip=new int[image.length][image.length];
//        int m=0;
//        for(int i=0; i< image.length; i++){
//            for (int j= image[i].length-1; j>=0; j--){
//                flip[i][m]=image[i][j];
////                if (m<=j){
//                    m++;
////                }
//            }
//            m=0;
//        }
//
//        for (int i=0; i< flip.length; i++){
//            for (int j=0; j<flip[i].length; j++){
//                if (flip[i][j]==1){
//                    flip[i][j]=0;
//                } else{
//                    flip[i][j]=1;
//                }
//            }
//        }
//
//        for (int i=0; i< flip.length; i++){
//            for (int j=0; j< flip[i].length; j++){
//                System.out.print(flip[i][j]+ " ");
//            }
//            System.out.println();
//        }

//        Q-Diagonal Matrix sum:--
//        int[][] arr = {{1,1,1,1},
//                {1,1,1,1},
//                {1,1,1,1},
//                {1,1,1,1}};
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i == j) {
////                    primarySum[i]=arr[i][j];
//                    list.add(arr[i][j]);
//                }
//            }
//        }
//        int m=0;
//        int n=arr.length-1;
//        while(m<arr.length && n>=0){
////            secondarySum[m]=arr[m][n];
//            if (m!=n){
//                list.add(arr[m][n]);
//
//            }
//            m++;
//            n--;
//        }
//        int sum=0;
//        for (int i=0; i<list.size(); i++){
//            sum+=list.get(i);
//        }
//
//        System.out.println(sum);
//        System.out.println(list);


//

        //Q-Two sum:--
//        int []arr={1,2,3};
//        int target=9;
//        int []arr1={};
//        int k=0;
//        for (int i=0; i<arr.length; i++){
//            for (int j=i+1; j<arr.length; j++){
//                if(arr[i]+arr[j]==target){
//                    System.out.println(i +","+ j);
//                    return {i,j};
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr1));


//        int[]nums={2,7,11,15};
//        int []arr1=new int[2];
//        int k=0;
//        for(int i=0; i<nums.length-1; i++){
//            for (int j=i+1; j<nums.length; j++){
//                if(target==nums[i]+nums[j]){
//                    arr1[k]=i;
//                    k++;
//                    arr1[k]=j;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr1));


//        Q-Remove duplicates from sorted array:--
//        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        BasicsPractice bsp = new BasicsPractice();
//        System.out.println(bsp.removeDuplicates(nums));


//        Q-Numbers with even numbers of digits:--
//        int []arr={43,3,443,5555};
//        int out=0;
//        for(int i=0; i<arr.length; i++){
//            String str=Integer.toString(arr[i]);
//            int len=str.length();
//            if (len %2==0){
////                System.out.println("Number is of even length");
//                out+=1;
//            }
//        }
//        System.out.println(out);


//        Q-Transpose the matrix:--
//        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
//        int [][]resMatrix=new int[matrix[0].length][matrix.length];
//        int newIndexI=0;
//        int newIndexJ=0;
//        for(int i=0; i<matrix.length;i++){
//            for(int j=0; j<matrix[i].length; j++){
//                resMatrix[newIndexI][newIndexJ]=matrix[i][j];
//                newIndexI+=1;
//            }
//            newIndexI=0;
//            newIndexJ+=1;
//        }
//        for(int i=0; i<resMatrix.length;i++){
//            for(int j=0; j<resMatrix[i].length; j++){
//                System.out.print("["+ resMatrix[i][j] +"]");
//            }
//            System.out.println(" ");
//        }


//        Q-Add to Array-Form of Integer:--
//        First approach runTime error k and num storing value exceeds its limit:--
//        int[] num = {2,1,5};
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        int k = 806;
//        String str = "";
//        for (int i = 0; i < num.length; i++) {
//            str += Integer.toString(num[i]);
//
//        }
//        int sum = Integer.parseInt(str)+k;
//        String res=Integer.toString(sum);
//        for(int j=0; j<res.length(); j++){
//            arr.add(Character.getNumericValue(res.charAt(j)));
//        }
//
//        System.out.println(arr);


//        Second approach :--
//        int[] num = {2, 1, 5};
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        int k = 806;
//        for (int i = num.length - 1; i >= 0; i--) {
//            if (i == 0) {
//                k += num[i];
//                arr.add(k % 10);
//                int a = num[i] + k;
//                a /= 10;
//                if (a > 0) {
//                    arr.add(a);
//                }
//            } else {
//                k += num[i];
//                arr.add(k % 10);
//                k /= 10;
//            }
//        }
//        Collections.reverse(arr);
//        System.out.println(arr);


//        Q-Find the smallest positive integer in an array:--
//        int []nums={2,1};
//        Arrays.sort(nums);
//        int small=1;
//        for (int i=0; i<nums.length; i++){
//            if (small==nums[i]){
//                small+=1;
//            }
//        }
//        System.out.println(small);


//        Q-Max value of equation:--
//        int [][]points={{-19,9},{-15,-19},{-5,-8}};
////        ArrayList<Integer> res = new ArrayList<Integer>();
//        int k=10;
//        int maximum = Integer.MIN_VALUE;
//        for(int i=0; i<points.length; i++){
//            for(int j=i+1; j<points.length; j++){
//                int diff=Math.abs(points[i][0]-points[j][0]);
//                if (diff<=k){
//                    int equ=points[i][1]+points[j][1]+diff;
////                    res.add(equ);
//                    if (maximum<equ){
//                        maximum=equ;
//                    }
//                }
//            }
//        }
//        System.out.println(maximum);
//        System.out.println(Arrays.toString(res));
//        System.out.println(Arrays.stream(res).max().getAsInt());


//        Q-Lucky number in a matrix:--
//        Not solved YET:--

//        int [][]matx={{1,10,4,2}, {9,3,8,7}, {15,16,17,12}};
//        ArrayList<Integer> luckyNum = new ArrayList<Integer>();
//        int x=0;
//        int y=0;
////        int smallest=matx[x][y];
//        int largest=0;
//        for(int i=0; i<matx.length; i++){
//            for(int j=0; j<matx[i].length-1; j++){
//               if (matx[i][j]<matx[x][y]){
//                   matx[x][y]=matx[i][j];
//               }
//            } x++; luckyNum.add(matx[x][y]);
//        }
//        System.out.println(luckyNum);
//        System.out.println(Arrays.stream(matx[0]).min().getAsInt());


//        Q-Reshape the matrix:--
//        int[][] mat = {{1, 2}, {3, 4}};
//        int r = 2;  //row
//        int c = 4;  //column
//        int[][] resMat = new int[r][c];
//        int matRow = mat.length;
//        int matCol = mat[0].length;
//
//        if (r * c == matRow * matCol) {
//            System.out.println("we can proceeds further");
//            int resRow = 0;
//            int resCol = 0;
////            for(int i=0; i<matRow; i++){
//            int i = 0;
//            while (i < matRow) {
//                for (int j = 0; j < matCol; j++) {
//                    resMat[resRow][resCol] = mat[i][j];
//                    resCol += 1;
//                    if (resCol == c) {
//                        resCol = 0;
//                        resRow += 1;
//                    }
//                }
//                i += 1;
//            }
//            System.out.println(Arrays.deepToString(resMat));
//        } else {
//            System.out.println(Arrays.deepToString(mat));
//        }


//        Q-Plus one:--
//        int[] digits={1,2,3};
//        for (int i = digits.length -1; i >= 0; i--) {
//            if (digits[i] < 9) {
//                digits[i]++;
//                digits[1]=digits[i];
//            }
//            digits[i] = 0;
//        }
//        System.out.println(Arrays.toString(digits));


//        Q-Product of Array Except Self:--
//        int []nums={1,2,3,2};
//        int n =nums.length;
//        int []resNum=new int[nums.length];
//        int sum=1;
////        for(int i=0; i<nums.length; i++){
////            for (int j=0; j<nums.length; j++){
////                if (i!=j){
////                    sum*=nums[j];
////                }
////            }
////            resNum[i]=sum;
////            sum=1;
////        }  //Solved with this method but time error occurs:-


//        Second method:--
//        int[]left=new int[n];
//        int[]right=new int[n];
//        for (int i=0; i<n; i++){
//            left[i]=nums[i-1]*
//        }
//        System.out.println(Arrays.toString(resNum));


//        Q-Find First and Last Position of Element in Sorted Array:--
//        int[] nums = {5,7,7,8,8,10};
//        int target = 7;
//        int []indexes=new int[2];
//
//        if(nums.length==0){
//            indexes[0]=-1;
//            indexes[1]=-1;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            if (target==nums[i]) {
//                indexes[0]=i;
//                break;
//            } else {
//                indexes[0]=-1;
//            }
//        }
//        for (int j = nums.length-1; j >= 0; j--) {
//            if (target==nums[j]) {
//                indexes[1]=j;
//                break;
//            } else {
//                indexes[1]=-1;
//            }
//        }
//        System.out.println(Arrays.toString(indexes));


//        Q-Set matrix zeroes:--
//        int[][] matx = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
//        ArrayList<Integer> rowArr = new ArrayList<Integer>();
//        ArrayList<Integer> colArr = new ArrayList<Integer>();
//
//        //storing the indexes of the zeroes present in the array:
//        for (int i = 0; i < matx.length; i++) {
//            for (int j = 0; j < matx[i].length; j++) {
//                if (matx[i][j] == 0) {
//                    rowArr.add(i);
//                    colArr.add(j);
//                }
//            }
//        }
//
//        //puttting zero in places according to the stored indexes:
//        for (int x = 0; x < rowArr.size(); x++) {
//            for (int y = 0; y < matx[0].length; y++) {
//                matx[rowArr.get(x)][y] = 0;
//            }
//        }
//        for (int x = 0; x < colArr.size(); x++) {
//            for (int y = 0; y < matx.length; y++) {
//                matx[y][colArr.get(x)] = 0;
//            }
//        }
//        System.out.println(Arrays.deepToString(matx));


//        Q-Rotate array:--
//        int[] num = {-1,-100,3,99};
//        int k = 2;
//        BasicsPractice bcp = new BasicsPractice();
//        bcp.rotateArray(num, k);

//        Q-Sort Colors:--
//        0=red;
//        1=white;
//        2=blue;
//        int []num={2,0,2,1,1,0};
//        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));


//        Q-House Robber:--
//        int[] house = {1, 3, 1};
//        int amountStore=0;
//        int num = house.length;
//        if (num % 2 == 0) {
//            int amountLeft = 0;
//            int amountRight = 0;
//            for (int i = 0; i < house.length; i += 2) {
//                amountLeft += house[i];
//            }
//            for (int j = house.length - 1; j >= 0; j -= 2) {
//                amountRight += house[j];
//            }
//            if (amountLeft > amountRight) {
//                System.out.println(amountLeft);
//            } else {
//                System.out.println(amountRight);
//            }
//        } else {
//            int indexZero = 0;
//            int indexZeroPlusOne = 0;
//            for (int i = 0; i < house.length; i += 2) {
//                indexZero += house[i];
//            }
//            for (int i = 1; i < house.length; i += 2) {
//                indexZeroPlusOne += house[i];
//            }
//            if (indexZero > indexZeroPlusOne) {
//                System.out.println(indexZero);
//            } else {
//                System.out.println(indexZeroPlusOne);
//            }
//        }


//        Q-Maximum population year:--
//        int [][]logs={{1950,1961}, {1960,1971}, {1970,1981}, {1955, 1962}};
//        int []maxPop=new int[logs.length];
//        int maxNum=0;
//        int []maxNums=new int[logs.length];
//
//        for (int i=0; i<logs.length-1; i++){
//            for (int j=1; j<logs.length; j++){
//                if (logs[i][1]>logs[j][0]){
//                    maxPop[i]=logs[j][0];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(maxPop));
//        System.out.println(Arrays.toString(maxNums));


//        Q-Jump game :- ( not solved )
//        int[] arr = {2, 0};
//        System.out.println(canJump(arr));

//        Q-Remove element from array :-
//        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
//        int val = 2;
//        System.out.println(Arrays.toString(removeElement(arr, val)));

//        Q-Single Element :-
//        int[] arr = {2,2,1};
//        System.out.println(singleNumber(arr));

//        Q-Median of two sorted array :-
//        int[] arr1 = {1, 3};
//        int[] arr2 = {2, 4};
//        System.out.println(medianTwoArr(arr1, arr2));

//        Q-Rotate Image:-
        int[][] arr = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
//        rotateImage(arr);
//        System.out.println(arr.length-1);
//        System.out.println(arr[0]);
        System.out.println("Rotate Image is : " + Arrays.deepToString(rotateImage(arr)));
//        int y=arr[0].length-1;
//        System.out.println(y);
//        y--;
//        System.out.println(y);

    }

    static int[][] rotateImage(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        // Transpose the matrix (swap rows with columns)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse each row to complete the rotation
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][m - 1 - j];
                arr[i][m - 1 - j] = temp;
            }
        }
        return arr;
    }

    static double medianTwoArr(int[] arr1, int[] arr2) {
        double median = 0;
        int newIndex = 0;
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[newIndex] = arr1[i];
            newIndex++;
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[newIndex] = arr2[j];
            newIndex++;
        }
        Arrays.sort(arr3);
        int start = 0;
        int end = arr3.length - 1;
        int mid = start + (end - start) / 2;
        if (arr3.length % 2 != 0) {
            median = (double) arr3[mid];
        } else {
            double sum = (double) (arr3[mid] + arr3[mid + 1]) / 2;
            median = sum;
        }
        return median;
    }

    static int singleNumber(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                end--;
            } else if (arr[start] == arr[end]) {
                start++;
            }
        }
        return arr[start];
    }

    static int[] removeElement(int[] arr, int val) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[count] = arr[i];
                count++;
            }
        }
        System.out.println(count);
        return arr;
    }

    static boolean canJump(int[] arr) {
        if (arr.length == 1) {
            return true;
        }
        int reachableLast = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > reachableLast) {
                return false;
            }
            reachableLast = Math.max(reachableLast, i + arr[i]);
            if (reachableLast >= arr.length - 1) {
                return true;
            }
        }
        return false;
    }
}



