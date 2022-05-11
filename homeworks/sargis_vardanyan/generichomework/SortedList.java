package generichomework;

import java.util.Comparator;
import java.util.List;

public class SortedList<T> {
    private static final int DEFAULT_CAPACITY = 16;
    private Object[] list;
    private int size;
    private Comparator<? super T> comparator;

    public SortedList() {
        this(DEFAULT_CAPACITY);
    }

    public SortedList(int capacity) {
        list = new Object[capacity];
    }

    public SortedList(Comparator<? super T> comparator) {
        this(DEFAULT_CAPACITY);
        this.comparator = comparator;
    }

    public void add(T element) {
        if (size == this.list.length * 0.75) {
            insureCapacity();
        }

        if (element == null) {
            throw new RuntimeException("Null cannot be held by list:");
        } else if (isEmpty()) {
            addFirst(element);
            return;
        }
        int position = findPosition(0, size - 1, element);
        insert(position, element);
        size++;
    }

    @SuppressWarnings("unchecked")
    private int findPosition(int startPos, int endPos, T element) {
        if (startPos == endPos) {
            return compareElements(element, (T) list[endPos]) > 0 ? endPos + 1 : endPos;
        }
        int midIndex = startPos + (endPos - startPos) / 2;
        T mid = (T) list[midIndex];
        int comparisonResult = compareElements(element, mid);
        if (comparisonResult == 0) {
            return midIndex;
        } else if (comparisonResult == 1) {
            return findPosition(midIndex + 1, endPos, element);
        } else if (comparisonResult == -1) {
            return findPosition(startPos, midIndex, element);
        }
        return -1;
    }

    private void insert(int position, T element) {
        System.arraycopy(list, position, list, position + 1, size - position);
        list[position] = element;
    }

    @SuppressWarnings("unchecked")
    private int compareElements(T first, T second) {
        return comparator == null ? ((Comparable<? super T>) first).compareTo(second) :
                comparator.compare(first, second);
    }

    private void addFirst(T element) {
        this.list[0] = element;
        size++;
    }

    public boolean contains(T element) {
        return search(0, size - 1, element) >= 0;
    }

    public int indexOf(T element) {
        return search(0, size - 1, element);
    }

    @SuppressWarnings("unchecked")
    private int search(int startPos, int endPos, T element) {
        if (endPos < startPos) {
            return -1;
        }
        int midIndex = startPos + (endPos - startPos) / 2;
        T mid = (T) list[midIndex];
        int comparisonResult = compareElements(element, mid);

        if (comparisonResult == 0) {
            return midIndex;
        } else if (comparisonResult == 1) {
            return search(midIndex + 1, endPos, element);
        } else {
            return search(startPos, midIndex - 1, element);
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    private void insureCapacity() {
        Object[] enlargedList = new Object[this.list.length * 2];
        System.arraycopy(this.list, 0, enlargedList, 0, this.list.length);
        this.list = enlargedList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[ ");
        for (int i = 0; i < size - 1; i++) {
            result.append(list[i]).append(", ");
        }
        return result.append(list[size - 1]).append(" ]").toString();
    }
}