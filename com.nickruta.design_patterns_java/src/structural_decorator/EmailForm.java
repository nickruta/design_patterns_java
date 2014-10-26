package structural_decorator;

public class EmailForm extends FeatureDecorator {
	
	Application application;
	
	public EmailForm(Application application) {
		// set instance variable to the object we are wrapping
		// pass the application we're wrapping to the decorator's constructor
		this.application = application;
	}

	public String getDescription() {
		// description should include application and each feature decorating the application
		return application.getDescription() + ", EmailForm";
	}
	
	public int cost() {
		
		// compute the cost of the feature, delegate the call to the object we're decorating, to compute its cost, then 
		// add the cost of the feature to the result
		return 250 + application.cost();
	}

}

