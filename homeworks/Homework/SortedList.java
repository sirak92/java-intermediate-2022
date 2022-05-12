import java.util.Scanner;

public class SortedList<T> {
    private T[] value;

    int getIndex(T x) {
        for (int i = 0; i < value.length; i++) {
            if (x == value[i]) {
                return i;
            }
        }
        return -1;
    }

    T search(T x) {
        for (int i = 0; i < value.length; i++) {
            if (x == value[i]) {
                return x;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SortedList<Integer> sortedList = new SortedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Array Size");
        int arraySize = scanner.nextInt();
        Integer arr[] = new Integer[arraySize];
        System.out.println("Insert Array Elements");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = scanner.nextInt();
        }
    }
}
