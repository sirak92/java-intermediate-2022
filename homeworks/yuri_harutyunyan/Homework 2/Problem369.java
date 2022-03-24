import java.util.Arrays;

public class Problem369 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        int minnum1 = Integer.MAX_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr1[i] = Integer.MAX_VALUE;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (minnum1 >= arr1[i]) {
                minnum1 = arr1[i];
            }
        }
        System.out.println(minnum1);
    }
}
