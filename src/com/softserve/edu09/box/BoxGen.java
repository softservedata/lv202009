package com.softserve.edu09.box;

public class BoxGen<T> {
    private T obj;

    public void set(T obj) {
        this.obj = obj;
    }

    public T get() {
        return obj;
    }
    
}
