package generics;

import java.util.Arrays;
import java.util.Scanner;

public class SortedList<T extends Comparable<T>> {

    T[] sort(T[] values) {
        T temp = null;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[i].compareTo(values[j]) < 0) {
                    temp = values[j];
                    values[j] = values[i];
                    values[i] = temp;
                }
            }
        }
        return values;
    }

    T[] add(T[] array, T value) {

        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = value;
        T[] sortArray = sort(array);

        return sortArray;
    }

    int getIndex(T[] value, T element) {
        for (int i = 0; i < value.length; i++) {
            if (value[i] == element) {
                return i;
            }
        }

        return -1;
    }

    T search(T[] value, int index) {
        if(index>=0&&index<=value.length){
            return value[index];
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
        System.out.println("enter the item to be added");
        System.out.println(Arrays.toString(sortedList.add(arr, scanner.nextInt())));
        System.out.println("Imported value to get index");
        System.out.println(sortedList.getIndex(arr, scanner.nextInt()));
        System.out.println("Imported value to get the requested item");
        System.out.println(sortedList.search(arr, scanner.nextInt()));
        System.out.println("Max= " + sortedList.max(arr));
        System.out.println("Min=" + sortedList.min(arr));

    }

}
