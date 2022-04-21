public class Cage {
	private double length;
	private double width;
	private double heightOfCage;

	Cage (double length, double width, double heightOfCage) {
		this.length = length;
		this.width = width;
		this.heightOfCage = heightOfCage;
	}

	public double getHeightOfCage() {
		return heightOfCage;
	}

	public void openCage() {
		System.out.println("Cage was opened");
	}

	public void closeCage() {
		System.out.println("Cage was closed");
	}

	public double volumeOfCage() {
		return length * width * heightOfCage;
	}
}