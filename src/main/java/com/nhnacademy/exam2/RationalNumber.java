package com.nhnacademy.exam2;

public class RationalNumber extends MyNumber {

    private int numerator;
    private int denominator;

    public RationalNumber(int numerator) {
        this.numerator = numerator;
        this.denominator = 0;
    }

    public RationalNumber(int numerator, int denominator) {
        int[] result = reduce(numerator, denominator);

        this.numerator = result[0];
        this.denominator = result[1];
    }

    public RationalNumber(RationalNumber operand) {
        this.numerator = operand.getNumerator();
        this.denominator = operand.getDenominator();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public RationalNumber plus(MyNumber operand) {
        int numerator = (this.numerator * ((RationalNumber) operand).denominator) + ((RationalNumber) operand).numerator * this.denominator;
        int denominator = (this.denominator * ((RationalNumber) operand).denominator);

        return new RationalNumber(numerator, denominator);
    }

    @Override
    public RationalNumber minus(MyNumber operand) {
        int numerator = (this.numerator * ((RationalNumber) operand).denominator) - (((RationalNumber) operand).numerator * this.denominator);
        int denominator = (this.denominator * ((RationalNumber) operand).denominator);

        return new RationalNumber(numerator, denominator);
    }

    @Override
    public RationalNumber multipliedBy(MyNumber operand) {
        return new RationalNumber(this.numerator * ((RationalNumber) operand).getNumerator(),
                                  this.denominator * ((RationalNumber) operand).getDenominator());
    }

    @Override
    public RationalNumber dividedBy(MyNumber operand) {
        int numerator = this.numerator * ((RationalNumber) operand).getDenominator();
        int denominator = this.denominator * ((RationalNumber) operand).getNumerator();

        return new RationalNumber(numerator, denominator);
    }

    public static int[] reduce(int numerator, int denominator) {
        int[] fractions = new int[2];
        fractions[0] = numerator;
        fractions[1] = denominator;

        // 분모가 0일 경우에 에러 반환
        if (fractions[1] == 0) {
            fractions[0] = 0;
            fractions[1] = 0;

            return fractions;
        }

        int result = gcd(fractions[0], fractions[1]);

        fractions[0] = fractions[0] / result;
        fractions[1] = fractions[1] / result;

        return fractions;
    }

    public static int gcd(int numerator, int denominator) {
        while (denominator != 0) {
            int temp = numerator % denominator;
            numerator = denominator;
            denominator = temp;
        }

        return Math.abs(numerator);
    }

    @Override
    public String toString() {
        return denominator != 0 ? numerator + "/" + denominator : String.valueOf(numerator);
    }

}
