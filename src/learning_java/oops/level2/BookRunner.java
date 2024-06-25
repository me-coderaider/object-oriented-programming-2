package learning_java.oops.level2;

public class BookRunner {

	public static void main(String[] args) {
		
		Book book=new Book(123,"Object Oriented Programming with Java","James Anderson");
			
		System.out.println(book);
		book.addReview(new Review(10, "Great Book", 5));
		book.addReview(new Review(9, "Great for Beginners", 4));
		System.out.println(book);
		
	}

}
