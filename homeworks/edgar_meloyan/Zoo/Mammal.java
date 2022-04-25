public abstract class Mammal implements Animal {
    private final boolean liveBirth;
    private final boolean warmBlooded;

    public Mammal() {
        this.liveBirth = true;
        this.warmBlooded = true;
    }


    public boolean isLiveBirth() {
        return liveBirth;
    }


    public boolean isWarmBlooded() {
        return warmBlooded;
    }


}