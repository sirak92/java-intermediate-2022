import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    private final ArrayList<Animal> animals = new ArrayList<>();
    private int zooCapacity = 20;
    private final int budget = 20000;

    private int priceOfAllAnimals() {
        int x = 0;
        for (Animal an : animals) {
            x += an.getPrice();
        }
        return x;

    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) throws TheZooIsFullException, TheZooIsEmptyException {
        if (animals.size() <= zooCapacity) {
            animals.add(animal);
        } else {
            throw new TheZooIsFullException("Error! You cannot add animals to the zoo. It's filled");
        }

        stopAddingAnimalsDueToOverBudget();

    }


    private void stopAddingAnimalsDueToOverBudget() throws TheZooIsEmptyException {
        try {
            if (priceOfAllAnimals() >= budget) {
                throw new BudgetIsOverException("Budget is Over");
            }
        } catch (BudgetIsOverException e) {
            removeAnimal(animals.size() - 1);
            System.out.println(e.getMessage());
        }
    }

    private void removeAnimal(int animal) throws TheZooIsEmptyException {

        if (animals.isEmpty()) {
            throw new TheZooIsEmptyException("Error! The Zoo is empty");
        } else {
            animals.remove(animal);
        }
    }

    public void removeAnimal(Animal animal) throws TheZooIsEmptyException {

        if (animals.isEmpty()) {
            throw new TheZooIsEmptyException("Error! The Zoo is empty");
        } else {
            animals.remove(animal);
        }
    }
}
