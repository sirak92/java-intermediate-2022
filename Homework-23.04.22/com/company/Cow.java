package com.company;

public class Cow extends Mammal implements Herbivore, Pet {

    Cow(int idNumber, String type, String subtype, int cageNumber) {
        super(idNumber, type, subtype, cageNumber);

    }

    @Override
    public void grassEater() {
        System.out.println("they eat grass");

    }

    @Override
    public void pet() {
        System.out.println("It's all about milk and meat");
    }
}
