package zoo;

public interface Service {
    void buy(Animal animal) throws NoFundException, NoFreeCagesException;
    void sell(Animal animal);
    void repair(Cages cages, Employee employee) throws NoFundException;
}
