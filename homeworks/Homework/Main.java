import java.util.Arrays;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> sup = () -> {
            int[] arr = new int[]{1, 2, 3, 4};
            int temp = 0;
            for (int i = 0; i <= arr.length; i++) {
                temp += i;
            }
            return temp;
        };

        System.out.println(sup.get());

        Supplier<String> arr = () -> {

            int[] arr1 = new int[]{22, 34, 56, 44};
            int[] arr2 = new int[arr1.length];

            int j = 0;

            for (int i = 0; i <= arr1.length - 1; i++) {
                if (arr1[i] % (i + 1) == 0) {
                    arr2[j] = arr1[i];
                    j++;
                }
            }

            return Arrays.toString(arr2);
        };
        System.out.println("Dividable integers" + arr.get());
    }
}



