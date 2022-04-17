package com.company;

public class Mammal extends Animal implements AnimalActions {

    public Mammal() {
        super();
    }

    public Mammal(String name, String type) {
        super(name, type);
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " " + this.getId() + ": is walking");
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " " + this.getId() + ": is running");
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " " + this.getId() + ": is making sound");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " " + this.getId() + ": is eating");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " " + this.getId() + ": is sleeping");
    }

    @Override
    public void wakeUp() {
        System.out.println(this.getName() + " " + this.getId() + ": waked up");
    }

}
