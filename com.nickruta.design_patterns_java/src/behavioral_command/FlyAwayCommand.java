package behavioral_command;


// this is a COMMAND so we need to implement the COMMAND interface
public class FlyAwayCommand implements Command {
	RocketJetpack rocketJetpack;
	
	// the constructor is passed a specific missile group, say the missle group mounted on the right shoulder, and places it in the 
	// instance variable created
	// when execute() gets called, this is the missiles that will be the Receiver of the request
	public FlyAwayCommand(RocketJetpack rocketJetpack) {
		this.rocketJetpack = rocketJetpack;
	}
	
	// the execute method calls the fire() method on the receiving object, which is the light we are controlling
	public void execute() {
		rocketJetpack.fly();
	}

}