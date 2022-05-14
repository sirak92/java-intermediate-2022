package com.company;

public class DoublyLinkedList {
    Node head;

    static class Node {
        int data;
        Node prev;
        Node next;


        Node(int d) {
            data = d;
        }
    }

    public void add(int new_data) {
        Node new_Node = new Node(new_data);

        if (head == null) {
            head = new_Node;


        } else {
            new_Node.next = head;
            new_Node.prev = null;
            head.prev = new_Node;
            head = new_Node;


        }
    }

    public void printList() {
        if (head == null) throw new RuntimeException("list is empty");

        Node trueHead = head;
        while (head != null) {

            System.out.print(head.data + " ");

            head = head.next;


        }
        head = trueHead;

    }

    // get first element;
    public int get() {

        if (head == null) throw new RuntimeException("no such an element");
        return head.data;
    }

    // remove first element
    public void remove() {
        if (head == null) throw new RuntimeException("no element");
        Node newHead = head.next;

        head.next = head;

        head = newHead;


    }

    // when the element is not found it returns 0:
    public int find(int item) {

        Node trueHead = head;
        while (head != null) {


            if (head.data == item) {
                return head.data;
            }
            head = head.next;

        }
        head = trueHead;
        return 0;
    }


}
