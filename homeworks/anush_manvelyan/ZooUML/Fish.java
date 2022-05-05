class Fish extends Animal {

	private String fishName;
	private String fishType;
	private String animalType = "Fish";

	Fish (String fishName, String fishType) {
		super(fishName);
		this.fishName = fishName;
		this.fishType = fishType;
	}

	Fish(Animal name) {
        super(name.animalName());
    }

	@Override
	public String animalName() {
		return fishName;
	}

	@Override
	public String animalType() {
		return animalType;
	}

	@Override
	public String area() {
		return "You need to have an aquarium area for your " + fishType + " types especially for ";
	}
}