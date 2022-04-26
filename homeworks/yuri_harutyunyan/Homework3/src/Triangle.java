{public class Triangle {
    double firstside;
    double secondside;
    double thirdside;

    public static void main(String[] args) {
        Triangle realTriangle = new Triangle();

        realTriangle.sides(0,1,0,0,1,0);
        realTriangle.perimetr();
        realTriangle.area();
    }





    private int square(int a) {
        return a * a;
    }

    public void perimetr() {;
        double perimetr = firstside + secondside + thirdside;
        System.out.println(perimetr);
    }

    public void sides(int x1, int y1, int x2, int y2, int x3, int y3) {
        firstside = Math.sqrt(square(x1 - x2) + square(y1 - y2));
        secondside = Math.sqrt(square(x2 - x3) + square(y2 - y3));
        thirdside = Math.sqrt(square(x1 - x3) + square(y1 - y3));
    }

    public void area() {
        double semiPerimeter = (firstside + secondside + thirdside) / 2;
        double square = Math.sqrt(semiPerimeter * (semiPerimeter - firstside) * (semiPerimeter - secondside) * (semiPerimeter - thirdside));
        System.out.println(square);
    }

}

}
