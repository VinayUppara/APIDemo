package controlStatments;

public class ForDemo {

	int sum[] = new int[100];

	int count=1;


	public void forDemo() {


		
		
		for(int i=0;i<sum.length;i++) 
		{

			sum[i]=count;
			count++;
		}
		
		
		for(int i=0; i<sum.length;i++) {
		
			
			System.out.println(sum[i]);
		}
		

		

	}


	public static void main(String[] args) {
		new ForDemo().forDemo();
	}

}
