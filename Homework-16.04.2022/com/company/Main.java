package com.company;

public class Main {

    public static void main(String[] args) {
        Guppy obj = new Guppy("guppy1", 2, "rainbow", "freshwater fish");
        System.out.println("the color of the new guppy is" + " " + obj.getColor());
        obj.setSize(2);
        System.out.println("the size is" + " " + obj.getSize() + " " + "cm");
        obj.grassEater();
        Shark obj1 = new Shark("Hammerhead shark", 5, "grey", "saltywater fish");
        System.out.println("the color of the new shark is" + " " + obj1.getColor());
        obj1.setSize(6);
        System.out.println("the size is" + " " + obj1.getSize() + " " + "m");
        obj1.meatEater();

        obj.fishes.add(0, "guppy male");
        obj.fishes.add(1, "guppy female");
        obj1.fishes.add(0, "The White shark");
        obj1.fishes.add(1, "the Hammerhead shark");
        System.out.println(obj.fishes.get(0));
        System.out.println(obj1.fishes.get(1));
        AquariumPark employeeAqua = new AquariumPark();
        employeeAqua.employees.add(0, "Jobs");
        employeeAqua.employees.add(1, "Tramp");
        System.out.println("First employee of Aquarium park is" + "---" + employeeAqua.employees.get(0));

    }
}
