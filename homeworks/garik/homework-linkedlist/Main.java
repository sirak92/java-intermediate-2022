package Collection;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(15);
        myLinkedList.add(18);
        myLinkedList.add(152);
        myLinkedList.add(154);
        myLinkedList.add(154);
        myLinkedList.add(156);
        myLinkedList.add(150);
        System.out.println(myLinkedList.get(4));
        System.out.println(myLinkedList.toString());
    }
}
