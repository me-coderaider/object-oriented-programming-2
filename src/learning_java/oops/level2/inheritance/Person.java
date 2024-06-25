package learning_java.oops.level2.inheritance;

public class Person extends Object{
	private String name;
	private String email;
	private String phoneNumber;
	
	public Person() {
		System.out.println("Person");
	}
	
	public Person(String name) {
		super();
		this.name=name;
	}
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return String.format("Name: %s, Email: %s, Phone: %s", name, getEmail(), getPhoneNumber());
	}
}	
