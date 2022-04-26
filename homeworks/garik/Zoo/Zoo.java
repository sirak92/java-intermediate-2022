package zoo;

import java.util.ArrayList;

public class Zoo implements Service {
    private static int fund = 10000000;
    ArrayList<Animal> animals = new ArrayList<>();
    ArrayList<Cages> cagess = new ArrayList<>();


    @Override
    public void buy(Animal animal) {
        if (animal.getPrice() > fund) {
            System.out.println("The money in the fund has run out");
        } else {
            animals.add(animal);
            fund = fund - animal.getPrice();
            System.out.println(fund);
            animal.setQuanity(animal.getQuanity() + 1);
            System.out.println(animal.getQuanity());
        }
    }

    @Override
    public void repair(Cages cages, Employee employee) {
        if (cages.getRepairPrice() > fund) {
            System.out.println("The money in the fund has run out");
        } else {
            cagess.add(cages);
            fund = fund - cages.getRepairPrice() - (employee.getQuanity() * employee.getSalary());
            System.out.println(fund);

        }
    }

    @Override
    public void sell(Animal animal) {
        animals.remove(animal);
        fund = fund + animal.getPrice();
        System.out.println(fund);
        animal.setQuanity(animal.getQuanity() - 1);
        System.out.println(animal.getQuanity());
    }
}