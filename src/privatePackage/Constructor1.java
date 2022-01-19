package privatePackage;

public class Constructor1 {

	
	
	
	  Constructor1() {
		
		System.out.println("parent constructor");
	}
	
	
	  public Constructor1(int a, int b){
		 
	  
	  System.out.println("Parent values "+a + " " + b); }
	 
	 
	
	  public int sample(int a, int b) {
		  
		 
		  
		  return a+b;
		 
	  }
	  
	public static void main(String[] args) {
		
		Constructor1 pd = new Constructor1();
		
		
		
		System.out.println( pd.sample(10, 20));
		
		//Constructor1 pd1 = new Constructor1();
		
		
		
	}

}
