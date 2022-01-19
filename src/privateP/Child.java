package privateP;

public class Child extends Private {

	public void getDetails() {
		
		employeeDetails();
	}
	
	
	public static void main(String[] args) {
		Child c = new Child();
		
		c.employeeDetails();

	}

}
