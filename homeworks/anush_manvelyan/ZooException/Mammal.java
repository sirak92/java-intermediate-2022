package tech42;

class Mammal extends Animal implements AnimalUnique {

    private String mammalName;
    private String mammalType = "Mammal";

    Mammal(String mammalName) {
        super(mammalName);
        this.mammalName = mammalName;
    }

    Mammal(Animal name) {
        super(name.animalName());
    }

    @Override
    public String animalType() {
        return mammalType;
    }

    @Override
    public String animalName() {
        return mammalName;
    }

    @Override
    public String area() {
        return "It will be good to have a lot of outdoor green fields for your ";
    }

    @Override
    public String voice() {
        if (animalName.equals("Cow")) {
            return "\tMoo!";
        } else if (animalName.equals("Cat")) {
            return "\tMeow!";
        } else if (animalName.equals("Lion")) {
            return "\tRoar!";
        }
        return "";
    }

    @Override
    public String pawsFeet() {
        return " Mammals have 2 paws and 2 feet";
    }

}