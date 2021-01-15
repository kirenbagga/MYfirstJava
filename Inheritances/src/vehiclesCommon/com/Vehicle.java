package vehiclesCommon.com;

public class Vehicle {
	private String engine;
	private String lights;
	private int seats;
	private int fuelTank;
	private int wheels;
	public Vehicle() {
	engine="petrol";
	lights="LED";
	seats=4;
	fuelTank=20;
	wheels=6;
	}
	
	/**
	 * @param engine
	 * @param lights
	 * @param seats
	 * @param fuelTank
	 * @param wheels
	 */
	public Vehicle(String engine, String lights, int seats, int fuelTank, int wheels) {
		super();
		this.engine = engine;
		this.lights = lights;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.wheels = wheels;
	}
//getters
	public String getEngine() {
		return engine;
	}
	public String getLights() {
		return lights;
	}
	public int getSeats() {
		return seats;
	}
	public int getFuelTank() {
		return fuelTank;
	}
	public int getWheels() {
		return wheels;
	}
//setters
	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void setLights(String lights) {
		this.lights = lights;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setFuelTank(int fuelTank) {
		this.fuelTank = fuelTank;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	
	public void run() {
		System.out.println("running vehicle");
	}

}
