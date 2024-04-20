package com.example.Отличие_вызова_pass_by_value_и_pass_by_reference;

public class Practice {
    public static void main(String[] args) {
        int x = 1;
        int[] arr = {5, 6, 7, 10, 15};
        check(x, arr);
        System.out.println("X is " + x);
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }


    private static void check(int x, int[] arr) {
        x = 100;
        arr[0] = 123;
        arr[1] = 345;
    }
}
