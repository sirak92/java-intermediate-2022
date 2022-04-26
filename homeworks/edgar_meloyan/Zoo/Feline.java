public class Feline extends Predator {

    private String kind;
    private int age;

    public Feline(String kind, int age) {
        super();
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
    public void move() {
        System.out.println(this.kind + " moves on its paws more carefully" + '\n');
    }

    @Override
    public int getPrice() {
        int price = 0;
        if (getAge() <= 5) {
            price = 1500;
        } else if (getAge() > 5 && getAge() <= 10) {
            price = 1000;
        } else if (getAge() > 10) {
            price = 500;
        }
        return price;
    }

    @Override
    public String printInfo() {
        return "You added " + this.kind + ':' + '\n' + "Age " + this.age + '\n' + "Is a live birth animal - "
                + this.isLiveBirth() + '\n' + "Is a worm blooded animal - " + this.isWarmBlooded() + '\n' +
                "Has a fangs - " + this.isHasFangs() + '\n' + "Has a wool - " + this.isHasWool() + '\n';
    }
}
