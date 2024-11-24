package com.example.Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class SolutionReverseWords {
    public static void main(String[] args) {
        reverseWords("hello world");
    }

    public static String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        List<String> result = new ArrayList<>();
        while (st.hasMoreTokens()) {
            String curr = st.nextToken();
            result.add(curr);
        }
        Collections.reverse(result);
        String ss = "";
        for (String curr : result) {
            ss += curr + " ";
        }
        System.out.println(ss.trim());
        return ss.trim();

    }
}
