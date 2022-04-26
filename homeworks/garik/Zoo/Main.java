package zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo=new Zoo();
        Animal fish = new Fish(false,15,10,80000);
        Animal reptile = new Reptile(true,24,6,90000);
        Animal bird = new Bird(false,41,8,85000);
        Cages cages1 = new Cages(1,true,true,40000);
        Cages cages2 = new Cages(1,false,true,30000);
        Cages cages3 = new Cages(1,true,true,20000);
        Employee employees =new Employee("Worker",45000,9);
        zoo.buy(fish);
        zoo.buy(reptile);
        zoo.buy(bird);
        zoo.repair(cages1,employees);
        zoo.repair(cages2,employees);
        zoo.repair(cages3,employees);
        zoo.sell(fish);
        employees.salaryIncrease(employees.getSalary());
    }

}
