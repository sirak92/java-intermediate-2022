class Triangle extends ShapesProperty {

	int first_side;
	int second_side;
	int third_side;

	Triangle(int first_side, int second_side, int third_side) {
		this.first_side = first_side;
		this.second_side = second_side;
		this.third_side = third_side;
	}

	@Override
	public void display ()
	{
		System.out.println("Calculating perimeter and area for a triangle");
	}

	@Override
	public double perimeter () {
		return first_side + second_side + third_side;
	}

	@Override
	public double area () {
		double s = (first_side + second_side + third_side) / 2;

        double triangleArea = Math.sqrt(s * (s - first_side) * (s - second_side) * (s - third_side));
        
        return triangleArea;
	}

}
