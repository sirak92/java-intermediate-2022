package com.company;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo(5);
        try {
            zoo.addAnimal(new Eagle(1, "eagle", "bald", 32));
        } catch (NoFreeCagesException e) {
            e.printStackTrace();
        }
        try {
            zoo.addAnimal(new Tiger(6, "tiger", "siberian", 14));
        } catch (NoFreeCagesException e) {
            e.printStackTrace();
        }

        try {
            zoo.addAnimal(new Varan(16, "lizard", "varan", 21));
        } catch (NoFreeCagesException e) {
            e.printStackTrace();
        }
        try {
            zoo.removeAnimal(6);
        } catch (CagesAreEmptyException e) {
            System.out.println(e);
        }
        try {
            System.out.println(zoo.getAnimal(1));
        } catch (AnimalsNotFoudException e) {
            e.printStackTrace();
        }

    }
}

