package controlStatments;

public class SwitchDemo {

	int result;

	int a=10;

	int b = 5;

	public void switchDemo(String browsername) {


		switch(browsername) {


		case "1234567": System.out.println("open chrome browser");
		break;

		case "edge": System.out.println("open edge browser");	
		break;

		case "firefox": System.out.println("open firefox browser");
		break;

		default: System.out.println("Open chrome browser");

		}

	}


	public int sample(String operation) {


		switch(operation) 

		{
		case "addition":
			result = a+b;
			break;


		case "subtraction": 
			result = a-b;
			break;

		default: System.out.println("please give an valid operation");

		}

		return result;

	}
	public static void main(String[] args) {

		SwitchDemo demo = new SwitchDemo();

		System.out.println(demo.sample("addition"));


	}

}
