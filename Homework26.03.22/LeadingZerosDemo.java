//Returns the number of zero bits preceding the highest-order ("leftmost") one-bit in the two's complement binary representation of the specified int value.

import java.util.Scanner;

public class LeadingZerosDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scan.nextInt();
        LeadingZeros l = new LeadingZeros();
        int result = l.leadingZeros(num);
        System.out.println("the result is"+" "+result);


    }
}
class LeadingZeros{
    int leadingZeros(int a){
         int count = 0;
         int c;
         for(int i = 0; i < 32; i++){
            c = a&1;
            if(c == 0){
                count++;
                a = a >> 1;
            }
            else {count = 0;
            a = a >> 1;}
        }
         return count;
    }
}
