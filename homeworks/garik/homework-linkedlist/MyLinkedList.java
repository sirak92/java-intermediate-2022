package Collection;

public class MyLinkedList<T> {

    private MyNode<T> first;
    private MyNode<T> last;
    private int size;

    public MyLinkedList() {
        this.size = size;
    }

    public void add(T element) {
        linkLast(element);
    }

    public void linkLast(T data) {
        MyNode<T> l = null;
        MyNode<T> myNode = new MyNode<T>(l, data, null);
        this.last = myNode;
        if (l == null) {
            this.first = myNode;
        } else l.setNext(myNode);
        this.size++;
    }

    public T get(int index) {
        MyNode<T> node = this.find(index);
        return node.getData();
    }

    public MyNode<T> find(int index) {
        MyNode<T> x;
        x = this.first;

        for (int i = 0; i < index; i++) {
            x = x.getNext();
        }
        return x;
    }

    public void remove(int index) {
        MyNode<T> myNode = this.find(index);
        this.unlink(myNode);
    }

    void unlink(MyNode<T> x) {
        MyNode<T> next = x.getNext();
        MyNode<T> prev = x.getPrev();
        if (prev == null) {
            this.first = next;
        } else {
            prev.setNext(next);
            x.setPrev(null);
        }
        if (next == null) {
            this.last = prev;
        } else {
            next.setPrev(prev);
            x.setNext(null);
        }
        this.size--;
    }


}
