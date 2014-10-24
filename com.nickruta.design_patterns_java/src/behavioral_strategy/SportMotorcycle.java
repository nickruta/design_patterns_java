package behavioral_strategy;

public class SportMotorcycle extends Motorcycle {
	
	public SportMotorcycle() {
		driveBehavior = new DriveFastAndFurious();
	}
	
	public void display() {
		System.out.println("I'm a fast and sleek Motorcycle!");
	}

}

