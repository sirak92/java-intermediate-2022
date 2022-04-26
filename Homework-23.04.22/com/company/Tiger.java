package com.company;

public class Tiger extends Mammal implements Predator, WildAnimal {

    Tiger(int idNumber, String type, String subtype, int cageNumber) {
        super(idNumber, type, subtype, cageNumber);
    }

    @Override
    public void meatEater() {
        System.out.println("Tigers are very dangerous");
    }

    @Override
    public void wilds() {
        System.out.println("they lives in Asia");
    }
}
