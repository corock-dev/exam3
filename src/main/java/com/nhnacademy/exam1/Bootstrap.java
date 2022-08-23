package com.nhnacademy.exam1;

public class Bootstrap {

    public static void main(String[] args) {
        problem1_1();
        problem1_2();
    }

    private static void problem1_1() {
        Node node = new LeafNode(5);
        System.out.println(node);
    }

    private static void problem1_2() {
        LeafNode left = new LeafNode(3);
        LeafNode right = new LeafNode(2);

        BinaryOperationNode additionNode = new AdditionNode(left, right);
        BinaryOperationNode subtractionNode = new SubtractionNode(left, right);
        BinaryOperationNode multiplicationNode = new MultiplicationNode(left, right);
        BinaryOperationNode divisionNode = new DivisionNode(left, right);

        System.out.println(additionNode);
        System.out.println(subtractionNode);
        System.out.println(multiplicationNode);
        System.out.println(divisionNode);

        Node node = new AdditionNode(new LeafNode(4), new MultiplicationNode(left, right));
        System.out.println(node);
    }

}
