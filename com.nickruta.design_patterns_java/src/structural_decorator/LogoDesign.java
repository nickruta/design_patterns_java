package structural_decorator;

public class LogoDesign extends FeatureDecorator {

// instance variable to hold the application we are wrapping
Application application;
	

	public LogoDesign(Application application) {
		// set instance variable to the object we are wrapping
		// pass the application we're wrapping to the decorator's constructor
		this.application = application;
	}

	public String getDescription() {
		// description should include application and each feature decorating the application
		return application.getDescription() + ", LogoDesign";
	}
	
	public int cost() {
		
		// compute the cost of the feature, delegate the call to the object we're decorating, to compute its cost, then 
		// add the cost of the feature to the result
		return 750 + application.cost();
	}

}