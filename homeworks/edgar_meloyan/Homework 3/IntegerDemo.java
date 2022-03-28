import java.util.Scanner;

public class IntegerDemo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the first number for the first Integer operation: ");
        int num1 = console.nextInt();
        System.out.print("Enter the second number for the first Integer operation: ");
        int num2 = console.nextInt();
        IntegerOperations obj1 = new IntegerOperations(num1, num2);
        IntegerOperations.integerEquals();

        System.out.print("Enter the first number for the second Integer operation: ");
        int num3 = console.nextInt();
        System.out.print("Enter the second number for the second Integer operation: ");
        int num4 = console.nextInt();
        Max obj2 = new Max(num3, num4);
        Max.max();

        System.out.print("Enter the first number for the third Integer operation: ");
        int num5 = console.nextInt();
        System.out.print("Enter the second number for the third Integer operation: ");
        int num6 = console.nextInt();
        Comparison obj3 = new Comparison(num5, num6);
        Comparison.compare();
    }
}


class IntegerOperations {
    private static int a, b;

    IntegerOperations(int num1, int num2) {
        a = num1;
        b = num2;
    }

    static void integerEquals() {
        if (a > b) {
            System.out.println("The first number is greater then the second");
        } else if (a < b) {
            System.out.println("The first number is less then the second");
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}

class Max {
    private static int a, b;

    Max(int a, int b) {
        Max.a = a;
        Max.b = b;
    }

    static int max() {
        int max = a;
        System.out.println(a + " has the maximum value!");
        if (max < b) {
            max = b;
            System.out.print(b + " has the maximum value!");
        } 
        return max;
    }
}

class Comparison {
    private static int num1, num2;

    Comparison(int a, int b) {
        Comparison.num1 = a;
        Comparison.num2 = b;
    }

    static int compare() {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }
}