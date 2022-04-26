package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    private ArrayList<Worker> workers = new ArrayList<Worker>();
    private ArrayList<Animal> animals = new ArrayList<Animal>();
    private final int cages;
    private final String zooName;

    public Zoo() {
        this.cages = 100;
        this.zooName = "Zoo";
    }

    public Zoo(String zooName, int cages) {
        this.cages = cages;
        this.zooName = zooName;
    }

    public int getCages() {
        return cages;
    }

    public String getZooName() {
        return zooName;
    }

    public void addAnimal(Animal animal) {
        if (animals.size() < cages) {
            animals.add(animal);
        }
    }

    public void addAnimals(Animal... newAnimals) {
        animals.addAll(Arrays.asList(newAnimals));
    }

    public String getAnimalData(Animal animal) {
        return animal.toString();
    }

    public String getAnimalDataById(int id) {
        for (Animal animal : animals) {
            if (animal.getId() == id) {
                return animal.toString();
            }
        }
        System.out.println("Couldn't find animal with this ID");
        return null;
    }

    public void removeAnimal(Animal animal) {
        if (animals.contains(animal)) {
            animals.remove(animal);
        }
    }

    public void removeAnimalById(int id) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getId() == id) {
                animals.remove(i);
                return;
            }
        }
        System.out.println("Couldn't find animal with this ID");
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void showAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }

    public int getAnimalsCount() {
        return animals.size();
    }

    public ArrayList<Mammal> getMammals() {
        ArrayList<Mammal> mammals = new ArrayList<Mammal>();
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getClass().equals(Mammal.class)) {
                mammals.add((Mammal) animals.get(i));
            }
        }
        return mammals;
    }

    public ArrayList<Reptile> getReptile() {
        ArrayList<Reptile> reptiles = new ArrayList<Reptile>();
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getClass().equals(Reptile.class)) {
                reptiles.add((Reptile) animals.get(i));
            }
        }
        return reptiles;
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void removeWorker(Worker worker) {
        if (workers.contains(worker)) {
            workers.remove(worker);
        }
    }

    public void removeWorkerById(String id) {
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).getId().equals(id)) {
                workers.remove(i);
            }
        }
    }
}
