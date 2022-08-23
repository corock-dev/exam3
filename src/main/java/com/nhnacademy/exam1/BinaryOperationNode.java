package com.nhnacademy.exam1;

public class BinaryOperationNode<T> implements Node {

    private final T left;
    private final T right;

    public BinaryOperationNode(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "BinaryOperationNode{" + "left=" + left + ", right=" + right + '}';
    }

}
