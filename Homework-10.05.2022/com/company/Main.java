package com.company;

public class Main {

    public static void main(String[] args) {
        Integer[] in = {13, 14, 12, 11,7,9,9,19};
        InsSort<Integer> ob = new InsSort<>(in);
        ob.insSort();
        for(int i = 0; i < in.length ; i++){
            System.out.print(in[i]+" ");
        }

    }


}
