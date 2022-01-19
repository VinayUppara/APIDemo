class Employee {


	int a,b;

	Employee(int a, int b){

		this.a = a;

		this.b = b;
	}


	protected int calculateSalary() {



		return a+b;


	}

	public static void main(String[] args) {

		Employee e = new Employee(100,200);

		System.out.println( e.calculateSalary());

	}


}


