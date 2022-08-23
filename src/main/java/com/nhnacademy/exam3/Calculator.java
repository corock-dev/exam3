package com.nhnacademy.exam3;

import com.nhnacademy.exam4.A;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class Calculator {

    public List<String> tokenizer(String expression) {
        List<String> result = new ArrayList<>();

        String[] entries = expression.split("");
        boolean flag = false;

        for (String entry : entries) {
            if (Objects.equals(entry, " ")) {
                continue;
            }
            if (Objects.equals(entry, "-")) {
                flag = true;
                continue;
            }
            String item = flag ? "-" + entry : entry;
            flag = false;
            result.add(item);
        }

        return result;
    }

    public List<String> toRPN(List<String> tokens) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        List<String> result = new ArrayList<>();

        for (String token : tokens) {
            if (token.equals("(")) {
                stack.addLast(token);
                continue;
            }

            if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    result.add(stack.pollLast());
                }
                stack.pollLast();
            }

            boolean isOperator = token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
            if (isOperator) {
                if (!stack.isEmpty()) {
                    if (!stack.peekLast().equals("(")) {
                        result.add(stack.pollLast());
                    } else {
                        stack.pollLast();
                    }
                }
                stack.addLast(token);
                continue;
            }

            result.add(token);

        }

        return result;
    }

    public Node makeTree(List<String> tokens) {
        return null;
    }

    public int evaluation(Node node) {
        return 0;
    }

}
