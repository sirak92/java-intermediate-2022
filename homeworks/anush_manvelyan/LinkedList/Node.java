package tech42;

public class Node<T extends Comparable<T>> {
    T data;
    Node previous;
    Node next;

    public Node(T data) {
        this.data = data;
    }

}
