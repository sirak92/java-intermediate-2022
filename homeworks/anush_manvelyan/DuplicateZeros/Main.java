package tech42;

public class Main {

    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            if (arr[i] == 0) {
                for (int j = n - 1; j > i; --j) {
                    arr[j] = arr[j - 1];
                }
                ++i;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int arr1[] = {1, 2, 3};
        duplicateZeros(arr1);
        for (int i = 0; i < arr1.length; ++i) {
            System.out.print(arr1[i] + " ");
        }
    }
}
