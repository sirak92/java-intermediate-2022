import java.util.Scanner;

public class TriangleDemo{
    public static void main(String [] args) {
        double x1, x2, x3, y1, y2, y3;


        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first point's coordinates");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        System.out.println("enter the second point's coordinates");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        System.out.println("enter the third point's coordinates");
        x3 = scan.nextDouble();
        y3 = scan.nextDouble();
        double ab = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double bc = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        double ca = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        Triangle t = new Triangle();
        System.out.println("the perimeter is"+" "+t.perimeter(ab, bc, ca));
        System.out.println("the area is"+" "+t.area(ab, bc, ca));

    }
 }
class Triangle{
    double perimeter(double a, double b, double c){

       return a + b + c;
     }

    double area(double a, double b, double c){

      return Math.sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * (( a + b + c) / 2 - c));
    }



}
