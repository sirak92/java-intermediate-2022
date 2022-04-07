public class Car{
	Engine engineOfCar;
	Transmission transmissionOfCar;
	Battery batteryOfCar;
	int doors;
	String colorOfCar;
	String InteriorColor;
	String MaterialOfInterior;

	public void Start() {
		System.out.println("Car was started");
	}

	public void Stop() {
		System.out.println("Car was stopped");
	}
}

class Engine {
	int powerOfEngineHorsePower;
	int cylinders;
	int volumeOfEngine;
}

class Transmission {
	int gears;
	boolean ManualTransmission;
}

class Battery {
	boolean AGMtechnology;
}