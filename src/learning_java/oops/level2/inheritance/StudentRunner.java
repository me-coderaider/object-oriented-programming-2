package learning_java.oops.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
//		Student student=new Student();
//		student.setName("Pankaj");
//		student.setEmail("sample@email.com");
//		student.setPhoneNumber("+911122334455");
		
		Employee employee=new Employee("Pankaj", "SDE-III");
//		employee.setName("Pankaj");
		employee.setEmail("sample@email.com");
		employee.setPhoneNumber("+911122334455");
		employee.setTitle("SDE-III");
		employee.setEmployer("Google");
		employee.setEmployeeGrade('M');
		
		System.out.println(employee.toString());
		
	}

}
