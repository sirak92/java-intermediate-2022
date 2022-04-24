package com.company;

import java.util.ArrayList;

public class Zoo {
    private int capacity;

    Zoo(int capacity) {
        this.capacity = capacity;
    }

    ArrayList<Animal> animals = new ArrayList<>();


    public void addAnimal(Animal animal) throws NoFreeCagesException {
        if (animals.size() >= capacity) {
            throw new NoFreeCagesException();
        }
        animals.add(animal);

        System.out.println(animals.size());
    }


    public String getAnimal(int index) {
        if (animals.size() - 1 < index) {
            throw new AnimalsNotFoudException();
        }
        return animals.get(index).toString();
    }

    public void removeAnimal(int index) throws CagesAreEmptyException {
        if (animals.size() - 1 < index) {
            throw new CagesAreEmptyException("cages are empty...");
        }
        animals.remove(index);
    }
}
