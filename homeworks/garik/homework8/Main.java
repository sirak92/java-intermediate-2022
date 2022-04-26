package zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal fish = new Fish(false, 15, 1, 80000);
        Animal reptile = new Reptile(true, 24, 1, 90000);
        Animal bird = new Bird(false, 41, 1, 85000);
        Animal fish1 = new Fish(true, 10, 1, 70000);
        Cages cages1 = new Cages(1, true, true, 40000);
        Cages cages2 = new Cages(1, false, true, 30000);
        Cages cages3 = new Cages(1, true, true, 20000);
        Employee employees = new Employee("Worker", 45000, 9);
        try {
            zoo.repair(cages1, employees);
            zoo.repair(cages2, employees);
            zoo.repair(cages3, employees);
            try {
                zoo.buy(fish);
                zoo.buy(reptile);
                zoo.buy(bird);
                zoo.buy(fish1);
            } catch (NoFreeCagesException noFreeCagesException) {
                System.out.println(noFreeCagesException.getMessage());
            }
        } catch (NoFundException noFundException) {
            System.out.println(noFundException.getMessage());
        }
        zoo.sell(fish);
        employees.salaryIncrease(employees.getSalary());
    }


}
