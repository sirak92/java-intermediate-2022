package generics;

import java.util.Scanner;

public class SortedList<T extends Comparable> {

    int getIndex(T[] value, T element) {
        for (int i = 0; i < value.length; i++) {
            if (value[i] == element) {
                return i;
            }
        }

        return -1;
    }

    T search(T[] value, T searchs) {
        for (int i = 0; i < value.length; i++) {
            if (value[i] == searchs) {
                return searchs;
            }
        }
        return null;
    }

    T max(T[] value) {
        T max = value[0];
        for (int i = 0; i < value.length; i++) {
            if (value[i].compareTo(max) > 0)
                max = value[i];
        }
        return max;
    }

    T min(T[] value) {
        T min = value[0];
        for (int i = 0; i < value.length; i++) {
            if (value[i].compareTo(min) < 0)
                min = value[i];
        }
        return min;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedList<Integer> sortedList = new SortedList<>();
        System.out.println("imported array size");
        int arraySize = scanner.nextInt();
        Integer arr[] = new Integer[arraySize];
        System.out.println("Imported values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Imported value to get index");
        System.out.println(sortedList.getIndex(arr, scanner.nextInt()));
        System.out.println("Imported value to get the requested item");
        System.out.println(sortedList.search(arr, scanner.nextInt()));
        System.out.println("Max= " + sortedList.max(arr));
        System.out.println("Min=" + sortedList.min(arr));

    }

}
