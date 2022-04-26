package com.company;

public class Hen extends Bird implements Herbivore, Pet {
    Hen(int idNumber, String type, String subtype, int birdCageNumber) {
        super(idNumber, type, subtype, birdCageNumber);
    }

    @Override
    public void grassEater() {
        System.out.println("they don't eat meat");
    }

    @Override
    public void pet() {
        System.out.println("they also live  with people");
    }
}
