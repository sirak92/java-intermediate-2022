package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 10, 10, 10, 0, 6};
        int j = -1;
        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            j++;
            if (arr[i] != 0 ) {

                if(j >= arr.length ){
                    break;
                }
                arr1[j] = arr[i];


            } else if (j < arr.length - 1) {

                arr1[j++] = 0;
                arr1[j] = arr[i];


            }
        }
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }

}
