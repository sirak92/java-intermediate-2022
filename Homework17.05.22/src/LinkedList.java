import java.util.Stack;
public class LinkedList<T> {
    private Node<T> head;
    private class Node<T> {
        Node<T> next;
        T data;
        Node(T value) {
            this.data = value;
        }
    }
    public void add(T t) {
        Node newNode = new Node(t);
        Node<T> currentNode = head;
        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node<>(t);
        }
    }
    public void get(T value) {
        if (head.data == value) {
            System.out.println(0);
            return;
        } else {
            Node<T> currentNode1 = head;
            int result = 0;
            while (currentNode1.next != null) {
                currentNode1 = currentNode1.next;
                result = result + 1;
                if (currentNode1.data == value) {
                    System.out.println(result);
                    return;
                }
            }
            System.out.println("There is no variable like this");
        }
    }
    private void remove(T value){
        if(head.data==value){
            head=head.next;
        }else{
            Node<T> currentNode2 = head;
            while(currentNode2.next!=null){
                currentNode2 = currentNode2.next;
                if(currentNode2.next.data==value){
                    currentNode2.next=currentNode2.next.next;
                }
                return;
            }
        }
    }
    public T removeFirst(){
        T t = head.data;
        head=head.next;
        return t;
    }
    public void printList() {
        Node<T> currNode = this.head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
       
    }
}
