package tech42;

public class Main {

    public static void main(String[] args) {

        DoubleLinkedList<Integer> linkedList = new DoubleLinkedList();
        linkedList.showLinkedList();
        linkedList.add(5);
        linkedList.add(11);
        linkedList.add(3);
        linkedList.add(9);
        linkedList.add(5);
        linkedList.add(456);
        linkedList.add(11);
        linkedList.showLinkedList();
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.find(9));
        System.out.println(linkedList.find(589));
        linkedList.remove(11);
        linkedList.showLinkedList();

        System.out.println();
        DoubleLinkedList<String> linkedListStr = new DoubleLinkedList();
        linkedListStr.showLinkedList();
        linkedListStr.add("abc");
        linkedListStr.add("bcd");
        linkedListStr.add("abc");
        linkedListStr.add("efg");
        linkedListStr.showLinkedList();
        System.out.println(linkedListStr.get(2));
        System.out.println(linkedListStr.find("efg"));
        System.out.println(linkedListStr.find("ijk"));
        linkedListStr.remove("abc");
        linkedListStr.showLinkedList();

        Queue<Integer> queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.printQ();
        queue.remove();
        queue.remove();
        System.out.println(queue.get(2));
        queue.printQ();
        System.out.println(queue.getSize());
        queue.printQ();
    }
}
