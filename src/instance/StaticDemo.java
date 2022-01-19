package instance;

import proctectedSame.Protected;

public class StaticDemo extends Protected {
	
	
	static String company;
	
	int salary = 10000;
	
	int id = 1234;
	
	int age;
	
	
	
	public void sample() {
		
		int result = 10+20;
		
		System.out.println(result);
		
		name="kumar";
		
	}
	

	public static void main(String[] args) {
	
		
		StaticDemo sd = new StaticDemo();
		
	sd.sample();
	
	sd.getName();
	
	
		
		
	}

}
