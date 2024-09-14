package com.atif;

import java.util.ArrayList;
import java.util.List;

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

    static String interpret(String command) {
        StringBuilder output = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                output.append("G");
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                output.append("o");
                i += 2;
            } else {
                output.append("al");
                i += 4;
            }
        }
        return output.toString();
    }

    static boolean areEquivalent(String[] word1, String[] word2) {
        String one = "";
        String two = "";
        for (int i = 0; i < word1.length; i++) {
            one += word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            two += word2[i];
        }
        if (one.equals(two)) {
            return true;
        }
        return false;
    }

    static boolean halvesAreLike(String s) {
        int halfLength = s.length() / 2;
        int countI = 0;
        int countII = 0;

        for (int i = 0; i < halfLength; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                countI++;
            }
        }
        for (int i = halfLength; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                countII++;
            }
        }
        if (countI == countII) {
            return true;
        }
        return false;
    }

    static String decrypt(String s) {
        StringBuilder output = new StringBuilder();
        char c = 'a';
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == '#') {
                String st = s.substring(i - 2, i);
                output.append((char) (c + (Integer.parseInt(st) - 1)));
                i -= 3;
            } else {
                output.append((char) (c + (Integer.parseInt(String.valueOf(s.charAt(i))) - 1)));
                i--;
            }
        }
        return output.reverse().toString();
    }

    static boolean judgeCircle(String moves) {
        int[] currentPos = new int[2];
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') {
                currentPos[1]++;
            }
            if (moves.charAt(i) == 'L' && moves.charAt(i) > '0') {
                currentPos[1]--;
            }
            if (moves.charAt(i) == 'U' && moves.charAt(i) > '0') {
                currentPos[0]--;
            }
            if (moves.charAt(i) == 'D') {
                currentPos[0]++;
            }
        }
        if (currentPos[0] == 0 && currentPos[1] == 0) {
            return true;
        }
        return false;
    }

    static String reverseWords(String s) {
        StringBuilder output = new StringBuilder();
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            for (int j = str[i].length() - 1; j >= 0; j--) {
                output.append(str[i].charAt(j));
            }
            output.append(" ");
        }
        output.deleteCharAt(output.length() - 1);
        return output.toString();
    }


    //    From this question i assume that we can check the whole word of string with another string :-
//    .indexOf method gives the first index of the word "sad" from the other string:-
    static int firstOccurance(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        if (index != -1) {
            return index;
        }
        return -1;
    }

    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if (s.isEmpty()) return true;
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } else if (s.charAt(start) != s.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    static String reversePrefix(String str, char ch) {
        StringBuilder ouput = new StringBuilder();
        int index = str.indexOf(ch);
        for (int i = index; i >= 0; i--) {
            ouput.append(str.charAt(i));
        }
        for (int i = index + 1; i < str.length(); i++) {
            ouput.append(str.charAt(i));
        }
        return ouput.toString();
    }

    //    Not solved:
    static int repeatedStringMatch(String a, String b) {
        StringBuilder enter = new StringBuilder();
        int count = 0;
        while (enter.toString().contains(b)) {
            if (!enter.toString().contains(b)) {
                count++;
            }
        }
        return count;
    }

    //    Not solved:
    static List<List<String>> printVertically(String s) {
        List<List<String>> list = new ArrayList<>();
        String[] str = s.split(" ");
        int j;
        for (int i = 0; i < str.length; ) {
            for (j = 0; j < str[i].length(); ) {
                System.out.println(str[i].charAt(j));
                i++;
            }
            System.out.println(" ");
            j++;
        }

        return list;
    }

    static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char st = s[start];
            s[start] = s[end];
            s[end] = st;
            start++;
            end--;
        }
    }

    static int appendCharacter(String s, String t) {
        int sIndex = 0, tIndex = 0;
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                tIndex++;
            }
            sIndex++;
        }
        return t.length() - tIndex;
    }

//    static List<String> commonChars(String[] words) {
//        List<String> result = new ArrayList<>();
//        for (int i = 0; i < words[0].length(); i++) {
//            String str = words[0].charAt(i);
//            result.add(words[0].toString().charAt(i));
//        }
//        return result;
//    }


    public static void main(String[] args) {
        char[] cha = {'h', 'e', 'l', 'l', 'o'};
//        System.out.println(Arrays.toString(cha));
//        reverseString(cha);
//        System.out.println(Arrays.toString(cha));
//        System.out.println(cha[3]);

        String address = "1.1.1.1";
//        System.out.println(defangIP(address));

        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
//        cyclicSortII(indices);
//        System.out.println(Arrays.toString(indices));
//        System.out.println(shuffleString(s, indices))

        String command = "G()()()()(al)";
//        System.out.println(interpret(command));

        String[] word1 = {"ab", "bc"};
        String[] word2 = {"a", "bc"};
//        System.out.println(areEquivalent(word1, word2));

        String x = "Uo";
        x.toLowerCase();
//        System.out.println(halvesAreLike(x));


        String q = "1326#";
//        System.out.println((char)(c+1));
//        System.out.println(q.substring(q.length()-3, q.length()-1));
//        System.out.println(decrypt(q));

        String moves = "LL";
//        System.out.println(judgeCircle(moves));

        String g = "Let's take LeetCode contest";
        String[] str = g.split(" ");
//        System.out.println(str[1].charAt(str[1].length() - 1));
//        System.out.println(reverseWords(a));

        char ch = 'd';
        String words = "abcdefd";
//        System.out.println(reversePrefix(words, ch));

        String a = "abcd";
        String b = "cdabcdab";
//        System.out.println(repeatedStringMatch(a, b));

        String t = "TO BE OR NOT TO BE";
//        System.out.println(printVertically(t));

        String[] word = {"bella","label","roller"};
//        for (int i = 0; i < word[0].length(); i++) {
//            System.out.println(word[0].charAt(i));
//        }
        System.out.println('D' - 'A');

    }

    static boolean checkIfPanagram(String str){
        boolean [] alphabet = new boolean[26];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                index = str.charAt(i) - 'A';
            } else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
                index = str.charAt(i) - 'a';
            }
            alphabet[index] = true;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == false){
                return false;
            }
        }
        return true;
    }
}
