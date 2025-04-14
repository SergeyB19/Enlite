package com.example.Reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        Class cl = p.getClass();
        System.out.println(cl.getName());

        Method[] methods = cl.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(method.getName() + " ");


            Constructor[] constructors = cl.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                Parameter[] parameters = constructor.getParameters();
                System.out.println(constructor.getName() + " ");
                for (Parameter parameter : parameters) {
                    System.out.print(parameter.getName() + " " + parameter.getType().getName() + " ");
                }
            }
        }
    }
}
