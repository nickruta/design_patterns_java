package structural_decorator;

//concrete component
public class MobileApp extends Application {

	public MobileApp() {
		// description instance variable inherited from Application
		description = "Mobile Application";
	}
 
	public int cost() {
		return 10000;
	}
}

