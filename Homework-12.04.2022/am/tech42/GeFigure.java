package am.tech42;

public abstract class GeFigure {
    private double height;
    private double width;
    GeFigure(double height, double width){
       this.height = height;
       this.width = width;
    }

    private  double radius;
    GeFigure(double radius){
       this.radius = radius;
    }

    abstract double perimeter();
    abstract double area();


    public double getHeight(){
       return height;
     }
    public double getWidth(){
       return width;
     }
    public double getRadius(){
       return radius;
     }
}
