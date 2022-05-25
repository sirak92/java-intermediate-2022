import java.util.EmptyStackException;
import java.util.Stack;

public class Queue {
    static Stack<Integer> myStack = new Stack<Integer>();
    static Stack<Integer> temp = new Stack<Integer>();

    static void insert(int element) {
        while (!myStack.isEmpty()) {
            temp.push(myStack.pop());
        }
        temp.push(element);

        while (!temp.isEmpty()) {
            myStack.push(temp.pop());
        }
    }

    static int remove() {
        try {
            if (myStack.isEmpty());
        } catch (EmptyStackException e) {
            e.getMessage();
        }

        int element = myStack.peek();
        myStack.pop();
        return element;
    }
}
