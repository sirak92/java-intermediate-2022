package com.company;


public class SortedList<E extends Comparable<E>> {
    private final E[] val;

    SortedList(E[] ob) {
        val = ob;
    }

    public void sort() {

        E pos;
        for (int i = 0; i < val.length; i++) {
            for (int j = i + 1; j < val.length; j++) {
                if (val[i].compareTo(val[j]) > 0) {
                    pos = val[i];
                    val[i] = val[j];
                    val[j] = pos;
                }

            }

        }



    }

    public E get(int index) {

        return val[index];

    }

    public int size() {
        return val.length;
    }


}

