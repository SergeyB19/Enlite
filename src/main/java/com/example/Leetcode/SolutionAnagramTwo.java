package com.example.Leetcode;

import java.util.Arrays;

public class SolutionAnagramTwo {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("car", "necar"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int n = s.length();
        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        /*for (int i = 0; i < n; i++) {
            if (ss[i] != tt[i]) {
                return false;
            }
        }*/

//        return true;
        return Arrays.equals(ss, tt);
    }
}

