package com.company;

public abstract class Bird extends Animal {

    private int birdCageNumber;

    Bird(int idNumber, String type, String subtype, int birdCageNumber) {
        super(idNumber, type, subtype);
        this.birdCageNumber = birdCageNumber;
    }

    public void setBirdCageNumber(int birdCageNumber) {
        this.birdCageNumber = birdCageNumber;
    }

    public int getBirdCageNumber() {
        return birdCageNumber;
    }

    @Override
    public String toString() {
        return this.getIdNumber() + " " + this.getType() + " " + this.getSubtype() + " " + this.birdCageNumber;
    }


}
