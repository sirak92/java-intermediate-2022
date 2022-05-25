package Collection;

import java.util.Stack;

public class Queeue {
    private Stack<Integer> left = new Stack<>();
    private Stack<Integer> right = new Stack<>();

    public void add(Integer i) {
        left.push(i);
    }

    public Integer get() {

        for (int i = 0; i < left.size(); i++) {
            while (left.size() > i) {
                right.push(left.pop());
            }
        }

        return right.pop();
    }

    public static void main(String[] args) {
        Queeue queeue = new Queeue();
        queeue.add(12);
        queeue.add(19);
        queeue.add(121);
        queeue.add(122);
        System.out.println("12    " + queeue.get());
        System.out.println("19    " + queeue.get());
        System.out.println("121    " + queeue.get());
        System.out.println("122    " + queeue.get());
    }
}
