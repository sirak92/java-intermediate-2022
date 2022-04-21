public abstract class Mammal implements Animal {
    private boolean liveBirth;
    private boolean warmBloodedness;
    private int age;

    public Mammal(boolean liveBirth, boolean warmBloodedness) {
        this.liveBirth = liveBirth;
        this.warmBloodedness = warmBloodedness;
    }


    public boolean isLiveBirth() {
        return liveBirth;
    }

    public void setLiveBirth(boolean liveBirth) {
        this.liveBirth = liveBirth;
    }

    public boolean isWarmBloodedness() {
        return warmBloodedness;
    }

    public void setWarmBloodedness(boolean warmBloodedness) {
        this.warmBloodedness = warmBloodedness;
    }

    public String printInfo(){


        return "Live birth " + this.liveBirth +'\n'+ "warmBloodedness "+ this.warmBloodedness;
    }


}