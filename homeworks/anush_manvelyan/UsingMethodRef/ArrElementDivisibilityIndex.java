package tech42;

import java.util.Scanner;
import java.util.function.BiFunction;

public class ArrElementDivisibilityIndex {

    static boolean isDivision(int a, int b) {
        if (a % b == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        do {
            System.out.print("Enter the count of the array: ");
            n = input.nextInt();
        } while (n <= 0 || n > 100);

        int arr[] = new int[100];

        for (int i = 1; i <= n; ++i) {
            System.out.print("arr [" + i + "] = ");
            arr[i] = input.nextInt();
        }

        BiFunction<Integer, Integer, Boolean> division = ArrElementDivisibilityIndex::isDivision;

        for (int i = 1; i <= n; ++i) {
            if (division.apply(arr[i], i))
                System.out.println("\nElement: " + arr[i] + "\nIndex: " + i);
            else
                continue;
        }

    }
}
