abstract class Animal {

	String animalName;

	Animal(String animalName) {
		this.animalName = animalName;
	}

	abstract public String animalType();

	abstract public String animalName();

	public String area() {
		return "You must have an area for your animals";
	}
}