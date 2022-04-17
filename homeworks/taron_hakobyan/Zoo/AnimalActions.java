package com.company;

public interface AnimalActions {
    public void walk();
    public void run();
    public void makeSound();
    public void eat();
    public void sleep();
    public void wakeUp();
}
interface ReptileActions extends AnimalActions{
    public void fly();
    public void land();
}
