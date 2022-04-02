import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner cosnole = new Scanner(System.in);
        System.out.print("STRING REVERSE: " + "\n" + "Enter the string to reverse: ");
        String str = cosnole.nextLine();
        System.out.println("The reversed string = " + stringReverse(str) + "\n");

        System.out.print("POWER OF NUMBER: " + "\n" + "Enter the number: ");
        double x = cosnole.nextDouble();
        System.out.print("Enter the power of number: ");
        double n = cosnole.nextDouble();
        System.out.println("Result is " + powOfNumber(x, n) + "\n");

        System.out.print("ARRAY REVERSE: " + "\n" + "Enter array's size: ");
        int size = cosnole.nextInt();
        int[] array = new int[size];
        System.out.println("Insert array's elements: ");

        for (int i = 0; i < size; i++) {
            array[i] = cosnole.nextInt();
        }

        System.out.println("\n" + "The reversed view of array: ");
        arrayReverse(array, 0);

        System.out.print("FIBONACCI SEQUENCE: " + "\n" + "Enter the number: ");
        int f = cosnole.nextInt();
        System.out.println("The n-th element of Fibonacci sequence = " + fibonacci(f) + "\n");
    }

    public static void arrayReverse(int[] array, int index) {
        if (index == array.length) {
            return;
        }
        int element = array[index];
        arrayReverse(array, index + 1);
        System.out.println(element);
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static String stringReverse(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return stringReverse(str.substring(1)) + str.charAt(0);
    }

    public static double powOfNumber(double x, double n) {
        if (n == 1) {
            return x;
        } else if (n == 0) {
            return 1;
        }
        return powOfNumber(x, n - 1) * x;
    }
}