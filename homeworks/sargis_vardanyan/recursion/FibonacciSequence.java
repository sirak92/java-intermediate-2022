package recursion;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSequence {
    private static final Map<Integer, Integer> fibonacciSequence = new HashMap<>();
    static {
        fibonacciSequence.put(0, 1);
        fibonacciSequence.put(1, 1);
    }

    // max 75
    public static int get(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n > 1 && !checkExistence(n)) {
            fibonacciSequence.put(n, get(n - 1) + fibonacciSequence.get(n - 2));
        }
        return fibonacciSequence.get(n);
    }

    private static boolean checkExistence(int key) {
        return fibonacciSequence.containsKey(key);
    }
}

class Fibonacci {
    public static long getFib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        long[][] array = {{1, 1}, {1, 0}};
        power(array, n);

        return array[0][0];
    }

    public static void power(long[][] array1, int n) {
        if (n == 0 || n == 1) {
            return;
        }

        long[][] array2 = {{1, 1}, {1, 0}};
        power(array1, n / 2);
        multiply(array1, array1);

        if (n % 2 != 0) {
            multiply(array1, array2);
        }
    }

    public static void multiply(long[][] array1, long[][] array2) {
        long a = array1[0][0] * array2[0][0] + array1[0][1] * array2[1][0];
        long b = array1[0][0] * array2[0][1] + array1[0][1] * array2[1][1];
        long c = array1[1][0] * array2[0][0] + array1[1][1] * array2[1][0];
        long d = array1[1][0] * array2[0][1] + array1[1][1] * array2[1][1];

        array1[0][0] = a;
        array1[0][1] = b;
        array1[1][0] = c;
        array1[1][1] = d;
    }
}
