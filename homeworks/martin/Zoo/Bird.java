public class Bird extends Animal {
	private String name;
	private String typeOfBird;

	Fish(double heightOfAnimal, int legs, String color, int id, String name, String typeOfBird) {
		super(heightOfAnimal, legs, color, id);
		this.name = name;
		this.typeOfBird = typeOfBird;
	}
}