/**
 * Java Program to Implement Queue using Two Stacks
 */

public class QueueUsingStack {
    public static void main(String[] args) {

        Queue.insert(1);
        Queue.insert(2);
        Queue.insert(5);;

        System.out.println(Queue.remove());
        System.out.println(Queue.remove());
    }
}
