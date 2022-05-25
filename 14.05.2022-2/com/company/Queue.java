package com.company;

import java.util.Stack;

public class Queue<T> {

    Stack<T> stck = new Stack<>();
    Stack<T> stck1 = new Stack<>();

    public void add(T a) {
        stck.push(a);
    }

    private void fillStack1() {
        while (!stck.isEmpty())
            stck1.push(stck.pop());
    }

    public T get() {
        if (stck1.isEmpty()) {
            fillStack1();
        }
        return stck1.pop();
    }

}

