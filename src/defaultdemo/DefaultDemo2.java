package defaultdemo;

public class DefaultDemo2 extends DefaultDemo1{
	
	
	
	public int a;
	
	
	/*
	 * DefaultDemo2(int a){
	 * 
	 * super(10);
	 * 
	 * this.a=a;
	 * 
	 * System.out.println("child contrstctor");
	 * 
	 * }
	 */
	 
	  
	  
		
	/*
	 * DefaultDemo2(int a){ // super(a); this.a=a; }
	 */
		 
	 
	
	void printVariables() {
		
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		
		DefaultDemo2 demo2 = new DefaultDemo2();
		
	//demo2.printVariables();
		
		/*
		 * DefaultDemo2 demo2 = new DefaultDemo2(10,20);
		 * 
		 * demo2.parentMethod();
		 * 
		 * demo2.printVariables();
		 */
		
		
		
		
		
		
	}

}
