package com.nhnacademy.exam1;

public class AdditionNode<T> extends BinaryOperationNode {

    private final char operator;

    public AdditionNode(T left, T right) {
        super(left, right);
        this.operator = '+';
    }

    @Override
    public String toString() {
        return "(" + operator + " " + super.getLeft() + " " + super.getRight() + ")";
    }

}
