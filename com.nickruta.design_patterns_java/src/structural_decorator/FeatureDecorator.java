package structural_decorator;

// abstract class for the Decorators
// needs to be interchangeable with Application, so it extends Application
public abstract class FeatureDecorator extends Application {
	
	public abstract String getDescription();

}