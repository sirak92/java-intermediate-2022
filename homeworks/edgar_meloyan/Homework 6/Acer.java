public class Acer extends Computers {
    String model;

    public Acer(String companyName, String model, int ram, String cpu, String graficCard) {
        super(ram, cpu, companyName, graficCard);
        this.model = model;
    }


    void showTheComputer() {
        System.out.printf("%-15s%-25s%-10d%-25s%-18s%n", companyName, model, ram, cpu, graficCard);
    }
}

