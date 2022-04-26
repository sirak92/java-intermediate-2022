package com.company;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("ZooZoo", 200);
        Mammal mammal1 = new Mammal();
        Mammal mammal2 = new Mammal();
        Reptile reptile1 = new Reptile();
        Reptile reptile2 = new Reptile();
        zoo.addAnimal(mammal1);
        zoo.addAnimals(mammal2, reptile1, reptile2);
        System.out.println(zoo.getAnimals());
        System.out.println(zoo.getMammals());
        System.out.println(zoo.getReptile());
        Worker worker1= new Worker.WorkerBuilder()
                .name("AAA")
                .surname("BBB")
                .age(20)
                .phone("033333333")
                .id("34235")
                .createWorker();
        zoo.addWorker(worker1);
    }
}
