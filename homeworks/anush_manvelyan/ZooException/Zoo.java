package tech42;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public List<Animal> animals = new ArrayList<Animal>();

    public void addAnimal(Animal animal) throws NoPlaceAddition {
        if(animals.size() < 15) {
            animals.add(animal);
        }
        else{
            throw new NoPlaceAddition("There is no free place for addition");
        }
    }

    public void removeAnimal(Animal animal) throws ZooIsEmpty {

        if(animals.size() > 0) {
            animals.remove(animal);
        }
        else if (animals.size() == 0) {
            throw new ZooIsEmpty("There is no animal for removing");
        }
    }

    public void removeAnimal(String animal, int id) throws ZooIsEmpty {

        if (animals.size() == 0) {
            throw new ZooIsEmpty("The zoo is already empty! Therefore you can't do any removing!");
        }

        else if(animals.size() > 0 && animals.size() > id) {

//            ????????????????????????????????????????????????????????????????????????????????????
            if (id == animals.indexOf(animal)) {
                animals.remove(id);
            }
            else {
                throw new ZooIsEmpty("There is no animal in the cage with the above name that has that ID");
            }
        }

        else if (animals.size() > 0 && animals.size() < id) {
            throw new ZooIsEmpty("There is no animal in this place!");
        }
    }

    public void print() {
        for (Animal arr: animals) {

            System.out.println("\n" + arr.animalType() + ": "  + arr.area() + arr.animalName() + "s");

            if (arr.animalType().equals("Mammal") )
            {
                Mammal arrM = new Mammal(arr);
                System.out.println(arrM.voice() + arrM.pawsFeet());
            }
        }
    }

}