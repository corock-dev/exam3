package com.nhnacademy.exam1;

public class SubtractionNode<T> extends BinaryOperationNode {

    private final char operator;

    public SubtractionNode(T left, T right) {
        super(left, right);
        this.operator = '-';
    }

    @Override
    public String toString() {
        return "(" + operator + " " + super.getLeft() + " " + super.getRight() + ")";
    }

}
