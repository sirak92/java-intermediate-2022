package zoo;

import java.util.ArrayList;

public class Zoo implements Service {
    private static int fund = 10000000;
    ArrayList<Animal> animals = new ArrayList<>();
    ArrayList<Cages> cagess = new ArrayList<>();
    private int cagesQuanity = cagess.size();

    /**
     * @param cages
     * @param employee
     * @throws NoFundException
     */
    @Override
    public void repair(Cages cages, Employee employee) throws NoFundException {
        if (cages.getRepairPrice() > fund) {
            throw new NoFundException("The money in the fund has run out");
        } else {
            cagess.add(cages);
            fund = fund - cages.getRepairPrice() - (employee.getQuanity() * employee.getSalary());
            System.out.println("At this moment zoo have "+fund + " fund");
            System.out.println("Cages quanity = " + ++cagesQuanity);

        }
    }

    /**
     *
     * @param animal
     * @throws NoFundException
     * @throws NoFreeCagesException
     */
    @Override
    public void buy(Animal animal) throws NoFundException,NoFreeCagesException {
        if (animal.getPrice() > fund) {
            throw new NoFundException("The money in the fund has run out");
        } else {
            animals.add(animal);
            fund = fund - animal.getPrice();
            System.out.println("At this moment zoo have "+ fund + "fund");
            animal.setQuanity(animal.getQuanity() + 1);
            System.out.println("At this moment zoo have "+animal.getQuanity()+ " animal");
            while (cagesQuanity--<1){
                throw new NoFreeCagesException("This moment no free cages");
            }
        }
    }

    @Override
    public void sell(Animal animal) {
        animals.remove(animal);
        fund = fund + animal.getPrice();
        System.out.println("At this moment zoo have "+ fund + "fund");
        animal.setQuanity(animal.getQuanity() - 1);
        System.out.println("At this moment zoo have "+animal.getQuanity()+ " animal");
    }
}