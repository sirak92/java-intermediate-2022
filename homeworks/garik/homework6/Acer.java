package computer;

public class Acer extends Computer{
    public Acer(String model, String operathingSystem, int volume, int ram) {
        super(model, operathingSystem, volume, ram);
    }

    @Override
    public String toString() {
        return "Acer"+'{'+super.toString()+'}';
    }
}
