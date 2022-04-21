public class TestZoo {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Canine canine = new  Canine(true,true, true,true,"wolf", 12);
        Canine canine1 = new  Canine(true,true, true,true,"wolf", 12);
        Canine canine2 = new  Canine(true,true, true,true,"wolf", 12);
        Canine canine3 = new  Canine(true,true, true,true,"wolf", 12);
        Canine canine4 = new  Canine(true,true, true,true,"wolf", 12);
//        System.out.println(canine.printInfo());
zoo.add(canine);
zoo.add(canine1);
zoo.add(canine2);
zoo.add(canine3);
zoo.add(canine4);
        System.out.println(zoo.getAnimals().size());
        zoo.removeAnimal(canine);
        zoo.removeAnimal(canine1);
        zoo.removeAnimal(canine3);
        zoo.removeAnimal(canine4);
        zoo.removeAnimal(canine4);
        zoo.removeAnimal(canine2);
        System.out.println(zoo.getAnimals().size());
        zoo.removeAnimal(canine2);
        zoo.add(canine);
        System.out.println(zoo.getAnimals().size());
zoo.getAnimals().forEach(canie->{
    System.out.println(canie.getPrice());
});

//        Animal lion = new Canine("Lion", 6, 4);
//        Animal tiger = new Canine("Tiger", 8, 4);
//        Animal wolf = new Feline("Wolf", 2, 4);

//        zoo.add(lion);
//        zoo.add(tiger);
//        zoo.add(wolf);

        System.out.println();
    }
}
