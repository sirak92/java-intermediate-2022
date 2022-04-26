package com.company;

public class Eagle extends Bird implements Predator, WildAnimal {

    Eagle(int idNumber, String type, String subtype, int birdCageNumber) {
        super(idNumber, type, subtype, birdCageNumber);
    }

    @Override
    public void meatEater() {
        System.out.println("they eat meat");
    }

    @Override
    public void wilds() {
        System.out.println("they live in wild");
    }
}
