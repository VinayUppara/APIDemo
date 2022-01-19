package instance;

public class InstanceDemo {
	
	String name;
	
	int salary ;
	
	String age;
	
	
	InstanceDemo(String name, int salary){
		
		this.name = name;
		
		this.salary = salary;
	
	}
	
	

	public static void main(String[] args) {
		
		InstanceDemo i1 = new InstanceDemo("narendra",50000);
		
		i1.name = "Narendra";
		
		InstanceDemo i2 = new InstanceDemo("pranay", 40000);
		
		
		
		System.out.println(i1.age); 
		
		
		
		

	}

}
