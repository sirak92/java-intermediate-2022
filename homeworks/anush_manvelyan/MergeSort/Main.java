package tech42;

class Main {
    public static void merge(int[] leftSide, int[] rightSide, int[] arr, int leftSize, int rightSize) {
        int i = 0, left = 0, right = 0;

        while (left < leftSize && right < rightSize) {
            if (leftSide[left] < rightSide[right]) {
                arr[i++] = leftSide[left++];
            } else {
                arr[i++] = rightSide[right++];
            }
        }

        while (left < leftSize) {
            arr[i++] = leftSide[left++];
        }

        while (right < rightSize) {
            arr[i++] = rightSide[right++];
        }
    }

    public static void mergeSort(int[] arr, int len) {
        if (len < 2) {
            return;
        }

        int mid = len / 2;
        int[] left_arr = new int[mid];
        int[] right_arr = new int[len - mid];

        int k = 0;
        for (int i = 0; i < len; ++i) {
            if (i < mid) {
                left_arr[i] = arr[i];
            } else {
                right_arr[k] = arr[i];
                k = k + 1;
            }
        }
        mergeSort(left_arr, mid);
        mergeSort(right_arr, len - mid);
        merge(left_arr, right_arr, arr, mid, len - mid);
    }

    public static void main(String args[]) {
        int[] arr = {3, 9, 854, 1, 0, 3, 87, 91, 2};
        mergeSort(arr, arr.length);
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}