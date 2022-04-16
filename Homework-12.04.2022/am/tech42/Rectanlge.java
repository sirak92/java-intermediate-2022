package am.tech42;

class Rectangle extends GeFigure {
    Rectangle(double height, double width){
    super(height, width);
    }

  @Override
    public double perimeter() {
        return  2 * getHeight() + 2 * getWidth();
    }
  @Override
    public double area() {
        return getWidth() * getHeight();
    }
}
