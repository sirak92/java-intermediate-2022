import java.util.Scanner;

public class Solution_329{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("n = ");
            n = input.nextInt();
        }while(n <= 0 || n > 100);

        int X[] = new int[100];
        int Y[] = new int[100];

        System.out.println();
        for(int i = 0; i < n; ++i) {
            System.out.print("X[" + i + "] = ");
            X[i] = input.nextInt();
        }

        int l = 0;
        for(int i = 0; i < n; ++i){
            int sum = 0;
            for(int j = 0; j <= i; ++j)
                sum += X[j];
            Y[l++] = sum;
        }

        System.out.println();

        for(int i = 0; i < l; ++i) {
            System.out.print("Y[" + i + "] = ");
            System.out.println(Y[i]);
        }
    }
}


