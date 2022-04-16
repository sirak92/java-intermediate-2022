public class Asus extends Computer {

	Asus(int productionYear, int ram, int memory) {

		super("Asus", "Taipei City/Taiwan", "Asus ROG Zephyrus G15");

		{
			System.out.print("\n\tAbout Asus:");
		}

		this.productionYear = productionYear;
		this.ram = ram;
		this.memory = memory;
	}

	void rating() {
		System.out.println(" Asus is the world's 5th-largest PC vendor by unit sales.");
	}
}
