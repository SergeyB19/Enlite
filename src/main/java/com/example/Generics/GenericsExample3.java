package com.example.Generics;

public class GenericsExample3 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        show(cat);
        Dog dog = new Dog();
        Animal animal = new Animal();
        show(animal);
    }

    public static <T extends Animal> void show(T a) {

    }
}

class Animal {

}

class Cat extends Animal {
    public Cat() {
        System.out.println("I'm Cat");
    }
}

class Dog {
    public Dog() {
        System.out.println("I'm a Dog");
    }
}
