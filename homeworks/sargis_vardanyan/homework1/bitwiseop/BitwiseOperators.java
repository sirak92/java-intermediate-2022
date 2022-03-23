package bitwiseop;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BitwiseOperators {
     /*
        https://www.hackerrank.com/challenges/bitwise-operators-in-c/problem?h_r=internal-search&isFullScreen=true
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        System.out.println(calcTheMax(n,k));
    }

    //Simple solution using for. Time complexity O(n^2)
    public static List<Integer> calcTheMax(int n, int k) {
        int maxAnd = 0;
        int maxOr = 0;
        int maxXor = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if ((i & j) > maxAnd && (i & j) < k) {
                    maxAnd = i & j;
                }
                if ((i | j) > maxOr && (i | j) < k) {
                    maxOr = i & j;
                }
                if ((i ^ j) > maxXor && (i ^ j) < k) {
                    maxXor = i ^ j;
                }
            }
        }
        return Arrays.asList(maxAnd, maxOr, maxXor);
    }

    // Looking for a better solution
    // by using time complexity O(n) or even O(1)
    public static List<Integer> calcTheMaxOptimization(int n, int k) {
        // finding max value of the logical AND within the range of [1, n]
        int maxAND = n & (n - 1);

        // finding max value of the logical OR within the range of [1, n]
        int ored = 1 | n;
        int significantBitForOR = 32 - Integer.numberOfLeadingZeros(ored);
        int maxOR = (1 << significantBitForOR) - 1;

        // finding max value of the logical XOR within the range of [1, n]
        // same way as logical OR
        int xored = 1 ^ n;
        int significantBitForXOR = 32 - Integer.numberOfLeadingZeros(xored);
        int maxXOR = (1 << significantBitForXOR) - 1;
        
        // trying to find some connection with these max values(maxAND, maxOR, maxXOR)
        // and k
        return null;
    }

}
