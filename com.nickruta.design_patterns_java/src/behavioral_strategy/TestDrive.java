package behavioral_strategy;

public class TestDrive {

	public static void main(String[] args) {
		
		CruiserMotorcycle cruiser = new CruiserMotorcycle();
		SportMotorcycle sportbike = new SportMotorcycle();
		
//		perform the default behavior for each motorcycle
		cruiser.performDrive();
		sportbike.performDrive();
		
//		polymorphism example - change the behavior at runtime
//		calling setter method to change behavior at runtime
		sportbike.setDriveBehavior(new DriveAtEase());
		sportbike.performDrive();

	}

}