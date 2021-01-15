package demo.com;

import vehicleType.com.Bike;
import vehicleType.com.Car;
import vehicleType.com.Truck;

public class Demo {
 
	public static void main(String[] args) {
		Bike bike=new Bike();
		System.out.println(bike.getHandle());
		System.out.println(bike);
		
		bike.run();
		Bike bike1=new Bike();
		System.out.println(bike1.getHandle());
		
		Car car=new Car();
		System.out.println(car.getEntertainmentSystem());
		System.out.println(car.getFuelTank());
		
		Truck truck=new Truck();
		System.out.println(truck.getSteering());
		System.out.println(truck.getFuelTank());
		System.out.println(truck.getContainer());
		System.out.println(truck);
	}

}
