package com.example.inheritance;

public class Jack extends Human {
    String name;
    String surname;
    int age;

    public Jack() {
        System.out.println("Jack is called");
    }

    public Jack(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Jack{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String parentToString() {
        return super.toString();
    }

    @Override
    public void print() {
        System.out.println("Jack is printing");
    }
}
