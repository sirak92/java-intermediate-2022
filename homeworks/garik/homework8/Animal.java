package zoo;

public class Animal {
    private boolean mammal;
    private int age;
    private int quanity;
    private int price;

    public Animal(boolean mammal, int age, int quanity, int price) {
        this.mammal = mammal;
        this.age = age;
        this.quanity = quanity;
        this.price = price;
    }

    public Animal() {
        this.mammal = mammal;
        this.age = age;
        this.quanity = quanity;
        this.price = price;
    }

    public boolean isMammal() {
        return mammal;
    }

    public void setMammal(boolean mammal) {
        this.mammal = mammal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

