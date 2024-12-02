package com.example.Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SolutionReversWordsAnother {
    public static void main(String[] args) {
        reverseWords("reverseWords and words");
    }

    public static String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        List<String> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            String curr = st.nextToken();
            list.add(curr);
        }

        String result = "";
        for (String curr : list) {
            StringBuilder sb = new StringBuilder(curr);
            String reverse = sb.reverse().toString();
            result += reverse + " ";
        }
        System.out.println(result.trim());
        return result.trim();

    }
}
