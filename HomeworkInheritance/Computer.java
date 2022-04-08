public class Computer {
	private String brand;
	private String originCountry;
	private String popularModel;

	Computer(String brand, String originCountry, String popularModel) {
		this.brand = brand;
		this.originCountry = originCountry;
		this.popularModel = popularModel;
	}

	void showInfo() {
		System.out.println("\n Brand: " + brand);
		System.out.println(" Origin country: " + originCountry);
		System.out.println(" Popular model: " + popularModel);
	}

	protected int productionYear;
	protected int ram;
	protected int memory;

	void showModelInfo() {
		System.out.println(" Production year: " + productionYear);
		System.out.println(" RAM: " + ram);
		System.out.println(" Memory: " + memory);
	}
}