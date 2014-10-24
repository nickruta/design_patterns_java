package com.nickruta.design_patterns_java.behavioral_strategy;

// Take what varies and 'encapsulate' it so it won't affect the rest of your code
public class DriveFastAndFurious implements DriveBehavior {

	@Override
	public void drive() {
		System.out.println("I'm driving fast and furious!");
	}

}
