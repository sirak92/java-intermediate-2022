public class TestZoo {
    public static void main(String[] args) throws TheZooIsFullException, TheZooIsEmptyException {
        Zoo zoo = new Zoo();
        Animal wolf = new Canine("Wolf", 2);
        Animal lion = new Feline("Lion", 4);
        Animal fox = new Canine("Fox", 7);
        Animal coyote = new Canine("Coyote", 5);
        Animal tiger = new Canine("Tiger", 12);
        Animal cheetah = new Feline("Cheetah", 6);
        Animal cat = new Feline("Cat", 5);
        System.out.println("After adding animals: " + '\n');
        zoo.addAnimal(wolf);
        zoo.addAnimal(lion);
        zoo.addAnimal(fox);
        zoo.addAnimal(coyote);
        zoo.addAnimal(tiger);
        zoo.addAnimal(cheetah);
        zoo.getAnimals().forEach(animal -> {

            System.out.println(animal.printInfo() + "Price " + animal.getPrice() + '\n');
            animal.move();
        });
    }
}

