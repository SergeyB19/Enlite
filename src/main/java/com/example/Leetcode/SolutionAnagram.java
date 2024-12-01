package com.example.Leetcode;

public class SolutionAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int n = s.length();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((s.charAt(i) == s.charAt(j)) && !visited[j]) {
                    visited[j] = true;
                    break;
                }

                for (int f = 0; f < n; f++) {
                    if (!visited[j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

