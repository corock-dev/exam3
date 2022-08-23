package com.nhnacademy.exam2;

public class IntegerNumber extends RationalNumber {

    public IntegerNumber(int numerator) {
        super(numerator);
    }

    public IntegerNumber(IntegerNumber other) {
        super(other.getNumerator());
    }

    @Override
    public IntegerNumber plus(MyNumber operand) {
        return new IntegerNumber(this.getNumerator() + ((IntegerNumber) operand).getNumerator());
    }

    @Override
    public IntegerNumber minus(MyNumber operand) {
        return new IntegerNumber(this.getNumerator() - ((IntegerNumber) operand).getNumerator());
    }

    @Override
    public IntegerNumber multipliedBy(MyNumber operand) {
        return new IntegerNumber(this.getNumerator() * ((IntegerNumber) operand).getNumerator());
    }

    @Override
    public IntegerNumber dividedBy(MyNumber operand) {
        return new IntegerNumber(this.getNumerator() / ((IntegerNumber) operand).getNumerator());
    }

}
