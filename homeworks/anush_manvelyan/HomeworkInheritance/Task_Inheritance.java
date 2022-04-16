public class Task_Inheritance {
	public static void main(String[] args) {

		Asus comp1 = new Asus(2021, 16, 512);
		comp1.showInfo();
		comp1.showModelInfo();
		comp1.rating();

		Acer comp2 = new Acer(2021, 16, 512);
		comp2.showInfo();
		comp2.showModelInfo();
		comp2.rating();
	}
}



