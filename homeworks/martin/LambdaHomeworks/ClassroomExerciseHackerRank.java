import java.util.Scanner;

/*Write the following methods that return a lambda expression performing a specified action:

    PerformOperation isOdd(): The lambda expression must return true if a number is odd
                              or false if it is even.
    PerformOperation isPrime(): The lambda expression must return true if a number is prime
                                or false if it is composite.
    PerformOperation isPalindrome(): The lambda expression must return true if a number is a palindrome
                                     or false if it is not.*/

@FunctionalInterface
interface PerformOperation1 {
    void isOdd(int q);
}

@FunctionalInterface
interface PerformOperation2 {
    void isPrime(int q);
}

@FunctionalInterface
interface PerformOperation3 {
    void isPalindrome(int q);
}

public class ClassroomExerciseHackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PerformOperation1 performOperation1 = (q) -> {
                    if (q % 2 == 0) {
                        System.out.print("EVEN");
                    } else {
                        System.out.print("ODD");
                    }
                };
        PerformOperation2 performOperation2 = (q) -> {
                    int x = q/2;
                    while (x > 1) {
                        if(q % x == 0) {
                            System.out.print("COMPOSITE");
                            break;
                        }
                        x--;
                    }
                    if(x == 1) {
                        System.out.print("PRIME");
                    }
                };
        PerformOperation3 performOperation3 = (q) -> {
                    int q2, qPal = 0;
                    q2 = q;
                    while (q > 0) {
                        qPal = qPal * 10 + q % 10;
                        q = q / 10;
                    }
                    if(qPal == q2) {
                        System.out.print("PALINDROME");
                    } else {
                        System.out.print("NOT PALINDROME");
                    }
                };
        int lengthOfArray = sc.nextInt();
        int a[] = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            int k = sc.nextInt();
            a[i] = sc.nextInt();
            if (k == 1) {
                performOperation1.isOdd(a[i]);
                System.out.println();
            }
            if (k == 2) {
                performOperation2.isPrime(a[i]);
                System.out.println();
            }
            if (k == 3) {
                performOperation3.isPalindrome(a[i]);
                System.out.println();
            }
        }
    }
}
