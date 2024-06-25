package learning_java.oops.level2;

public abstract class AbstractRecipe {
	//prepare
	//recipe
	//cleanup
	
	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}
	
	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanup();
}
