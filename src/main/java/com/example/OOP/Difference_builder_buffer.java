package com.example.OOP;

public class Difference_builder_buffer {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();

        builder.append("abc");
        builder.deleteCharAt(1);
        builder.setCharAt(0,'w');
        System.out.println(builder.toString());

        buffer.append("abc");
        buffer.deleteCharAt(1);
        buffer.setCharAt(0,'q');
        System.out.println(buffer.toString());
    }
}
