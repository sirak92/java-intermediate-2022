package com.company;

public class Animal {

    private int idNumber;
    private String type;
    private String subtype;

    Animal(int idNumber, String type, String subtype) {
        this.idNumber = idNumber;
        this.type = type;
        this.subtype = subtype;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getType() {
        return type;
    }

    public String getSubtype() {
        return subtype;
    }

    @Override
    public String toString() {
        return this.idNumber + " " + this.type + " " + this.subtype;
    }

}

