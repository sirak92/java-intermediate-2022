import java.util.Scanner;

public class Solution_341 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("n = ");
            n = input.nextInt();
        } while (n <= 0 || n > 100);

        int X[] = new int[100];
        System.out.println();

        for (int i = 0; i < n; ++i) {
            System.out.print("X[" + i + "] = ");
            X[i] = input.nextInt();
        }

        System.out.println();

        int q = 0;
        for (int i = 0; i < n; ++i) {
            boolean t = true;
            for (int j = 0; j < n; ++j) {
                if (X[i] == X[j] && i != j) {
                    t = false;
                    break;
                }
            }
            if (t)
                ++q;
        }
        System.out.println(q);
    }
}
