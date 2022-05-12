package com.company;


public class InsSort<T extends Comparable<T>> {
    private final T[] val;

    InsSort(T[] ob) {
        val = ob;
    }

    <val> T[] insSort() {

        for (int i = 1; i < val.length; i++) {
            T key = val[i];
            int j;
            for ( j = i - 1; j >= 0; j--) {
                if (val[j].compareTo(key) > 0) {
                    val[j + 1] = val[j];
                } else {
                    break;
                }
            }
            val[j + 1] = key;
        }
        return val;

    }


}

