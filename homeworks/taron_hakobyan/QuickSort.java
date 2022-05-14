import java.util.ArrayList;
import java.util.Collections;

public class QuickSort<T extends Comparable<T>> {
    ArrayList<T> arrayList;

    QuickSort(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
        sort(0, arrayList.size() - 1);
    }

    private void sort(int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        T pivot = this.arrayList.get(highIndex);
        while (leftPointer < rightPointer) {
            while (this.arrayList.get(leftPointer).compareTo(pivot) <= 0 && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (this.arrayList.get(rightPointer).compareTo(pivot) >= 0 && leftPointer < rightPointer) {
                rightPointer--;
            }

            Collections.swap(this.arrayList, leftPointer, rightPointer);
        }
        Collections.swap(this.arrayList, leftPointer, highIndex);
        sort(lowIndex, leftPointer - 1);
        sort(leftPointer + 1, highIndex);
    }
}