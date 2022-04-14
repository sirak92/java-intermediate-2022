package am.tech42;

public class GeFigureDemo {

    public static void main(String[] args) {
      Rectangle r = new Rectangle(10,11);
      Circle c = new Circle(10);
        System.out.println("the per. of rect."+" "+r.perimeter());
        System.out.println("the area or rect."+" "+r.area());
        System.out.println("the per. of circ."+" "+c.perimeter());
        System.out.println("the area of circ."+" "+c.area());

    }
}
