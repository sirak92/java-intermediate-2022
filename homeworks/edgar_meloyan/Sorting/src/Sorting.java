import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] array = new int[]{8, 3, 2, 10, -100, 57, 38, 4};
        int arraySize = array.length - 1;
        System.out.println("Array before sorting: \n" + Arrays.toString(array));
        insertionSort(array, arraySize);
        quickSort(array, 0,arraySize);
        System.out.println("Array after sorting, using quick and insertion sort: ");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array));
    }

    static void insertionSort(int[] array, int arraySize) {
        int element;
        int j;
        for (int i = 0; i < arraySize; i++) {
            element = array[i];
            j = i - 1;

            while (j >= 0 && array[j] > element) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = element;
        }
    }

    static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int element = left + (right - left) / 2;
        int bearing = array[element];
        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < bearing) {
                i++;
            }

            while (array[j] > bearing) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (left < j) {
            quickSort(array, left, j);
        }
        if (right > i) {
            quickSort(array, i, right);
        }
    }
}
