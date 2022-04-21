public class Canine extends Predator{
    private String kind;
    private int age;
    private int price;


    public Canine(boolean liveBirth, boolean warmBloodedness, boolean hasFangs, boolean hasWool, String kind, int age) {
        super(liveBirth, warmBloodedness, hasFangs, hasWool);
        this.kind = kind;
        this.age = age;
    }





    public String getKind() {
        return kind;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void eat() {
        System.out.println("All animals eat");
    }

    @Override
    public void move() {
        System.out.println("Animals in this zoo move on their paws");
    }

    @Override
    public int getPrice( ) {

        if (getAge()>=12){
            this.price = 500;
        }

        return this.price;
    }

    @Override
    public String printInfo() {
        return super.printInfo()+ " kind" + this.kind+ " age "+this.age;
    }
}
