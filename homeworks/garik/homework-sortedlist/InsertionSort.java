package algoritms;

import java.util.Arrays;

public class InsertionSort {

    static void insertsort(int[] x) {
        int temp = 0;
        for (int i = 1; i < x.length; i++) {
            temp = x[i];
            int j = i - 1;
            while (j >= 0 && x[j] > temp) {
                x[j + 1] = x[j];
                j = j - 1;

            }
            x[j + 1] = temp;

        }

        System.out.print(Arrays.toString(x));
    }


    public static void main(String[] args) {
        insertsort(new int[]{4, 3, 2, 10, 12, 1, 5, 6});


    }
}
