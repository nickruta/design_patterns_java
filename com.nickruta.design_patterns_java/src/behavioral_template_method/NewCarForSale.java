package behavioral_template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewCarForSale extends CarForSale {

	@Override
	void getPrice() {
		System.out.println("MSRP retrieved and set!");
	}
	
	// here is where you override the hook and provide your own functionality 
	public boolean sellerWantsToPostToSocialMedia() {
		
		// get user input if they want to post to social media sites
		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
 
	private String getUserInput() {
		String answer = null;

		System.out.print("Would you like to post the NEW car for sale to all social media sites (y/n)? ");
		
		// this code asks the user if he/she would like to post the car for sale to social media sites
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}

	@Override
	void postToSocialMedia() {
		System.out.println("Posting the car for sale to all Social Media sites specializing in NEW CAR SALES");		
	}

}
