
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Queue<T> {
    private final Stack<T> stack1;
    private final Stack<T> stack2;
    private int size = 0;
    private int poppedCount = 0;

    public Queue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public Queue(ArrayList<T> arrayList) {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        for (T t : arrayList) {
            size++;
            this.push(t);
        }
    }

    public void push(T element) {
        size++;
        stack1.push(element);
    }

    public T pop() {

        if (size == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        if (stack2.isEmpty()) {
            if (poppedCount != 0) {
                rebuildStack1();
            }
            addInStack2();
            size--;
            poppedCount++;
            return stack2.pop();
        }
        size--;
        return stack2.pop();
    }

    private void addInStack2() {
        for (T item : stack1) {
            stack2.push(item);
        }
    }

    private void rebuildStack1() {
        Stack<T> tempStack = new Stack<>();
        for (int i = 0; i < stack1.size() - poppedCount; i++) {
            tempStack.push(stack1.pop());
        }
        Collections.reverse(tempStack);
        stack1.removeAllElements();
        for (int i = 0; i < tempStack.size() - poppedCount; i++) {
            stack1.push(tempStack.pop());
        }
    }
}
