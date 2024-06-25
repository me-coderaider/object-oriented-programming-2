package learning_java.oops.level2;

import java.util.ArrayList;
import java.util.List;

public class Book {
	// state
	private int id;
	private String name;
	private String author;
	private List<Review> review;
	
	// creation
	public Book(int id, String name, String author) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.review=new ArrayList<>();
	}
	
	// behaviour
	public String toString() {
		return String.format("Id: %d, Name: %s, Author: %s, Review: %s", id, name, author, review);
	}

	public void addReview(Review review) {
		this.review.add(review);
	}
	
	
	
	
	
}
