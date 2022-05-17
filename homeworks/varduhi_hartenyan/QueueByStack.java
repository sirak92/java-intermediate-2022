import java.util.Stack;

public class QueueByStack {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.addQueue(1);
        myQueue.addQueue(2);
        myQueue.addQueue(3);
        myQueue.getQueue();
        myQueue.addQueue(4);
        myQueue.getQueue();
        myQueue.getQueue();
        myQueue.addQueue(5);
        myQueue.addQueue(6);
        myQueue.addQueue(7);
        myQueue.getQueue();
        myQueue.getQueue();
        myQueue.getQueue();
        myQueue.getQueue();
        myQueue.getQueue();
        myQueue.addQueue(8);
        myQueue.addQueue(9);
        myQueue.addQueue(10);
        myQueue.getQueue();
        myQueue.getQueue();
        myQueue.getQueue();
        myQueue.getQueue();

    }
}

class MyQueue {

    private Stack<Integer> inbox = new Stack<>();
    private Stack<Integer> outbox = new Stack<>();

    public void addQueue(Integer num) {
        inbox.push(num);
    }

    public void getQueue() {
        if (outbox.empty()) {
            while (!inbox.empty()) {
                outbox.push(inbox.pop());
            }
        }

        if (!outbox.empty()) {
            System.out.println(outbox.peek());
            outbox.pop();
        } else {
            System.out.println("The queue is empty, please add elements");
        }
    }

    public Stack<Integer> getOutbox() {
        return outbox;
    }

    public Stack<Integer> getInbox() {
        return inbox;
    }

    public void setInbox(Stack<Integer> inbox) {
        this.inbox = inbox;
    }

    public void setOutbox(Stack<Integer> outbox) {
        this.outbox = outbox;
    }

}
