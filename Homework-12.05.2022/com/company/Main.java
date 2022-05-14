package com.company;


public class Main {


    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(18);
        list.add(1);
        list.add(22);
        list.add(125);
        list.add(45);
        list.remove();
        list.remove();
        list.remove();


        list.printList();
        System.out.println();
        System.out.println(list.get());

        System.out.println(list.find(12));


    }
}
