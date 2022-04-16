package am1.tech42;

public class FigureDemo {
  public static void main(String[] args) {
   Rectangle r = new Rectangle(10, 20);
   r.setHeight(5);
   r.setWidth(4);
        System.out.println("the rectangle perimeter is"+" "+r.perimeter());
        System.out.println("the rectangle area is"+" "+r.area());
   Circle c = new Circle(10);
   c.setRadius(5);
        System.out.println("the circle perimeter is"+" "+c.perimeter());
        System.out.println("teh circle area is"+" "+c.area());

    }
}
