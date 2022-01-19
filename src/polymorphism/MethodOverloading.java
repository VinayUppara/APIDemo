package polymorphism;

public class MethodOverloading {



	public int calculateSum(int a, int b) {

		return a+b;

	}

	public void calculateSum(int a, int b, int c) {

		System.out.println(a+b+c);
	}

	
	public static void main(String...strings) {
		
		MethodOverloading overloading = new MethodOverloading();
		
		overloading.calculateSum(10, 20);
		
		overloading.calculateSum(10,20,30);
		
	}
}
