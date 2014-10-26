package structural_decorator;

public class EasyUpTech {

	public static void main(String[] args) {
		
		Application application = new WebApp();
		application = new EmailForm(application);
		System.out.println(application.getDescription() 
				+ " $" + application.cost());
 
		Application application2 = new MobileApp();
		application2 = new EmailForm(application2);
		application2 = new LogoDesign(application2);
		System.out.println(application2.getDescription() 
				+ " $" + application2.cost());
	}

}