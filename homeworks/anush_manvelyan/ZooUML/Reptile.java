class Reptile extends Animal {

	private String reptileName;
	private String reptileType;
	private String animalType = "Reptile";

	Reptile(String reptileName, String reptileType) {

		super(reptileName);
		this.reptileName = reptileName;
		this.reptileType = reptileType;
	}

	@Override
	public String animalName() {
		return reptileName;
	}

	@Override
	public String animalType() {
		return animalType;
	}

	@Override
	public String area() {
		if (reptileType.equals("water")) {
			return "You must have a water area for your ";
		}
		else if (reptileType.equals("overland")) {
			return "You must have a cage for your ";
		}
		return "";
	}

}