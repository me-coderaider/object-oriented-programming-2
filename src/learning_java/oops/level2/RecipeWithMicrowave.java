package learning_java.oops.level2;

public class RecipeWithMicrowave extends AbstractRecipe{

	@Override
	void getReady() {
		System.out.println("Get the raw materials.");
		System.out.println("Turn on the Microwave.");
	}

	@Override
	void doTheDish() {
		System.out.println("Get the stuff ready.");
		System.out.println("Put it in the microwave.");
		
	}

	@Override
	void cleanup() {
			System.out.println("Cleanup the utensils.");
			System.out.println("Turn off the Microwave.");
		
	}
	
	
}
