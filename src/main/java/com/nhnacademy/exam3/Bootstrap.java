package com.nhnacademy.exam3;

import java.util.List;

public class Bootstrap {

    public static void main(String[] args) {
        String expression1 = "1+2*(3*2/6)";
        String expression2 = "-1 +5* (3*-2 / 6)";

        Calculator calculator = new Calculator();
        List<String> tokens1 = calculator.tokenizer(expression1);
        System.out.println(tokens1);

        List<String> tokens2 = calculator.tokenizer(expression2);
        System.out.println(tokens2);
    }

}
