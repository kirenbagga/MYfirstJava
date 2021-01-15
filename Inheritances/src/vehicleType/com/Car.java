package vehicleType.com;

import vehiclesCommon.com.Vehicle;

public class Car extends Vehicle {
	private String steering;
	private String musicSystem;
	private String entertainmentSystem;
	private String airConditioner;
	private String Fridge;
	
	
	/**
	 * 
	 */
	public Car() {
		this.steering="small";
		this.entertainmentSystem="sony";
		this.musicSystem="walkman";
		this.Fridge="mini";
		this.airConditioner="lg";
		
	}
	public String getSteering() {
		return steering;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}
	public String getAirConditioner() {
		return airConditioner;
	}
	public String getFridge() {
		return Fridge;
	}
	public void setSteering(String steering) {
		this.steering = steering;
	}
	public void setMusicSystem(String musicSystem) {
		this.musicSystem = musicSystem;
	}
	public void setEntertainmentSystem(String entertainmentSystem) {
		this.entertainmentSystem = entertainmentSystem;
	}
	public void setAirConditioner(String airConditioner) {
		this.airConditioner = airConditioner;
	}
	public void setFridge(String fridge) {
		Fridge = fridge;
	}
	
	

}
