package sorting;

import java.util.*;

public class SelectionSort<T> {

    private Comparator<? super T> comparator;

    public SelectionSort() {
        this(null);
    }

    public SelectionSort(Comparator<? super T> comparator) {
        this.comparator = comparator;
    }

    public List<T> sort(List<T> list){
        for (int i = 0; i < list.size(); i++) {
            int minPos = minimumPosition(list, i);
            swap(list, minPos, i);
        }
        return list;
    }

    private int minimumPosition(List<T> list, int from){
        int minPos = from;
        for (int i = from + 1; i < list.size(); i++) {
            if (compareElements(list.get(i), list.get(minPos)) < 0) {
                minPos = i;
            }
        }
        return minPos;
    }

    private void swap(List<T> list, int i, int j){
        T tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }

    @SuppressWarnings("unchecked")
    private int compareElements(T first, T second) {
        return comparator == null ? ((Comparable<? super T>) first).compareTo(second) :
                comparator.compare(first, second);
    }
}
