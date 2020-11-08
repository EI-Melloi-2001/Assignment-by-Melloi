package com.cap.demo;

public class Car {//Object
	String name;
	double tank;
	double oilConsumption;
	public Car() {
		
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", tank=" + tank + ", oilConsumption=" + oilConsumption + "]";
	}

	public Car(String name,double tank,double oilConsumption) {
		this.name=name;
		this.tank=tank;
		this.oilConsumption=oilConsumption;
	}
	public void gas(double gas1) {
		
	}
	
	public void road(double miles) {
		
	}

}
