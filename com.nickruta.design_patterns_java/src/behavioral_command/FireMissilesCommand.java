package behavioral_command;


// this is a COMMAND so we need to implement the COMMAND interface
public class FireMissilesCommand implements Command {
	Missiles missiles;
	
	// the constructor is passed a specific missile group, say the missle group mounted on the right shoulder, and places it in the 
	// instance variable created
	// when execute() gets called, this is the missiles that will be the Receiver of the request
	public FireMissilesCommand(Missiles missiles) {
		this.missiles = missiles;
	}
	
	// the execute method calls the fire() method on the receiving object, which is the light we are controlling
	public void execute() {
		missiles.fire();
	}

}