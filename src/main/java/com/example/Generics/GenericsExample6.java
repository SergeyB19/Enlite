package com.example.Generics;

import java.util.List;

public class GenericsExample6 {
    public static void main(String[] args) {

    }

    public static void compare1(List<?> list) {

    }

    public static <T extends Comparable & Cloneable> void compare2(List<T> list) {

    }
}
