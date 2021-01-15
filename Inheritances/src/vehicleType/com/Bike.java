package vehicleType.com;

import vehiclesCommon.com.Vehicle;

public class Bike extends Vehicle {
	private String handle;
	public Bike() {
		handle="short";
	}
	public Bike(String handle,String engine, String lights, int seats, int fuelTank, int wheels) {
		super(engine,lights,seats,fuelTank,wheels);
		this.handle=handle;
	}
	public String getHandle() {
		return handle;
	}
	public void setHandle(String handle) {
		this.handle = handle;
	}
	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getLights()=" + getLights()
				+ ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank() + ", getWheels()=" + getWheels()
				+ "]";
	}
	
	public void run() {
		System.out.println("running bike");
		System.out.println(toString());
	}

	

}
