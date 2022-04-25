public abstract class Predator extends Mammal {
    private final boolean hasFangs;
    private final boolean hasWool;


    public Predator() {
        super();
        this.hasFangs = true;
        this.hasWool = true;
    }

    public boolean isHasFangs() {
        return hasFangs;
    }


    public boolean isHasWool() {
        return hasWool;
    }


}
