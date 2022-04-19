public abstract class Animal implements Zoo {
	private int quantityOfAnimals = 0;
	private double heightOfAnimal;
	private int legs;
	private String color;
	private final int id;

	Animal(double heightOfAnimal, int legs, String color, int id) {
		quantityOfAnimals++;
		this.heightOfAnimal = heightOfAnimal;
		this.legs = legs;
		this.color = color;
		this.id = id;
	}

	public boolean isCageForAnimal(Cage cage) {
		if(cage.getHeightOfCage() > this.heightOfAnimal) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void removeAnimal() {
		quantityOfAnimals--;
	}

	@Override
	public void	printQuantityOfAnimals() {
		System.out.println(quantityOfAnimals);
	}
}