
import java.util.Scanner;
public class Project1{
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = i + 1;
        }
        int[] arrayWithMaxValues = new int[3];
        for (int i = 0; i <= n - 2; ++i) {
            for (int j = i + 1; i <= n - 1; ++i) {
                if ((array[i] & array[j]) <= k && (array[i] & array[j]) >= arrayWithMaxValues[0]) {
                    arrayWithMaxValues[0] = array[i] & array[j];
                }
                if ((array[i] | array[j]) <= k&& (array[i] & array[j]) >= arrayWithMaxValues[1]) {
                    arrayWithMaxValues[1] = array[i] | array[j];
                }
                if ((array[i] ^ array[j]) <= k && (array[i] & array[j]) >= arrayWithMaxValues[2]) {
                    arrayWithMaxValues[2] = array[i] ^ array[j];
                }
            }
        }
        System.out.println("MaxAnd:" + arrayWithMaxValues[0]);
        System.out.println("MaxOr:" + arrayWithMaxValues[1]);
        System.out.println("MaxXor:" + arrayWithMaxValues[2]); 
  }
}