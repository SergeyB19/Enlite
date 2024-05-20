package com.example.Alishev;

public class Test2 {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        Animal animal = Animal.CAT;
        System.out.println(season.name());
        System.out.println(animal.name());

        Animal cat = Animal.valueOf("CAT");
        System.out.println(cat);

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());

    }
}
