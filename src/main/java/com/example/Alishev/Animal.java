package com.example.Alishev;

public enum Animal {
    DOG("собака"), CAT("кошка"), FROG("лягушка");

    private String tranlation;

    Animal(String tranlation) {
        this.tranlation = tranlation;
    }

    public String getTranlation() {
        return tranlation;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "tranlation='" + tranlation + '\'' +
                '}';
    }
}
