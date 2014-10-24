package com.nickruta.design_patterns_java.behavioral_strategy;

public class CruiserMotorcycle extends Motorcycle {
	
	public CruiserMotorcycle() {
		driveBehavior = new DriveAtEase();
	}
	
	public void display() {
		System.out.println("I'm a big and bad Motorcycle!");
	}

}
