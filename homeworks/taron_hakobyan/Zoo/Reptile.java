package com.company;

public class Reptile extends Animal implements ReptileActions {
    private boolean isFlying;

    public Reptile() {
        super();
        this.isFlying = false;
    }

    public Reptile(String name, String type) {
        super(name, type);
        this.isFlying = false;
    }

    @Override
    public void fly() {
        if (!isFlying) {
            this.isFlying = true;
            System.out.println(this.getName() + " " + this.getId() + ": is flying");
        } else {
            System.out.println(this.getName() + " " + this.getId() + ": is already flying");
        }
    }

    @Override
    public void land() {
        if (isFlying) {
            this.isFlying = false;
            System.out.println(this.getName() + " " + this.getId() + ": landed");
        } else {
            System.out.println(this.getName() + " " + this.getId() + ": is already landed");
        }
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
