package org.classes.com;

import org.GetterSetter.com.GetterSetter;

public class MainClass {

	public static void main(String[] args) {
		
		GetterSetter car=new GetterSetter();
		GetterSetter car1=new GetterSetter("closed","on","seated",19);
		car.setSpeed(18);
		car.setDoors("closed");
		car.setDriver("eated");
		 car.setEngine("on");
			System.out.println(car.run());
		System.out.println(car1.run());
	}

}
