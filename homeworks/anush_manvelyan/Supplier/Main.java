package tech42;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Supplier<Integer>[] arr = new Supplier[]{
                () -> 1, () -> 5, () -> 2, () -> 3,
                () -> 9, () -> 5
        };

        int sum = 0;
        for (Supplier<Integer> i : arr) {
            sum += i.get();
        }

        System.out.println("\nSum: " + sum);
    }
}
