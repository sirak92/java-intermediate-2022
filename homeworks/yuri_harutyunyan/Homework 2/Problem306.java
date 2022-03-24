import java.util.Scanner;

public class Problem306 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int number = 10; number < 100; number++) {
            int firstdigit = number%10;
            int seconddigit = number/10;
            if((firstdigit+seconddigit)>5) {
                for (int j = 0; j < array.length; j++) {
                    array[j] = number;
                    System.out.println(array[j]);
                    break;
                }
            }

        }
    }
}
