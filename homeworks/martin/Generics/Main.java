import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        Integer[] a = new Integer[] {12, 6, 1, 95, 0};
        SortedArray<Integer> sortedArray1 = new SortedArray<>(a);
        sortedArray1.print();
        System.out.println(sortedArray1.size());
        System.out.println(sortedArray1.getElement(4));
        sortedArray1.searchElement(4);
        Double[] d = new Double[] {12.3, 15.6, 1.369, 3.69};
        SortedArray<Double> sortedArray2 = new SortedArray<>(d);
        sortedArray2.print();
        System.out.println(sortedArray2.size());
        System.out.println(sortedArray2.getElement(2));
        sortedArray2.searchElement(5.36);
        sortedArray2.searchElement(15.6);
    }
}
