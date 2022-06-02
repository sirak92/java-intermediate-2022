public class Queue<T> {

    public LinkedList<T> queue = new LinkedList<>();
    int size = 0;

    public void add(T element) {
        queue.add(element);
        size++;
    }

    public void remove() {
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

    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        } else {
            return false;
        }
    }
}
