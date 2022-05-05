import java.util.Arrays;
import java.util.function.Supplier;

@FunctionalInterface
interface IsOdd {
    boolean isOdd(int x);
}


public class IsOdd1 {
    public static void main(String[] args) {
        IsOdd isOdd = (x) -> x % 2 == 0 ? false : true;
        System.out.println(isOdd.isOdd(3) ? "Odd" : "Even");


        IsOdd isPrime = (x) -> {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(isPrime.isOdd(5) ? "Prime" : "Not Prime");

        IsOdd isPalindrome = (x) -> {
            int temp = 0;
            int temp2 = x;
            while (temp2 > 0) {
                temp *= 10;
                temp += (temp2 % 10);
                temp2 = temp2 / 10;

            }
            if (temp == x) {
                return true;
            }
            return false;
        };
        System.out.println(isPalindrome.isOdd(1221) ? "Palindrome" : "Not Palindrome");


    }
}
