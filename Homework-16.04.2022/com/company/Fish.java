package com.company;

import java.util.ArrayList;

public abstract class Fish {
    private String name;
    private int size;
    private String color;

    Fish(String name, int size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    ArrayList<String> fishes = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
