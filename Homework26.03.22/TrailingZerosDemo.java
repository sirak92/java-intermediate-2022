//Returns the number of zero bits following the lowest-order ("rightmost") one-bit in the two's complement binary representation of the specified int value.

import java.util.Scanner;

public class TrailingZerosDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scan.nextInt();
        int result = TrailingZeros.trailingZeros(num);
        System.out.println("the result is "+" "+result);


    }
}
class TrailingZeros {
    static int  trailingZeros(int a) {
        int c;
        int count = 0;

        for (int i = 0; i < 32; i++) {
            c = a & 1;
            if (c == 1) {

                break;
            }
             count++;
                a = a >> 1;
        }
            return count;



    }
}
