package hackerearth;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class LambdaExpressions {
    public static void main(String[] args)  {
        Supplier<Integer> sum = () -> {
            int array[] = new int[]{4, 8, 9, 5, 4, 5, 5};
            int result= 0;
            for (int i = 0; i < array.length; i++) {
                result += array[i];

            }
            return result;
        };
        BooleanSupplier index = () -> {
            int[] arr = {0, 1, 2, 3, 4, 5};
            int quanity = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] % i == 0) quanity++;
            }
            return quanity == arr.length - 1;
        };
        System.out.println(sum.get());
        System.out.println(index.getAsBoolean());
    }
}
