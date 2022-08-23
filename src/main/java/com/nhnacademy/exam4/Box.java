package com.nhnacademy.exam4;

public class Box<T extends A> {

    T object;

    public Box() {
    }

    public Box(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Box{" + "object=" + object + '}';
    }

}
