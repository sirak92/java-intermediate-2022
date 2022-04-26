package com.company;

public class Varan extends Reptile implements Predator, WildAnimal {

    Varan(int idNumber, String type, String subtype, int aquariumNumber) {
        super(idNumber, type, subtype, aquariumNumber);
    }

    @Override
    public void meatEater() {
        System.out.println("hunt in group");
    }

    @Override
    public void wilds() {
        System.out.println("dangerous reptiles");
    }
}
