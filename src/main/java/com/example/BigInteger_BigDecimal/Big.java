package com.example.BigInteger_BigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Big {
    public static void main(String[] args) {
        BigInteger big = new BigInteger("123");
        BigInteger big2 = new BigInteger("2131232131255555555455454555555555555555555555555555555558348773647973");
        System.out.println(big.add(big2));
        System.out.println(big.multiply(big2));
        System.out.println(big2.divide(big));
        System.out.println(big.subtract(big2));
        System.out.println(big2.mod(big));

        BigDecimal bigDecimal1 = new BigDecimal("123.5");
        BigDecimal bigDecimal2 = new BigDecimal("1430543579379528745602375483475420387592743503784589374569367943456");
        System.out.println("bigDecimal1.add(bigDecimal2) = " + bigDecimal1.add(bigDecimal2));
        System.out.println("bigDecimal1.multiply(bigDecimal2) = " + bigDecimal1.multiply(bigDecimal2));
        System.out.println("bigDecimal2.divide(bigDecimal1) = " + bigDecimal2.divide(new BigDecimal("1430543579379528745602375483475420387592743503784589374569367943456")));
        System.out.println("bigDecimal2.subtract(bigDecimal1) = " + bigDecimal2.subtract(bigDecimal1));
    }
}
