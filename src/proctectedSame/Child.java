package proctectedSame;

public class Child extends Protected{

	void getNameFromParent() {
		
		name="";
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.name="";
		
		c.getNameFromParent();
	}

}
