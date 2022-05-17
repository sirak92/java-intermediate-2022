package com.company;

public class Main {

    public static void main(String[] args) {
        Double[] arr = {15.1, 26.27, 15.15, 3.47, -41.0, 3.48};
        MergeSort<Double> ob = new MergeSort<>();
        ob.mergeSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
