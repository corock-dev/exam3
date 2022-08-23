package com.nhnacademy.exam3;

import java.util.List;

public class Calculator {

    public List<String> tokenizer(String expression) {
        char[] entries = expression.toCharArray();

        StringBuilder builder = new StringBuilder();
        for (char entry : entries) {
            if (entry == ' ') {
                continue;
            }
            if (entry == '-') {
                builder.append(entry);
                continue;
            }
            builder.append(entry).append(", ");
        }
        builder.replace(builder.length() - 2, builder.length(), "");

        return List.of(builder.toString());
    }

    public List<String> toRPN(List<String> tokens) {
        return null;
    }

    public Node makeTree(List<String> tokens) {
        return null;
    }

    public int evaluation(Node node) {
        return 0;
    }

}
