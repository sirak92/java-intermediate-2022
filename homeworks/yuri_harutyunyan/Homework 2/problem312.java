import java.util.Arrays;
import java.util.Scanner;

public class problem312 {

    public static void main(String[] args) {
        int[] initialArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int j = 0;
        int[] finalArr = new int[initialArr.length / 2];
        for (int i = 0; i < initialArr.length; i += 2) {
            if (Math.abs(initialArr[i]) >= Math.abs(initialArr[i + 1])) {
                finalArr[j] = initialArr[i];
            } else {
                finalArr[j] = initialArr[i + 1];
            }
            System.out.println(finalArr[j]);
            j++;
        }
    }

}