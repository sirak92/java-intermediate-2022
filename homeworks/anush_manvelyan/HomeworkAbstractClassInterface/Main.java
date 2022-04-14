public class Main {
	public static void main (String[] args) {

		Triangle triangle = new Triangle (2, 3, 4);
		triangle.display();
		System.out.println(triangle.perimeter());
		System.out.println(triangle.area() + "\n");

		Polygon polygon = new Polygon (5, 4);
		polygon.display();
		System.out.println(polygon.perimeter());
		System.out.println(polygon.area() + "\n");

		Cylinder cylinder = new Cylinder (3, 9);
		cylinder.display();
		cylinder.message();
		System.out.println(cylinder.area());
		System.out.println(cylinder.perimeter());
		System.out.println(cylinder.volume() + "\n");

	}
}

 
