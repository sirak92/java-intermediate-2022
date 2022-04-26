public class Main {
    public static void main(String[] args) {

		Mammal mammal1 = new Mammal ("Cow");
		Mammal mammal2 = new Mammal ("Cat");
		Mammal mammal3 = new Mammal ("Lion");

		Reptile reptile1 = new Reptile("Crocodile", "water");
		Reptile reptile2 = new Reptile("Turtle", "overland");

		Fish fish1 = new Fish("White shark", "Crotch");
		Fish fish2 = new Fish("Beluga", "Bone");

		Zoo zoo = new Zoo();

		zoo.addAnimal(mammal1);
		zoo.addAnimal(reptile1);
		zoo.addAnimal(fish1);
		zoo.addAnimal(mammal2);
		zoo.addAnimal(reptile2);
		zoo.addAnimal(fish2);
		zoo.addAnimal(mammal3);

		zoo.print();

		System.out.println("\n\n");

		zoo.removeAnimal(reptile1);
		zoo.removeAnimal(fish1);
		zoo.removeAnimal(mammal3);

		zoo.print();

       	ZooKeeper employee1 = new ZooKeeper("Tom");
       	System.out.println("\nYou can have " + employee1.count() + " zoo keepers and gave them " + employee1.salary() + "!");
        System.out.print("One of them is " + employee1.getName());
	}
}
