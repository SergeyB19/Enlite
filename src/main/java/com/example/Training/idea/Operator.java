package com.example.Training.idea;

import java.util.function.DoubleUnaryOperator;


class Operator {

    public static int a = 10;
    public static int b = 20;
    public static int c = 30;

    public static DoubleUnaryOperator unaryOperator = (DoubleUnaryOperator) (x) -> a * x*x + b*x + c;
    }

