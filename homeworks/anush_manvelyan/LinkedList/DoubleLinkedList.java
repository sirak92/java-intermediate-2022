package tech42;

public class DoubleLinkedList<T extends Comparable<T>> {
    Node head = null;
    Node tail = null;
    protected int countNodes = 0;

    public void add(T data) {
        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
            head.previous = null;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        tail.next = null;
        ++countNodes;
    }

    public Comparable get(int index) {
        if (index < 0 || index >= countNodes) {
            throw new IndexOutOfBoundsException();
        } else {
            Node cell = head;
            for (int i = 0; i < index; ++i) {
                cell = cell.next;
            }
            return cell.data;
        }
    }

    public void remove(T removableElement) {
        Node deleteNode;

        while (head != null && head.data.compareTo(removableElement) == 0) {
            deleteNode = head;
            head = head.next;
            deleteNode = null;
        }

        Node temp = head;
        if (temp != null) {
            while (temp.next != null) {
                if (temp.next.data.compareTo(removableElement) == 0) {
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
        Node temp = head;

        while (temp != null) {
            if ((temp.data).compareTo(searchableElement) == 0) {
                return true;
            }
            ++index;
            temp = temp.next;
        }
        return false;
    }

    public void showLinkedList() {
        Node chainNodes = head;

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
