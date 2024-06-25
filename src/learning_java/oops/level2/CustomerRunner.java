package learning_java.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		
		
		Address homeAddress=new Address("Near Green Chowk","Gurgaon","123424");
		Customer customer=new Customer("Pankaj", homeAddress);
		
		Address workAddress=new Address("Near Square Chowk","Delhi","500343");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);
	}

}
