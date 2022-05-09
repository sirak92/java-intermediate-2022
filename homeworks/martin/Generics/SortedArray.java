public class SortedArray<T extends Number> {
    T[] array;

    SortedArray(T array[]) {
        this.array = sorted(array);
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void searchElement (T t) {
        int index = -1;
        for(int i = 0; i < array.length; i++) {
            if(t.doubleValue() == array[i].doubleValue()) {
                t = array[i];
                index = i + 1;
            }
            if(index > -1) {
                System.out.println("Your " + t + " is " + index + "th element");
                break;
            }
        }
    }

    public int size() {
        return array.length;
    }

    public Number getElement(int index) {
        return array[index].doubleValue();
    }

    private static <T extends Number> T[] sorted(T[] a) {
        T k = a[0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i].doubleValue() > a[j].doubleValue() && i < j) {
                    k = a[j];
                    a[j] = a[i];
                    a[i] = k;
                }
            }
        }
        return a;
    }
}
