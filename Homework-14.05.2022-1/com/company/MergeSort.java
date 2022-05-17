package com.company;

public class MergeSort<T extends Comparable<T>> {
    public void mergeSort(T[] array, int len) {
        if (len < 2) {
            return;
        }
        int mid = len / 2;
        T[] leftArray = (T[]) new Comparable[mid];
        T[] rightArray = (T[]) new Comparable[len - mid];
        int j = 0;
        int k = 0;
        for (int i = 0; i < len; i++) {
            if (i < mid) {
                leftArray[j] = array[i];
                j++;
            } else {
                rightArray[k] = array[i];
                k++;
            }
        }
        mergeSort(leftArray, mid);
        mergeSort(rightArray, len - mid);
        sort(leftArray, rightArray, array, mid, len - mid);
    }

    private void sort(T[] leftArr, T[] rightArr, T[] arr, int leftSize, int rightSize) {
        int l = 0;
        int r = 0;
        int i = 0;
        while (l < leftSize && r < rightSize) {
            if (leftArr[l].compareTo(rightArr[r]) < 0) {
                arr[i++] = leftArr[l++];

            } else {
                arr[i++] = rightArr[r++];
            }
        }
        while (l < leftSize) {
            arr[i++] = leftArr[l++];
        }
        while (r < rightSize) {
            arr[i++] = rightArr[r++];
        }
    }


}
