package vehicleType.com;

import vehiclesCommon.com.Vehicle;

public class Truck extends Vehicle {
	private String steering;
	private String airConditioner;
	private String musicSystem;
	private int container;
	public Truck() {
		this.airConditioner="samsung";
		this.container=6;
		this.musicSystem="boat";
		this.steering="big";
	}
	public String getSteering() {
		return steering;
	}
	public String getAirConditioner() {
		return airConditioner;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public int getContainer() {
		return container;
	}
	public void setSteering(String steering) {
		this.steering = steering;
	}
	public void setAirConditioner(String airConditioner) {
		this.airConditioner = airConditioner;
	}
	public void setMusicSystem(String musicSystem) {
		this.musicSystem = musicSystem;
	}
	public void setContainer(int container) {
		this.container = container;
	}
	@Override
	public String toString() {
		return "Truck [steering=" + steering + ", airConditioner=" + airConditioner + ", musicSystem=" + musicSystem
				+ ", container=" + container + "]";
	}
	
}
