public class Triangle extends Figure {
    double ab;
    double bc;
    double cd;

    public Triangle(double ab, double bc, double cd) {
        this.ab = ab;
        this.bc = bc;
        this.cd = cd;
    }

    @Override
    public double perimeter() {
        return ab + bc + cd;
    }

    @Override
    public double area() {
        double p = (ab + bc + cd) / 2; //Half perimeter
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - cd));
    }

    public void setAB(double ab) {
        this.ab = ab;
    }

    public double getAB() {
        return ab;
    }

    public void setBC(double bc) {
        this.bc = bc;
    }

    public double getBC() {
        return bc;
    }

    public void setCD(double cd) {
        this.cd = cd;
    }

    public double getCD() {
        return cd;
    }
}