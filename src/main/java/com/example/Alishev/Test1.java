package com.example.Alishev;

public class Test1 {
    public static void main(String[] args) {

        Animal animal = Animal.CAT;
        System.out.println(animal.getTranlation());
        System.out.println(animal.toString());
        switch (animal) {
            case CAT:
                System.out.println("It's a cat!");
                break;
            case DOG:
                System.out.println("It's a dog!");
                break;
        }

        Season season = Season.WINTER;
        System.out.println(season.getTemperature());
        switch (season) {
            case SUMMER:
                System.out.println("it's warm outside");
                break;
            case WINTER:
                System.out.println("it's cold outside");
                break;
        }
    }
}
