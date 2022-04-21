package zoo;

public interface Service {
    void buy(Animal animal);
    void sell(Animal animal);
    void repair(Cages cages, Employee employee);
}
