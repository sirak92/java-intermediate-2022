package com.company;


public class Main {

    public static void main(String[] args) {
        Integer[] arr = {1, 5, 16, 4, 7, 60, 11, 26, 3};


        SortedList<Integer> sortArr = new SortedList<>(arr);

        sortArr.sort();
        System.out.println(sortArr.get(1));
        Character[] chr = {'b', 'a', 'd', 'c'};
        SortedList<Character> sortChr = new SortedList<>(chr);
        sortChr.sort();

        System.out.println(sortChr.get(2));
        System.out.println(sortArr.size());

    }


}




