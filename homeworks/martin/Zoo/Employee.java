public class Employee implements EmployeeActions {
	private String name;
	private int age;
	private int workingExperienceInYears;

	Employee(String name, int age, int workingExperienceInYears) {
		this.name = name;
		this.age = age;
		this.workingExperienceInYears = workingExperienceInYears;
	}

	@Override
	public void cleanCase(Cage cage) {
		System.out.printls(cage + " was cleaned");
	}

	@Override
	public void feedAnimals(Animal animal) {
		System.out.println(animal + " was fed");
	}

	@Override
	public void changeWater() {
		System.out.println("Water was changed");
	}
}

interface EmployeeActions {
	public void cleanCase();
	public void feedAnimals();
	public void changeWater();
}