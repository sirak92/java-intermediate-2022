package recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            System.out.println(powerOfN(3, i));
            i++;
        }
    }

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }

        int result = a;
        if (n != 1) {
            if (n % 2 == 0) {
                result = power(a, n / 2) * power(a, n / 2);
            } else {
                result = a * power(a, n / 2) * power(a, n / 2);
            }
        }
        return result;
    }

    public static int powerOfN(int a, int n){
        if (n == 0) {
            return 1;
        }

        int result = 1;
        int degree = n;
        while (degree > 0) {
            if (degree % 2 == 0) {
                a *= a;
                degree >>= 1;
            } else {
                result *= a;
                degree--;
            }
        }
        return result;
    }
}
