package polymorphism;

class OverRide {

	

	String calculateSum(int i, String a) {

		return i+a;
	}
}


public class MethodOverriding extends OverRide{


	
	String calculateSum(int i, String a) {

		return i+a;
	}


	static public void main(String...strings) {

		MethodOverriding child = new MethodOverriding();

		OverRide parent = new OverRide();
		
		
		System.out.println(parent.calculateSum(1,"200"));
		
		System.out.println(child.calculateSum(1,"vinay"));
		

	}

}

