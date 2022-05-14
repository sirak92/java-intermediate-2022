package sorting;

import java.util.*;

public class MergeSort<T> {
    private Comparator<? super T> comparator;

    public MergeSort() {
        this(null);
    }

    public MergeSort(Comparator<? super T> comparator) {
        this.comparator = comparator;
    }

    public void mergeSort(List<T> list) {
        if (list.size() < 2) {
            return;
        }

        List<T> left = new ArrayList<>(list.subList(0, list.size() / 2));
        List<T> right = new ArrayList<>(list.subList(list.size() / 2, list.size()));

//        NOTE: does not work, read doc of ArrayList subList() method
//        List<T> left = list.subList(0, list.size() / 2);
//        List<T> right = list.subList(list.size() / 2, list.size());

        mergeSort(left);
        mergeSort(right);

        merge(list, left, right);
    }

    private void merge(List<T> list, List<T> left, List<T> right) {
        int i = 0, j = 0;

        // i + j
        while (i < left.size() && j < right.size()) {
            if (compareElements(left.get(i), right.get(j)) <= 0) {
                list.set(i + j, left.get(i));
                i++;
            } else {
                list.set(i + j, right.get(j));
                j++;
            }
        }

        // i + j
        if (i == left.size()) {
            while (j < right.size()) {
                list.set(i + j, right.get(j));
                j++;
            }
        } else {
            while (i < left.size()) {
                list.set(i + j, left.get(i));
                i++;
            }
        }
    }

    @SuppressWarnings("unchecked")
    private int compareElements(T first, T second) {
        return comparator == null ? ((Comparable<? super T>) first).compareTo(second) :
                comparator.compare(first, second);
    }
}
