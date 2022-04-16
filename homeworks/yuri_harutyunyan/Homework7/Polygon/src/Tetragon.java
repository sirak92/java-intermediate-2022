public class Tetragon implements Polygon{
    double a,b;
    public Tetragon(double a,double b){
        this.a=a;
        this.b=b;
    }
    public double perimetre() {
        return 2*(a+b);
    }


    public double square() {
        return a*b;
    }
}
