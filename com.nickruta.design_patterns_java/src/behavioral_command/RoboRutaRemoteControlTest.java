package behavioral_command;

// this is the Client in Command Pattern terms
public class RoboRutaRemoteControlTest {

	public static void main(String[] args) {
		
		// The remote is our Invoker; it will be passed a command object that can be used to make requests
		RoboRutaRemoteControl remote = new RoboRutaRemoteControl();
		
		// now create a Missiles object, this will be the Receiver of the request
		Missiles missiles = new Missiles();	
		RocketJetpack rocketJetpack = new RocketJetpack();
		
		// Here, create a command and pass it to the Receiver
		FireMissilesCommand fireMissiles = new FireMissilesCommand(missiles);
		FlyAwayCommand flyAway = new FlyAwayCommand(rocketJetpack);
 
		// here, pass the command to the Invoker
		remote.setCommand(fireMissiles);
		remote.buttonWasPressed();
		remote.setCommand(flyAway);
		
		// now simulate the button on the remote being pressed
		remote.buttonWasPressed();
    }
}

