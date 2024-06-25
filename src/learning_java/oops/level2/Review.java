package learning_java.oops.level2;

public class Review {
	// state
	private int id;
	private String description;
	private int rating;
	
	// creation
	public Review(int id, String description, int rating) {
		this.id=id;
		this.description=description;
		this.rating=rating;
	}
	
	// behaviour/methods
	public String toString() {
		return String.format("{Id: %d, Description: %s, Rating: %d}",id, description, rating);
	}

}
