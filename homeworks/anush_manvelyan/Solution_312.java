import java.util.Scanner;

public class Solution_312 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;

        do{
            System.out.print("n = ");
            n = input.nextInt();
        }while(n <= 0 || n > 100);

        int X[] = new int[100];
        int Y[] = new int[100];

        System.out.println();

        for(int i = 0; i < n; ++i){
            System.out.print("X[" + i + "] = ");
            X[i] = input.nextInt();
        }

        int j = 0;
        for (int i = 0; i < n - 1; ++i){
            if (Math.abs(X[i]) > Math.abs(X[i + 1]))
                Y[j++] = X[i];
            else
                Y[j++] = X[i + 1];
        }

        System.out.println();
        
        for (int i = 0; i < j; ++i) {
            System.out.print("Y[" + i + "] = ");
            System.out.println(Y[i]);
        }
    }
}


