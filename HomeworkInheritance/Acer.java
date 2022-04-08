public class Acer extends Computer {

	Acer(int productionYear, int ram, int memory) {

		super("Acer", "Hsinchu/Taiwan", "Acer Predator Triton 500 SE");	

		this.productionYear = productionYear;
		this.ram = ram;
		this.memory = memory;

		{
			System.out.print("\n\tAbout Acer:");
		}
	}

	void rating() {
		System.out.println(" Acer is the world's 6th-largest PC vendor by unit sales.");
	}	
}