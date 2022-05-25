
public class QueueTest {

    public static void main(String[] args) {

        Queue queue = new Queue<>();
        for (int i = 0; i < 5; i++) {
            queue.push(i);
        }
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.push(16);
        System.out.println(queue.pop());
        /**
         * Heare is output
         * 4
         * 3
         * 2
         * 1
         * 0
         * Queue is empty
         * null
         * Queue is empty
         * null
         * 16
         **/
    }
}