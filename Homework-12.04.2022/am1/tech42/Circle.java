package am1.tech42;

public class Circle implements Figure {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double perimeter() {
        return  2 * 3.14 * getRadius();
    }
    @Override
    public double area() {
        return 3.14 * Math.pow(getRadius(), 2);
    }
}
