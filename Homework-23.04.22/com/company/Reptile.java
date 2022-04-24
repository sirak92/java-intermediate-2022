package com.company;

public class Reptile extends Animal {
    private int aquariumNumber;

    Reptile(int idNumber, String type, String subtype, int aquariumNumber) {
        super(idNumber, type, subtype);
        this.aquariumNumber = aquariumNumber;
    }

    public void setAquariumNumber(int aquariumNumber) {
        this.aquariumNumber = aquariumNumber;
    }

    public int getAquariumNumber() {
        return aquariumNumber;
    }

    @Override
    public String toString() {
        return getIdNumber() + " " + getType() + " " + getSubtype() + " " + getAquariumNumber();
    }
}
