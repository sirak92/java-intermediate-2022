import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Program for calculating the sum of an array:\n");
        Supplier<Integer> sumOfArrayElements = () -> {
            System.out.print("Enter the array size: ");
            int size = console.nextInt();
            int[] myArray = new int[size];
            int sum = 0;
            System.out.print("Enter the elements of the array: ");

            for (int i = 0; i < size; i++) {
                myArray[i] = console.nextInt();
                sum = myArray[i] + sum;
            }
            System.out.println("Elements of the array are: " + Arrays.toString(myArray));
            return sum;
        };


        System.out.println("Sum of the elements of the array: " + sumOfArrayElements.get());
        System.out.println("Program to check if array elements are divisible by their index:\n");

        BiPredicate<Integer[], Integer> arrayElementIsDividableByIndex = (array, count) -> {
            System.out.print("Enter the array size");
            int size = console.nextInt();
            array = new Integer[size];
            System.out.print("Enter the elements of array: ");

            for (int i = 0; i < size; i++) {
                array[i] = console.nextInt();
                if (array[i] % i == 0) {
                    count++;
                }
            }
            return count == size - 1;
        };
//        arrayElementIsDividableByIndex.test());
    }
}
