package com.nhnacademy.exam1;

public class LeafNode implements Node {

    private final int number;

    public LeafNode(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

}
