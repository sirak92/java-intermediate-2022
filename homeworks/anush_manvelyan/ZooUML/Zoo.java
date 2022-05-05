import java.util.ArrayList;
import java.util.List;

class Zoo {

	private List<Animal> animals = new ArrayList<Animal>();

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	public void removeAnimal(Animal animal) {
		animals.remove(animal);
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