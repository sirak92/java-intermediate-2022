import java.util.Scanner;

public class AreaAndPerimeterCalculating {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter rectangle data to calculate the area and perimeter: ");
        double w = console.nextDouble();
        double h = console.nextDouble();
        System.out.print("Enter triangle data to calculate the area and perimeter: ");
        double ab = console.nextDouble();
        double bc = console.nextDouble();
        double cd = console.nextDouble();
        System.out.print("Enter triangle data to calculate the area and perimeter: ");
        double r = console.nextDouble();
        Figure[] figure = {new Rectangle(w, h), new Triangle(ab, bc, cd), new Circle(r)};

        for(Figure fig: figure) {
            System.out.print("Area = " + fig.area() + "Perimeter = " + fig.perimeter());
        }
    }
}