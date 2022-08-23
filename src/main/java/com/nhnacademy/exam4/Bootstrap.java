package com.nhnacademy.exam4;

public class Bootstrap {

    public static void main(String[] args) {
        problem4_2();
        problem4_3();
    }

    private static void problem4_2() {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        Box<D> boxD = new Box<>(d);
        Box<D> boxE = new Box<>(e);

        // ERROR
        // Box<D> boxA = new Box<>(a);
        // Box<D> boxB = new Box<>(b);
        // Box<D> boxC = new Box<>(c);
    }

    private static void problem4_3() {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        Box<D> boxA = new Box<>();
        Box<D> boxB = new Box<>();
        Box<D> boxC = new Box<>();
        Box<D> boxD = new Box<>();
        Box<D> boxE = new Box<>();

        // boxA.setObject(a);
        // boxB.setObject(b);
        // boxC.setObject(c);
        boxD.setObject(d);
        boxE.setObject(e);

        // ERROR
    }

}
