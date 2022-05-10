package lambdaexptask;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class LambdaDemo {
    public static void main(String[] args) {
        System.out.println(sumOfArray(() -> {
            int[] array = new int[5];
            int sum = 0;
            for (Integer i: array) {
                i = sum + 1;
                sum += i;
            }
            return sum;
        }));

        BiPredicate<Integer, Integer> arrayElementIsDividableByIndex = (current, index) -> current % index == 0;

        System.out.println(Arrays.toString(checkArrayElements(arrayElementIsDividableByIndex, new int[]{1, 1, 2, 3, 5})));
    }

    public static <T extends Number> T sumOfArray(Supplier<T> supplier) {
        return supplier.get();
    }

    public static boolean[] checkArrayElements(BiPredicate<Integer, Integer> biPredicate, int[] array) {
        boolean[] result = new boolean[array.length];
        result[0] = false;

        for (int i = 1; i < array.length; i++) {
            result[i] = biPredicate.test(array[i], i);
        }
        return result;
    }
}
