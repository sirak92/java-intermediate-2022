package am1.tech42;

  class Rectangle implements Figure {
    private double height;
    private double width;
    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
       this.width= width;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return  width;
    }
    @Override
    public double perimeter() {
        return 2 * getHeight() + 2 * getWidth();
    }
    @Override
    public double area() {
        return getHeight() * getWidth();
    }
}
