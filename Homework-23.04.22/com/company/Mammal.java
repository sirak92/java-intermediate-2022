package com.company;

public abstract class Mammal extends Animal {
    private int cageNumber;

    Mammal(int idNumber, String type, String subtype, int cageNumber) {
        super(idNumber, type, subtype);
        this.cageNumber = cageNumber;
    }

    public void setCageNumber(int cageNumber) {
        this.cageNumber = cageNumber;
    }

    public int getCageNumber() {
        return cageNumber;
    }

    @Override
    public String toString() {
        return getIdNumber() + " " + getType() + " " + getSubtype() + " " + getCageNumber();
    }
}
