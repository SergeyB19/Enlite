package com.example.inheritance;

public class C extends Jack {
    public C(String name, String surname, int age) {
        super(name, surname, age);
    }

    public String parentToString2() {
        return super.toString();
    }
    public String parentToString3() {
        return parentToString();
    }
}
