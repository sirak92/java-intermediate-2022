package com.company;


public class Main {

    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();

        myHashMap.put(12, "Moscow");
        myHashMap.put(18, "Paris");
        System.out.println(myHashMap.remove(12));
        myHashMap.put(9, "Kathmandu");
        System.out.println(myHashMap.put(9, "Ashtarak"));
        System.out.println(myHashMap.get(18));
        System.out.println(myHashMap.get(12));
        System.out.println(myHashMap.get(9));

    }
}
