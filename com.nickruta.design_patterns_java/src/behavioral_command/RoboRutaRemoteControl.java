package behavioral_command;

import java.util.*;

//
// This is the invoker
//
public class RoboRutaRemoteControl {
	
	// we have one slot to hold our command, which will control one device, FireMissiles for example
	Command slot;
	
	public RoboRutaRemoteControl() {}
	 
	// we have a method for setting the command the slot is going to control
	// this could be called multiple times if the client of the this code wanted to change the behavior
	// of the remote button 
	public void setCommand(Command command) {
		slot = command;
	}
 
	// this method is called when the button is pressed. it takes the current command bound to the slot and calls its execute() method.
	public void buttonWasPressed() {
		slot.execute();
	}

}