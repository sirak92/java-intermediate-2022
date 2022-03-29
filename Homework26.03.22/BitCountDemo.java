// Returns the number of one-bits in the two's complement binary representation of the specified int value.

import java.util.Scanner;

public class BitCountDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int a = scan.nextInt();
        System.out.println(BitCount.bitCount(a));


    }
}
class BitCount{
     static int bitCount(int c){
        int b;
        int count = 0;
        for(int i = 0; i < 32; i++ ) {
            b = c & 1;
            if (b == 1) {
                count++;
            }
            c = c >> 1;
        }

        return  count;
    }
}
