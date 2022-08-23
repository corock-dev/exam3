package com.nhnacademy.exam1;

public class MultiplicationNode<T> extends BinaryOperationNode {

    private final char operator;

    public MultiplicationNode(T left, T right) {
        super(left, right);
        this.operator = '*';
    }

    @Override
    public String toString() {
        return "(" + operator + " " + super.getLeft() + " " + super.getRight() + ")";
    }

}
