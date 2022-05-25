package com.company;

public class Main {

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.add(11);
        queue.add(12);
        queue.add(13);
        queue.add(14);
        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());

        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast(10);
        list.addLast(11);
        list.addLast(12);
        list.addLast(13);
        list.displayForward();
        System.out.println();
        System.out.println(list.getByIndex(1));
        System.out.println(list.find(12));
        System.out.println(list.getSize());


    }
}
