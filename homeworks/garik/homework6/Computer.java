package computer;

public class Computer {
    private String model;
    private String operathingSystem;
    private int volume;
    private int ram;
    public Computer(String model,String operathingSystem, int volume, int ram) {
        this.model=model;
        this.operathingSystem=operathingSystem;
        this.volume=volume;
        this.ram=ram;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperathingSystem() {
        return operathingSystem;
    }

    public void setOperathingSystem(String operathingSystem) {
        this.operathingSystem = operathingSystem;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", operathingSystem='" + operathingSystem + '\'' +
                ", volume=" + volume +
                ", ram=" + ram;
    }
}
