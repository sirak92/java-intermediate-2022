package tech42;

import java.util.Arrays;

public class GenericSortedList<T extends Comparable<T>> {

    private T[] array;

    public GenericSortedList(T[] array) {
        this.array = array;
    }

    int partition(T array[], int start, int end) {
        T pivot = array[end];
        int i = (start - 1);
        for (int j = start; j < end; ++j) {
            if (array[j].compareTo(pivot) == 0 || array[j].compareTo(pivot) < 0) {
                ++i;
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        T temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;

        return (i + 1);
    }

    void quickSort(T array[], int start, int end) {
        if (start < end) {

            int p = partition(array, start, end);

            quickSort(array, start, p - 1);

            quickSort(array, p + 1, end);
        }
    }

    public T[] add(T value) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = value;

        quickSort(array, 0, array.length - 1);

        return array;
    }

    void printArray() {
        for (T arrEl : array) {
            System.out.println(arrEl + " ");
        }
    }

    void search(T searchingElement) {
        for (int i = 0; i < array.length; ++i) {
            if (searchingElement.compareTo(array[i]) == 0) {
                System.out.print("Index: " + i + "\n");
            }
        }
    }

    int size() {
        return array.length;
    }

    T getElement(int index) {
        try {
            return array[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You don't have any element in that index: " + e);
        }
        return null;
    }

}
