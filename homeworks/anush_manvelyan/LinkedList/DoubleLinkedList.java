package tech42;

public class DoubleLinkedList<T> {

    public static class Node<T> {
        T data;
        Node<T> previous;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    Node<T> head = null;
    Node<T> tail = null;
    int countNodes = 0;

    public void add(T data) {
        Node<T> node = new Node(data);

        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }

        ++countNodes;
    }

    public T get(int index) {
        if (index < 0 || index >= countNodes) {
            throw new IndexOutOfBoundsException();
        } else {
            Node<T> cell = head;
            for (int i = 0; i < index; ++i) {
                cell = cell.next;
            }
            return cell.data;
        }
    }

    public void remove(T removableElement) {
        Node<T> deleteNode;
        Node<T> temp = head;

        if (temp != null) {
            while (temp.next != null) {
                if (temp.next.data.equals(removableElement)) {
                    deleteNode = temp.next;
                    temp.next = temp.next.next;
                    deleteNode = null;
                } else {
                    temp = temp.next;
                }
            }
        }
    }

    public boolean find(T searchableElement) {
        if (head == null) {
            return false;
        }

        int index = 0;
        Node<T> temp = head;

        while (temp != null) {
            if ((temp.data).equals(searchableElement)) {
                return true;
            }
            ++index;
            temp = temp.next;
        }
        return false;
    }

    public void showLinkedList() {
        Node<T> chainNodes = head;

        if (head == null) {
            System.out.println("Your linked list is empty!");
        } else {
            System.out.print("Linked list: ");
            while (chainNodes != null) {
                System.out.print(chainNodes.data + " ");
                chainNodes = chainNodes.next;
            }
        }
        System.out.println();
    }
}
