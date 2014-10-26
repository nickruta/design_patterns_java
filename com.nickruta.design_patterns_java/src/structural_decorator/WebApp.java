package structural_decorator;

//concrete component
public class WebApp extends Application {

	public WebApp() {
		// description instance variable inherited from Application
		description = "Web Application";
	}
 
	public int cost() {
		return 5000;
	}
	
}


