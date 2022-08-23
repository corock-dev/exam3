package com.nhnacademy.exam2;

import java.util.Random;

public class Bootstrap {

    public static void main(String[] args) {
        problem2_1();
        System.out.println();
        problem2_2();
        System.out.println();
        problem2_3();
        System.out.println();
        problem2_4();
        System.out.println();
        problem2_5();
        System.out.println();
        problem2_6();
    }

    private static void problem2_1() {
        RationalNumber rn1 = new RationalNumber(100);
        System.out.println(rn1);

        RationalNumber rn2 = new RationalNumber(4, 6);
        System.out.println(rn2);

        RationalNumber rn3 = new RationalNumber(rn2);
        System.out.println(rn3);
    }

    private static void problem2_2() {
        RationalNumber rn1 = new RationalNumber(1, 2);
        RationalNumber rn2 = new RationalNumber(1, 3);

        RationalNumber rn3 = rn1.plus(rn2);
        RationalNumber rn4 = rn1.minus(rn2);
        RationalNumber rn5 = rn1.multipliedBy(rn2);
        RationalNumber rn6 = rn1.dividedBy(rn2);

        System.out.println(rn1 + " + " + rn2 + " = " + rn3);
        System.out.println(rn1 + " - " + rn2 + " = " + rn4);
        System.out.println(rn1 + " * " + rn2 + " = " + rn5);
        System.out.println(rn1 + " / " + rn2 + " = " + rn6);
    }

    private static void problem2_3() {
        IntegerNumber in1 = new IntegerNumber(100);
        System.out.println(in1);

        IntegerNumber in2 = new IntegerNumber(in1);
        System.out.println(in2);
    }

    private static void problem2_4() {
        IntegerNumber in1 = new IntegerNumber(2);
        IntegerNumber in2 = new IntegerNumber(3);

        IntegerNumber rn3 = in1.plus(in2);
        IntegerNumber rn4 = in1.minus(in2);
        IntegerNumber rn5 = in1.multipliedBy(in2);
        IntegerNumber rn6 = in1.dividedBy(in2);

        System.out.println(in1 + " + " + in2 + " = " + rn3);
        System.out.println(in1 + " - " + in2 + " = " + rn4);
        System.out.println(in1 + " * " + in2 + " = " + rn5);
        System.out.println(in1 + " / " + in2 + " = " + rn6);
    }

    private static void problem2_5() {
        RationalNumber rn1 = new RationalNumber(1, 2);
        IntegerNumber in2 = new IntegerNumber(3);

        RationalNumber rn3 = rn1.plus(in2);
        RationalNumber rn4 = rn1.minus(in2);
        RationalNumber rn5 = rn1.multipliedBy(in2);
        RationalNumber rn6 = rn1.dividedBy(in2);

        System.out.println(rn1 + " + " + in2 + " = " + rn3);
        System.out.println(rn1 + " - " + in2 + " = " + rn4);
        System.out.println(rn1 + " * " + in2 + " = " + rn5);
        System.out.println(rn1 + " / " + in2 + " = " + rn6);
    }

    private static void problem2_6() {
        RationalNumber[] numbers = new RationalNumber[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int numerator = random.nextInt(21) - 10;
            int denominator = random.nextInt(21) - 10;

            if (denominator == 0) {
                denominator = 10;
            }

            numbers[i] = new RationalNumber(numerator, denominator);
        }

        StringBuilder builder = new StringBuilder("[");
        for (RationalNumber number : numbers) {
            builder.append(number).append(", ");
        }

        builder.replace(builder.length() - 2, builder.length() - 1, "]");
        System.out.println(builder);
    }

}
