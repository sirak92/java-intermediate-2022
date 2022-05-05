package com.company;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Supplier<Integer> useSupp = () -> {
            int result = 0;
            int[] arr = {10, 1, 42, 33, 15, 2, 76, 85};
            for (int i = 0; i < arr.length; i++) {
                result += arr[i];
            }
            return result;
        };
        System.out.println(useSupp.get());



    }

}




