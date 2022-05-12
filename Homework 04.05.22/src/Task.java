/*
public class Task {
    ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Task task = new Task();

        task.tupo();
    }
    public void tupo() {
        while (true) {
            A action = (int n, int f) -> {
                f = 0;
                n = list.get(f);
                if (n % f == 0) {
                    System.out.println("true");
                }
                System.out.println("false");
                if (f != (list.size() - 1)) {
                    f++;
                } else {
                    return;
                }

            };
        }
    }
}
interface A{
    void choose(int a, int b);
}*/
interface SortedList<T> {
    void add(T element);
}

class SortedArrayList<T extends Comparable<T>> implements SortedList<T> {
    private static final int DEFAULT_CAPACITY = 10;

    T[] data;
    int size;

    public SortedArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public SortedArrayList(int initialCapacity) {
        size = 0;
        data = (T[]) new Comparable[initialCapacity];
    }
    @Override
    public void add(T element) {
        if (size == data.length) {
            this.larger();
        }
        for (int i = 0; i < size; i++) {
            if (data[i].compareTo(element) >= 0) {
                shiftRight(i);
                data[i] = element;
                size++;
                return;
            }
        }
        data[size] = element;
        size++;
    }
    private void remove(T element){
        int removedElementCount = 0;
        for(int i=0;i<size;i++) {
        if(element.compareTo(data[i])==0){
            removedElementCount ++;
            size--;
        }
        data[i]=data[i+removedElementCount];
        }
        }
    private void remove(int index){
        for(int i=0;i<size;i++){
            if(i==index){
                shiftLeft(index);
            size--;
            }
            data[i]=data[i];
        }
    }
    private void shiftLeft(int index){
        for(int i=index;i<size;i++){
            data[i]=data[i+1];
        }
    }
    private T[] larger() {
        T[] data1 = (T[]) new Object[data.length * 2];
        for (int i = 0; i < size; i++) {
            data1[i] = this.data[i];
        }
        this.data=data1;
        return data;
    }
    public void shiftRight(int i) {
        for (int j=size;j>i;j--) {
          data[j]=data[j-1];
        }
    }

    private void view() {
        for (int i = 0; i < size; i++) {
            System.out.println(this.data[i]);
        }
    }
    private void search(int index){
        for(int i=0;i<size;i++){
            if(index==i){
                System.out.println(data[i]);
            }
        }
    }

    public static void main(String[] args) {
        SortedArrayList arr = new SortedArrayList();
        arr.add(4);
        arr.add(3);
        arr.add(6);
        arr.add(2);
        arr.search(2);
    }

}







