package learning_java.oops.level2;

public class Address {
	//state
	public String line1;
	public String city;
	public String zip;
	
	//creation
	public Address(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}
	// behaviour/functions/methods/procedures
	public String toString() {
		return String.format("Line1: %s, City: %s, Zip: %s\n", line1, city, zip);
	}
	
	
}
