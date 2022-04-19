public class Feline extends Predator{

    private String kind;
    private int age;

    public Feline(boolean liveBirth, boolean warmBloodedness, boolean hasFangs, boolean hasWool, String kind, int age) {
        super(liveBirth, warmBloodedness, hasFangs, hasWool);
        this.kind = kind;
        this.age = age;
    }



    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("All animals eat");
    }

    @Override
    public void move() {
        System.out.println(this.kind+ " in this zoo move on their paws");
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String printInfo() {
        return super.printInfo()+ " kind" + this.kind+ " age "+this.age;
    }
}
