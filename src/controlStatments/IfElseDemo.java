package controlStatments;

public class IfElseDemo {


	int product;

	public int productOfNumbers(int a, int b) {

		if(a==0&&b==0) {
			
			System.out.println("please give a number greater than zero");
		}
		
		else {

		 product = a*b;

		}
		
		return product;
	}
	
	char grade;
	
	public char getGrade(int score) {
		
		if(score>=80) {
			
			grade ='A';
		} else if(score>=60) {
			grade = 'B';
		}
		
		return grade;
	}

	public static void main(String[] args) {


		IfElseDemo demo = new IfElseDemo();

		 System.out.println(demo.productOfNumbers(10,20));
		
		
	}

}
