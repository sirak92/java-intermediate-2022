
import java.util.ArrayList;
import java.util.Comparator;

public class SortedList<T extends Comparable> {
    ArrayList<T> list;
    boolean fromMax;

    SortedList() {
        this.fromMax = true;
        this.list = null;
    }

    SortedList(ArrayList<T> list, boolean fromMax) {
        this.fromMax = fromMax;
        if (fromMax) {
            for (int i = 0; i < list.size(); i++) {
                T max = list.get(i);
                for (int j = i; j < list.size(); j++) {
                    if (max.compareTo(list.get(j)) >= 0) {
                        continue;
                    } else if (max.compareTo(list.get(j)) < 0) {
                        max = list.get(j);
                    }
                }
                this.list.add(max);
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                T min = list.get(i);
                for (int j = i; j < list.size(); j++) {
                    if (min.compareTo(list.get(j)) > 0) {
                        min = list.get(j);
                    } else if (min.compareTo(list.get(j)) <= 0) {
                        continue;
                    }
                }
                this.list.add(min);
            }
        }
    }

    public ArrayList<T> getList() {
        return list;
    }

    public boolean isFromMax() {
        return fromMax;
    }

    public void addFast(T element) {
        int left = 0, right = list.size() - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (element.equals(list.get(middle))) {
                list.add(middle, element);
                return;
            }else if (list.get(middle).compareTo(element) < 0) {
                left = middle + 1;
            }else{
                right = middle - 1;
            }
        }
    }

    public void add(T newElement) {
        for (int i = 0; i < this.list.size(); i++) {
            if (newElement.compareTo(this.list.get(i)) >= 0) {
                this.list.add(i, newElement);
                return;
            }
        }
        this.list.add(newElement);
    }

    public void addAll(ArrayList<T> newList) {
        for (int i = 0; i < newList.size(); i++) {
            add(list.get(i));
        }
    }

    public void remove(T element) {
        this.list.remove(element);
    }

    public void removeAll(ArrayList<T> arrayList) {
        for (T t : arrayList) {
            remove(t);
        }
    }

    public T getElementByIndex(int index) {
        if (index > this.list.size() - 1) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return this.list.get(index);
        }
    }
}

