package org.GetterSetter.com;

public class GetterSetter {
	private String doors;
	private String engine;
	private String driver;
	private int speed;

	public GetterSetter() {
		doors="closed";
		engine="on";
		driver="seated";
		speed=0;
	
	}
	
	/**
	 * @param doors
	 * @param engine
	 * @param driver
	 * @param speed
	 */
	public GetterSetter(String doors, String engine, String driver, int speed) {
		super();
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}

	public void setSpeed(int speed1) {
		speed = speed1;
	}

	/*
	 * public void setSpeed(int speed) { this.speed=speed1; }
	 */
	public int getSpeed() {
		return speed;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String run() {
		if(doors.equals("closed") && engine.contentEquals("on") 
				&& driver.equals("seated") && speed > 0) {
			return "running";
		}
		else {
		return " not running";
		}

	}
}
