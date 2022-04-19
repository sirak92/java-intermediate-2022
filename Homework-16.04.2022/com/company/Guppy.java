package com.company;

public class Guppy extends Fish implements Herbivore {
    protected String aquariumFish;

    public Guppy(String name, int size, String color, String aquariumFish) {
        super(name, size, color);
        this.aquariumFish = aquariumFish;
    }

    @Override
    public void grassEater() {
        System.out.println("guppy doesn't eat meat");
    }
}
