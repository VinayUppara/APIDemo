package privatePackage;

public class Constructor2 extends Constructor1{

	int age =26;

	int height =26;

	int weight =26;




	int i,j;

	public Constructor2(){

		System.out.println("Child constructor");
	}

	public Constructor2(int i, int j) {
		super.a=j;
		this.i=j;
		this.j=j;

		System.out.println("Child values "+i + " " + j);		
	}



	public static void main(String[] args) {

		Constructor2 c2 = new Constructor2();

		Constructor2 c = new Constructor2(10,20);


	}

}
