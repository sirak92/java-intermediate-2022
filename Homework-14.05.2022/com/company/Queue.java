package com.company;

public class Queue {
    DoublyLinkedList list = new DoublyLinkedList();


    public void add(int a) {
        list.addLast(a);
    }

    public int get() {
        return list.getFirst();
    }
}

