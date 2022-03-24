
import java.util.Scanner;

public class Bitwise2{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n & k");
        int n = scan.nextInt();
        int k = scan.nextInt();

        if (n > 1000 || k < 2 || k > n) {
            System.out.println("n or k out of bounds");
            return;
        }

            int val1 = 0, val2 = 0, val3 = 0;
            int and;
            int or;
            int xor;
            for (int i = 1; i <= k; i++) {
                for (int j = i + 1; j <= n; j++) {
                    and = i & j;
                    if (and > val1 && and < k) {
                        val1 = and;

                    }

                }
            }
            System.out.println(val1);
            for (int i = 1; i <= k; i++) {
                for (int j = i + 1; j <= n; j++) {
                    or = i | j;

                    if (or > val2 && or < k) {
                        val2 = or;
                    }

                }
            }
            System.out.println(val2);
            for (int i = 1; i <= k; i++) {
                for (int j = i + 1; j <= n; j++) {
                    xor = i ^ j;
                    if (xor > val3 && xor < k) {
                        val3 = xor;
                    }

                }
            }
            System.out.println(val3);
        }

    }
