import java.util.Scanner;

public class IntegerDemo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the first number for the first Integer operation: ");
        int num1 = console.nextInt();
        System.out.print("Enter the second number for the first Integer operation: ");
        int num2 = console.nextInt();
        IntegerOperations obj1 = new IntegerOperations(num1, num2);
        obj1.integerEquals();

        System.out.print("Enter the first number for the second Integer operation: ");
        int num3 = console.nextInt();
        System.out.print("Enter the second number for the second Integer operation: ");
        int num4 = console.nextInt();
        Max obj2 = new Max(num3, num4);
        obj2.max();

        System.out.print("Enter the first number for the third Integer operation: ");
        int num5 = console.nextInt();
        System.out.print("Enter the second number for the third Integer operation: ");
        int num6 = console.nextInt();
        Comparison obj3 = new Comparison(num5, num6);
        obj3.compare();
    }
}


class IntegerOperations {
    int a, b;

    IntegerOperations(int num1, int num2) {
        a = num1;
        b = num2;
    }

    boolean integerEquals() {
        if (a == b) {
            System.out.println("True!");
            return true;
        } else {
            System.out.println("False!");
            return false;
        }
    }
}

class Max {
    int a, b;

    Max(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int max() {
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
    int num1, num2;

    Comparison(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    int compare() {
    	int result;
        if (num1 > num2) {
            result = 1;
        } else if (num1 == num2) {
            result = 0;
        } else {
            result = -1;
        }
        return result;
    }
} 