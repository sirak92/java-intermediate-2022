package com.company;

public class Shark extends Fish implements Predator {
    protected String oceanFish;

    public Shark(String name, int size, String color, String oceanFish) {
        super(name, size, color);
        this.oceanFish = oceanFish;
    }

    public void meatEater() {
        System.out.println("One of the most dangerous fishes in the world");
    }

}
