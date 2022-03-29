import java.util.Scanner;

public class TriangleDemo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Enter AB coordinates: ");
        double x1 = console.nextDouble();
        double y1 = console.nextDouble();
        
        System.out.println("Enter BC coordinates: ");
        double x2 = console.nextDouble();
        double y2 = console.nextDouble();
        
        System.out.println("Enter CA coordinates: ");
        double x3 = console.nextDouble();
        double y3 = console.nextDouble();
        
        Triangle obj1 = new Triangle(x1, y1, x2, y2, x3, y3);
        System.out.println(Triangle.areOfTriangle());
        System.out.println(Triangle.perimeterOfTriangle());
    }
}

class Triangle {
    static Point point1;
    static Point point2;
    static Point point3;

    Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
        point3 = new Point(x3, y3);
    }

    static double firstLineLength(Point point1, Point point2) {
        return Math.sqrt((point2.x - point1.x) * (point2.x - point1.x) + ((point2.y - point1.y) * (point2.y - point1.y)));
    }

    static double secondLineLength(Point point3, Point point2) {
        return Math.sqrt((point3.x - point2.x) * (point3.x - point2.x) + ((point3.y - point2.y) * (point3.y - point2.y)));
    }

    static double thirdLineLength(Point point1, Point point3) {
        return Math.sqrt((point3.x - point1.x) * (point3.x - point1.x) + ((point3.y - point1.y) * (point3.y - point1.y)));
    }

    static double perimeterOfTriangle() {
        return firstLineLength(point1, point2) + secondLineLength(point2, point3) + thirdLineLength(point1, point3);
    }

    static double halfPer() {
        return perimeterOfTriangle() / 2.0;
    }

    static double areOfTriangle() {
        return Math.sqrt(halfPer() * (halfPer() - firstLineLength(point1, point2)) * (halfPer()
                - secondLineLength(point2, point3)) * halfPer() - thirdLineLength(point1, point3));
    }
}

class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}