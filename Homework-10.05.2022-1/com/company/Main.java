package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 5, 16, 3, 27, 89, 11, -1};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int arr[], int i, int j) {
        int tos = arr[i];
        arr[i] = arr[j];
        arr[j] = tos;


    }

    static int separation(int arr[], int low, int high) {
        int point = arr[high];
        int i = low - 1;
        for (int j = low; j <= arr.length - 1; j++) {
            if (arr[j] < point) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int sep = separation(arr, low, high);
            quickSort(arr, low, sep - 1);
            quickSort(arr, sep + 1, high);
        }
    }
}


