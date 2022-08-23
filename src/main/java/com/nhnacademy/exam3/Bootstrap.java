package com.nhnacademy.exam3;

import java.util.List;

public class Bootstrap {

    public static void main(String[] args) {
        problem3_1();
        problem3_2();
    }

    private static void problem3_1() {
        String expression1 = "1+2*(3*2/6)";
        String expression2 = "-1 +5* (3*-2 / 6)";

        Calculator calculator = new Calculator();
        List<String> tokens1 = calculator.tokenizer(expression1);
        System.out.println(tokens1);

        List<String> tokens2 = calculator.tokenizer(expression2);
        System.out.println(tokens2);
    }

    private static void problem3_2() {
        String expression = "3 * 2 + ( 4 / 5 * -2)";

        Calculator calculator = new Calculator();
        List<String> tokens = calculator.tokenizer(expression);
        System.out.println(calculator.toRPN(tokens));
    }

}
