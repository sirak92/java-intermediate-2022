import java.time.format.TextStyle;

public class Insertion<T extends Comparable<T>> {
    T[] list = (T[]) new Comparable[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

    public Insertion() {
        this.list = list;
    }
    private void Sorting(T[] array) {
        T temp;
        int j;
        for (int i = 1; i < array.length; i++) {
            j=i-1;
            temp=array[i];
            while (j>=0&&(temp.compareTo(array[j])<=0)){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=temp;
        }

    }
    private void view(T[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        Insertion test = new Insertion();
        test.Sorting(test.list);
        test.view(test.list);
    }
}
}
