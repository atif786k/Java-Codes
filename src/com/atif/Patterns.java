package com.atif;

public class Patterns {
    public static void main(String[] args){
//        pattern1(5);
//        pattern2(5);
        pattern3(5);
    }


    static void pattern3(int n){
        for (int row = 0; row <= 2*n; row++) {
            if (row > n){
                for (int col = 1; col < n-row+1; col++) {
                    System.out.print("*");
                }
                System.out.println("a;l");
            } else{
                for (int col = 1; col <= row; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
