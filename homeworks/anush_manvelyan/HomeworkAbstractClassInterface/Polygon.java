class Polygon extends ShapesProperty {

	int number_sides;
	int side_length;

	Polygon(int number_sides, int side_length) {
		this.number_sides = number_sides;
		this.side_length = side_length;
	}

	@Override
	public void display ()
	{
		System.out.println("\nCalculating perimeter and area for a polygon");
	}

	@Override
	public double area() {
		return number_sides * (side_length *side_length) * (Math.cos(3.14/number_sides) / Math.sin(3.14/number_sides)) / 4;
	}

	@Override
	public double perimeter() {
		return number_sides * side_length;
	}

}
