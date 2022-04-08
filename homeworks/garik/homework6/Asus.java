package computer;

public class Asus extends Computer {
    private boolean tuchId;
    private boolean tuchscreen;

    public Asus(String model, String operathingSystem, int volume, int ram, boolean tuchId, boolean tuchscreen) {
        super(model, operathingSystem, volume, ram);
        this.tuchId = tuchId;
        this.tuchscreen = tuchscreen;

    }

    public boolean isTuchId() {
        return tuchId;
    }

    public void setTuchId(boolean tuchId) {
        this.tuchId = tuchId;
    }

    public boolean isTuchscreen() {
        return tuchscreen;
    }

    public void setTuchscreen(boolean tuchscreen) {
        this.tuchscreen = tuchscreen;
    }

    @Override
    public String toString() {
        return "Asus{" +
                super.toString()+
                ", tuchId=" + tuchId +
                ", tuchscreen=" + tuchscreen +
                '}';
    }
}

