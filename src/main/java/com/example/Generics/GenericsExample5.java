package com.example.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample5 {
    public static void main(String[] args) {
        List<Bacteria> bacteria = new ArrayList<>();
        check3(bacteria);


        List<Animals> animals = new ArrayList<>();
        animals.add(new Cats());
        animals.add(new Animals());
        check2(animals);
        check3(animals);


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(10);
        list1.add(15);

        List<Double> list2 = new ArrayList<>();
        list2.add(1.2);
        list2.add(2.2);
        list2.add(3.2);

        check1(list1);
        check1(list2);
    }

    public static void check1(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            System.out.println();
        }
    }

    public static void check2(List<? extends Animals> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            System.out.println();
        }
    }

    public static void check3(List<? super Animals> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            System.out.println();
        }
    }
}

class Bacteria {

}

class Animals extends Bacteria {

}

class Cats extends Animals {

}