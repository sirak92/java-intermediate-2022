import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>(50);

    private int budget = 1500;

    Zoo() {
    	
    }


    public void addAnimal(Animal a) {
        a.getPrice();
    }

    public void add(Animal animal) {
        animals.add(animal);


    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void removeAnimal(Animal animal) {

        if (animals.isEmpty()) {

            System.out.println("Zoo is empty");
        } else {
            animals.remove(animal);
        }

    }


}
