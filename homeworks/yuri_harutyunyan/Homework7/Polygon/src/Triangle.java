import java.awt.*;

public class Triangle implements Polygon {
    int a,b;
    double c;
    Triangle(int a, int b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double perimetre(){
        return a+b+c;
    }
    public double square() {
        double p =(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
