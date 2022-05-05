package tech42;

public class UsingLambda {

    public static void main(String[] args) {

        PerformOperation odd = (a) -> a % 2 != 0;
        System.out.print("The number is odd: ");
        System.out.println(odd.isTrue(123));

        PerformOperation prime = (b) -> {
            for (int i = 2; i < b; ++i) {
                if (b % i == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.print("The number is prime: ");
        System.out.println(prime.isTrue(5));

        PerformOperation palindrome = (num) -> {
            int rev = 0;
            int number = num;

            while (number > 0) {
                rev = number % 10 + rev * 10;
                number /= 10;
            }

            if (num == rev) {
                return true;
            } else {
                return false;
            }
        };

        System.out.print("The number is palindrome: ");
        System.out.println(palindrome.isTrue(959));
    }
}
