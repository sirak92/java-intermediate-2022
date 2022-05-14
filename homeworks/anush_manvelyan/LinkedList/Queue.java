package tech42;

public class Queue<T extends Comparable<T>> {
    public Node front = null;
    public Node rear = null;
    int size = 0;

    public void add(T value) {
        Node nodeForQueue = new Node(value);

        if (front == null) {
            front = nodeForQ)ueue;
        } else {
            rear.next = nodeForQueue;
        }
        ++size;
        rear = nodeForQueue;
    }

    public void remove() {
        if (front == null) {
            System.out.println("Your deque is already null\n");
        } else {
            Node temp = front;
            front = front.next;
            if (front == null) {
                rear = null;
            } else {
                front.previous = null;
            }
            --size;
        }
    }

    public int getSize() {
        return size;
    }

    public void printQueue() {
        Node nodeQueue = front;
        System.out.print("\nQueue: ");
        if (nodeQueue == null) {
            System.out.println("Your queue is null!\n");
        } else {
            while (nodeQueue != null) {
                System.out.print(nodeQueue.data + " ");
                nodeQueue = nodeQueue.next;
            }
        }
    }
}
