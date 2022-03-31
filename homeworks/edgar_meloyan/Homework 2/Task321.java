import java.util.Arrays;

public class Task312{
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int[] newArray = new int[array.length / 2];

        for (int i = 0, j = 0; i < array.length; i += 2) {
            newArray[j] = Math.abs(array[i]) >= Math.abs(array[i + 1])
                    ? array[i] : array[i + 1];
            j++;
        }
        System.out.print(Arrays.toString(newArray));
    }
}