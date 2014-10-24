package com.nickruta.design_patterns_java.behavioral_strategy;

public  abstract class Motorcycle {
	
	//programming to an interface
	DriveBehavior driveBehavior;
	
	public Motorcycle() {		
	}
	
	
	
	public void setDriveBehavior (DriveBehavior db) {
		//programming to an interface
		driveBehavior = db;
	}
	
	public void performDrive() {
		driveBehavior.drive();
	}
	
	abstract void display();
	
	public void stop() {
		System.out.println("Stop!");
	}
	
}
