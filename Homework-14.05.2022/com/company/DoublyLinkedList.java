package com.company;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
        }

        public void printData() {
            System.out.print(data + " ");

        }
    }

    public void addLast(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        size++;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
        } else {
            tail.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    public int getFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        Node current = head;
        head = head.next;
        return current.data;
    }

    public int getByIndex(int index) {
        Node current = head;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index" + " " + index + " " + "is not valid for size" + " " + size);
        }
        for (int i = 0; i < index && current.next != null; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int getSize() {
        return size;
    }

    public int find(int item) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.data == item) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    public void displayForward() {
        Node current = head;
        while (current != null) {
            current.printData();
            current = current.next;
        }
    }


}

