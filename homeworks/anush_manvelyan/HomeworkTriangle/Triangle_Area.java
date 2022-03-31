import java.util.Scanner;

public class Triangle_Area{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int x, y, z;

        do{
            System.out.print("\n\nEnter the first side of the triangle: ");
            x = input.nextInt();

            System.out.print("\nEnter the second side of the triangle: ");
            y = input.nextInt();

            System.out.print("\nEnter the third side of the triangle: ");
            z = input.nextInt();

        }while ((x + y <= z) || (x + z <= y) || (y + z <= x));

        Triangle triangle = new Triangle(x, y, z);
        System.out.print("\n\nThe area of your triangle is equal to: ");
        System.out.println(Triangle.area(x, y, z));
    }
}

class Triangle{

    private int first_side, second_side, third_side;

    Triangle(int first_side, int second_side, int third_side){
        this.first_side = first_side;
        this.second_side = second_side;
        this.third_side = third_side;
    }

    static double area(int first_side, int second_side, int third_side){
        
        double s = (first_side + second_side + third_side) / 2;

        double triangleArea = Math.sqrt(s * (s - first_side) * (s - second_side) * (s - third_side));
        
        return triangleArea;
    }
}
