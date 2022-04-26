import java.util.Arrays;
import java.util.Scanner;

class Result {

    static int[] rotLeft(int[] arr, int d) {
        int j = 0;
        int[] temp = new int[arr.length];

        for (int i = d; i < arr.length; i++, j++) {
            temp[j] = arr[i];
        }
        if (j < arr.length) {
            for (int i = 0; i < d; i++, j++) {
                temp[j] = arr[i];
            }
        }

        return temp;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array and the number of left rotation: ");
        int arraySize = sc.nextInt();
        System.out.print("Fill the array: ");
        int d = sc.nextInt();
        int arr[] = new int[arraySize];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Rotated array: " + Arrays.toString(Result.rotLeft(arr, d)));
    }
}