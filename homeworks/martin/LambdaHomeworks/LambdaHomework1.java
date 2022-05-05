import java.util.Scanner;

/*
    Calculate a sum of the array (organize array initialization using Supplier functional interface)
*/

@FunctionalInterface
interface Supplier {
    void arrayInitialization(int q[]);
}

@FunctionalInterface
interface ArraySummoner{
    void summoner(int q[]);
}

public class LambdaHomework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a[] = new int[w];
        Supplier supplier = (q) -> {
            for (int i : q) {
                q[i] = sc.nextInt();
            }
        };
        ArraySummoner arraySummoner = (q) -> {
            int sum = 0;
            for (int i : q) {
                sum = sum + q[i];
            }
        };

        supplier.arrayInitialization(a);
        arraySummoner.summoner(a);
    }
}
