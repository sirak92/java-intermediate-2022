package com.company;


public class Main {

    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
        myHashMap.put(12, "London");
        myHashMap.put(12, "Moscow");
        myHashMap.put(16, "Yerevan");
        myHashMap.put(18, "Paris");
        myHashMap.put(2, "Roma");
        myHashMap.put(1, "Manchester");
        System.out.println(myHashMap.get(16));
        System.out.println(myHashMap.get(1));
        System.out.println(myHashMap.get(2));
        System.out.println(myHashMap.containsKey(44));
        System.out.println(myHashMap.size());
        System.out.println(myHashMap.isEmpty());
        System.out.println(myHashMap.remove(2));
        System.out.println(myHashMap.size());
        System.out.println(myHashMap.get(2));
        myHashMap.put(1, "Lion");
        System.out.println(myHashMap.get(1));
        System.out.println(myHashMap.get(16));
        System.out.println(myHashMap.remove(2));
        System.out.println(myHashMap.get(18));


    }
}
