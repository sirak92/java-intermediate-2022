public abstract class Predator extends Mammal {
    private boolean hasFangs;
    private boolean hasWool;


    public Predator(boolean liveBirth, boolean warmBloodedness, boolean hasFangs, boolean hasWool) {
        super(liveBirth, warmBloodedness);
        this.hasFangs = hasFangs;
        this.hasWool = hasWool;
    }

    public boolean isHasFangs() {
        return hasFangs;
    }

    public void setHasFangs(boolean hasFangs) {
        this.hasFangs = hasFangs;
    }

    public boolean isHasWool() {
        return hasWool;
    }

    public void setHasWool(boolean hasWool) {
        this.hasWool = hasWool;
    }

    @Override
    public String printInfo() {
        return super.printInfo()+ "Predator{" +
                "hasFangs=" + this.hasFangs +
                ", hasWool=" + this.hasWool +
                '}';
    }


}
