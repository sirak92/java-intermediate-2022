import java.util.Random;

public class Solution_369 {

    public static void sorting(int arr[], int length) {
        for (int i = 0; i < length - 1; ++i)
            for (int j = i; j >= 0; --j)
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
    }

    public static void main(String[] args) {
        Random random = new Random();

        int X[] = new int[30];
        for (int i = 0; i < 30; ++i) {
            System.out.print("X[" + i + "] = ");
            X[i] = random.nextInt(125);
            System.out.println(X[i]);
        }

        sorting(X, 30);
        // System.out.println("\n\n\n");

        // for (int i = 0; i < 30; ++i){
        //     System.out.print("X[" + i +"] = ");
        //     System.out.println(X[i]);
        // }

        System.out.println("\n\n\n");

        int Y[] = new int[30];
        for (int i = 0; i < 30; ++i) {
            System.out.print("Y[" + i + "] = ");
            Y[i] = random.nextInt(125);
            System.out.println(Y[i]);
        }

        System.out.println();

        boolean t = true;
        for (int i = 0; i < 30; ++i) {
            for (int j = 0; j < 30; ++j)
                if (X[i] == Y[j]) {
                    t = false;
                    break;
                }
            if (t) {
                System.out.println(X[i]);
                break;
            }
        }
    }
}