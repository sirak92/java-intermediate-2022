import java.util.Scanner;

public class Fizbuz {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();

        for (int i = 0; i <= b; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                continue;
            }

            System.out.println((i % 15 == 0) ? i + " " + "fizbuz " : ((i % 3 == 0) ? i + " " + "fiz " : i + " " + "buz"));
        }


    }
}
