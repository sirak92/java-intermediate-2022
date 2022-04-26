package com.company;

public abstract class Animal {
    private static int nextId = 0;
    private final int id;
    private final String name;
    private final String type;

    protected Animal() {
        id = ++nextId;
        name = null;
        type = null;

    }

    protected Animal(String name, String type) {
        id = ++nextId;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString(){
        return this.name+ " "+this.id+" "+this.type;
    }

}
