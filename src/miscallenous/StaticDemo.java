package miscallenous;

import proctectedSame.Protected;

public class StaticDemo {
	
	static int a;
	
	  static {
	  
		  System.out.println("static block");
	  }
	 
	
	
	
	public void sample() {
		
		System.out.println("Parent static method");
	}
	

	public static void main(String[] args) {
		
		Protected p =new Protected();
		
		p.name="";
	}

}
