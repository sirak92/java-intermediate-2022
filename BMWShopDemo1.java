
public class BMWShopDemo1{

    public static void main(String[] args) {
	    SportCars M8 = new SportCars("M8", "sport", 241000, "twin turbo 4.4");
      CrossOvers X7 = new CrossOvers("X7", "crossover", 186500, "4X4");
      SportCars M4 = new SportCars("M4", "sport",154000, "twin power turbo 510 h.p." );
      SportCars.ourCars();
      System.out.println(M8.showCars());
      System.out.println(X7.showCars());
      System.out.println("BMW M4 engine is--" + " " + M4.sportEngine);
     }
}

 class BMWCarShop{
    String model;
    String type;
    int price;

    BMWCarShop( String model, String type, int price){
        this.model = model;
        this.type = type;
        this.price = price;
    }
    static void ourCars(){
        System.out.println("BMW  NEW GENERATION");
    }
}

 class SportCars extends BMWCarShop{
    String sportEngine;
    SportCars(String model, String type, int price, String sportEngine) {
        super(model, type, price);
        this.sportEngine = sportEngine;
    }

    String showCars(){
      return model + " " + type + " " + price + "$" + " " + sportEngine;
    }
}

class CrossOvers extends BMWCarShop{
    String fourWheelDriveSystem;
    CrossOvers(String model, String type, int price, String fourWheelDriveSystem) {
        super(model, type, price);
        this.fourWheelDriveSystem = fourWheelDriveSystem;
    }
      String showCars() {

          return model + " "+ type + " " + price + "$" + " " + fourWheelDriveSystem;
      }
}
