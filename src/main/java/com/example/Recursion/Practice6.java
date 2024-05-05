package com.example.Recursion;

public class Practice6 {
    static int count = 0;
    public static void main(String[] args) {
        String s = "ABCDE";
        boolean[] visited = new boolean[s.length()];
        rec(s, visited, "");

    }

    private static void rec(String s, boolean[] visited, String curr) {
        if (s.length() == curr.length()) {
            count++;
            System.out.println(count+ " " + curr);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                rec(s, visited, curr + s.charAt(i));
                visited[i] = false;
            }
        }
    }
}
