public class Asus extends Computers {
    String model;

    public Asus(String companyName, String model, int ram, String cpu, String graficCard) {
        super(ram, cpu, companyName, graficCard);
        this.model = model;
    }


    void showTheComputer() {
        System.out.printf("%-15s%-25s%-10s%-25s%-18s%n", "Company name", "Model Type", "Ram", "CPU", "Graphic card");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s%-25s%-10d%-25s%-18s%n", companyName, model, ram, cpu, graficCard);
    }
}
