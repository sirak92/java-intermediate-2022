class Cylinder extends ShapesProperty implements ShapesPropertyFor3D {

	int r;
	int h;

	Cylinder (int r, int h) {
		this.r = r;
		this.h = h;
	}

	@Override
	public double perimeter() {
		return 2 * 3.14 * r;
	}

	@Override
	public double area() {
		return (2 * 3.14 *r *(h + r));
	}

	@Override
	public double volume () {
		return 3.14 * (r * r) * h;
	}

	@Override
	public void display() {
		System.out.println("Calculating perimeter and area for a cylinder");
	}

}
