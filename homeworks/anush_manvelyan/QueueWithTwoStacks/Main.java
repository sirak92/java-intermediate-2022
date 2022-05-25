package tech42;

public class Main {

    public static void main(String[] args) {
        Queue q = new Queue();

        for (int i = 10; i <= 15; ++i) {
            q.add(i);
        }

        System.out.println(q.get());

        for (int i = 30; i <= 35; ++i) {
            q.add(i);
        }

        System.out.println(q.get());

    }
}
