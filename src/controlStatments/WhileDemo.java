package controlStatments;

public class WhileDemo {

	int result;

	public void doWhileDemo(int a) {

		while(a>0)
		{

			result = result+a;

			a--;
			
		}
		System.out.println(result);
	}

	public static void main(String[] args) {

		WhileDemo demo	 = new WhileDemo();

		demo.doWhileDemo(5);

	}

}
