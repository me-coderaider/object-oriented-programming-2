package learning_java.oops.level2;

public class Customer {
	//state
	private String name;
	private Address homeAddress;
	private Address workAddress;
	
	//creation
	public Customer(String name, Address homeAddress) {
		this.name=name;
		this.homeAddress=homeAddress;
	}

	// operations/ behaviour
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	public String toString() {
		return String.format("Name: %s, HomeAddress: %s, WorkAddress: %s", name, homeAddress, workAddress);
	}
	
	
	
	
}
	