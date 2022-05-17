package tech42;

public class Queue<T> {
    public DoubleLinkedList<T> queue = new DoubleLinkedList<>();
    int size = 0;

    public void add(T element) {
        queue.add(element);
        size++;
    }

    public T get(int index) {
        return queue.get(size - 1);
    }

    public void remove() {
//        ???????????????????????????????????????
        T elem = queue.get(0);
        queue.remove(elem);
        size--;
    }

    public int getSize() {
        return size;
    }

    public void printQ() {
        queue.showLinkedList();
    }
}
