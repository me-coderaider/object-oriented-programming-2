package learning_java.oops.level2;

public class Rectangle {
	//state
	private int height;
	private int width;
	
	// creation
	public Rectangle(int height, int width) {
		this.height=height;
		this.width=width;
	}
	
	//operations
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int area() {
		return getHeight()*getWidth();
	}
	
	public int perimeter() {
		return 2*(getHeight()+getWidth());
	}

	public String toString() {
		return String.format("height: %d, width: %d, area: %d, perimeter: %d", height, width, area(), perimeter());
	}
}
