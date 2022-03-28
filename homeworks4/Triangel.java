/**
 * Cordinates of the points
 */
class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Triangel {
    Point point1 = new Point(10, 20);
    Point point2 = new Point(15, 85);
    Point point3 = new Point(-18, 41);
    /**
     * Calculate the lenght of the first section
     * @param point1 cordinates of the first point
     * @param point2 cordinates of the second point
     * @return lenght of the first section
     */
    double lenghtOfFirstSection(Point point1, Point point2) {
        double firstSection = Math.sqrt((point2.x - point1.x) * (point2.x - point1.x) + ((point2.y - point1.y) * (point2.y - point1.y)));
        return firstSection;
    }
    /**
     * Calculate the lenght of the second section
     * @param point3 cordinates of the third point
     * @param point2 cordinates of the second point
     * @return lenght of the second section
     */
    double lenghtOfSecondSection(Point point3, Point point2) {
        double secondSection = Math.sqrt((point3.x - point2.x) * (point3.x - point2.x) + ((point3.y - point2.y) * (point3.y - point2.y)));
        return secondSection;
    }
    /**
     * Calculate the lenght of the third section
     * @param point1 cordinates of the first point
     * @param point3 cordinates of the third point
     * @return lenght of the third section
     */
    double lenghtOfThirdSection(Point point1, Point point3) {
        double thirdSection = Math.sqrt((point3.x - point1.x) * (point3.x - point1.x) + ((point3.y - point1.y) * (point3.y - point1.y)));
        return thirdSection;
    }
    /**
     * Calculate the perimeter
     * @return perimeter of the triangel
     */
    double perimeter() {
        double perimeterOfTriangel = lenghtOfThirdSection(point1, point3) + lenghtOfSecondSection(point2, point3) + lenghtOfFirstSection(point1, point2);
        return perimeterOfTriangel;
    }
    double area() {
        double areaOfTriangel = Math.sqrt(perimeter() / 2 * (perimeter() / 2 - lenghtOfFirstSection(point1, point2)) * (perimeter() / 2 - lenghtOfThirdSection(point1, point3)) * (perimeter() / 2 - lenghtOfSecondSection(point2, point3)));
        return areaOfTriangel;
    }
    public static void main(String[] args) {
        Triangel triangel = new Triangel();
        System.out.println(triangel.perimeter());
        System.out.println(triangel.area());
    }
}



