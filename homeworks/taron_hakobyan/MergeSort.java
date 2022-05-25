
import java.util.*;

public class MergeSort {
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            arrayList.add(random.nextInt(100, 1000));
        }
        System.out.println(arrayList);
        mergeSort(arrayList);
        System.out.println(arrayList);
    }

    public static <T extends Comparable<T>> void mergeSort(ArrayList<T> inputArrayList) {
        int inputLength = inputArrayList.size();
        if (inputLength < 2) {
            return;
        }
        int midIndex = inputLength / 2;
        ArrayList<T> leftHalf = new ArrayList<>(inputArrayList.subList(0, midIndex));
        ArrayList<T> rightHalf = new ArrayList<>(inputArrayList.subList(midIndex, inputLength));
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(inputArrayList, leftHalf, rightHalf);
    }

    private static <T extends Comparable<T>> void merge(ArrayList<T> inputArrayList,
                                                        ArrayList<T> leftHalf,
                                                        ArrayList<T> rightHalf) {
        int leftSize = leftHalf.size();
        int rightSize = rightHalf.size();
        int iteratorForRightHalf = 0;
        int iteratorForLeftHalf = 0;
        int iteratorForInputArray = 0;
        while (iteratorForLeftHalf < leftSize && iteratorForRightHalf < rightSize) {
            if (leftHalf.get(iteratorForLeftHalf).compareTo(rightHalf.get(iteratorForRightHalf)) < 0) {
                inputArrayList.set(iteratorForInputArray, leftHalf.get(iteratorForLeftHalf));
                iteratorForLeftHalf++;
            } else {
                inputArrayList.set(iteratorForInputArray, rightHalf.get(iteratorForRightHalf));
                iteratorForRightHalf++;
            }
            iteratorForInputArray++;
        }
        while (iteratorForLeftHalf < leftSize) {
            inputArrayList.set(iteratorForInputArray, leftHalf.get(iteratorForLeftHalf));
            iteratorForLeftHalf++;
            iteratorForInputArray++;
        }
        while (iteratorForRightHalf < rightSize) {
            inputArrayList.set(iteratorForInputArray, rightHalf.get(iteratorForRightHalf));
            iteratorForRightHalf++;
            iteratorForInputArray++;
        }
    }
}
