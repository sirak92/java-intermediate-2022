package com.company;

public class Main {

    public static void main(String[] args) {
        Queue<String> stringQueue = new Queue<>();
        stringQueue.add("abc");
        stringQueue.add("def");
        System.out.println(stringQueue.get());
        stringQueue.add("ghi");
        System.out.println(stringQueue.get());
        System.out.println(stringQueue.get());
    }
}






