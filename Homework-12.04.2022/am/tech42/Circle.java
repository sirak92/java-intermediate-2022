package am.tech42;

public class Circle extends GeFigure {
    Circle(double radius) {
        super(radius);
    }

  @Override
    public double perimeter() {
        return 2 * 3.14 * getRadius();
    }

  @Override
    public double area() {
        return  3.14 * Math.pow(getRadius(), 2);
    }
}
