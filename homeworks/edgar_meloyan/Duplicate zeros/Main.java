import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 0, 2, 3, 0, 4, 5, 0};
        Solution solution = new Solution();

        solution.duplicateZeros(array);
        System.out.println(Arrays.toString(array));
    }
}
