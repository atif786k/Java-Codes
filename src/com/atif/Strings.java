package com.atif;

import javax.naming.Binding;
import javax.script.Bindings;
import java.util.Arrays;

public class Strings {

    static String defangIP(String address) {
        StringBuilder defang = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                defang.append("[.]");
            } else {
                defang.append(address.charAt(i));
            }
        }
        return defang.toString();
    }

    static String shuffleString(String s, int[] indices) {
        StringBuilder shuffle = new StringBuilder();
        for (int i = 0; i < indices.length; i++) {
            shuffle.append(s.charAt(indices[i]));
        }
        return shuffle.toString();
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";
//        System.out.println(defangIP(address));

        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        cyclicSortII(indices);
        System.out.println(Arrays.toString(indices));
        System.out.println(shuffleString(s, indices));
    }

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
}
