package collections;

import java.util.ArrayList;
import java.util.List;

import defaultdemo.DefaultDemo2;

public class CollectionsDemo {

	int a = 10;
	
	
	
	 public void storeArray() {
		 
		 String[] names = new String[3];
		 
		 names[0] = "vinay";
			
			
		 names[1] = "abc";
		 
		 names[2] = "def";
		 
		 names[3] = "test";
		 
		 names[4] = "dff";
		 
		 names[5] = "1234";
		 
		 //names.
		 
		 System.out.println(names.length);
		 
	 }
	
	public static void main(String[] args) {
		
		
		
		
		//new CollectionsDemo().storeArray();
		 
	
		 
		
		
		ArrayList salaries = new ArrayList();
		
		salaries.add(true);
		
		salaries.add(10000);
		
		salaries.add(10000);
		
		
		salaries.add(10000);
		
		salaries.add(10000);
		
		salaries.add(10000);
		
		salaries.add(10000);
		
		salaries.add(10000);
		
		salaries.add(10000);
		salaries.add(10000);
		salaries.add(10000);
		
		salaries.add(10000);
		salaries.add(10000);
		salaries.add(10000);
		salaries.add(10000);
		salaries.add(10000);
		
		System.out.println(salaries.contains(50000));
	
		DefaultDemo2 demo2 =	new DefaultDemo2();
		
		System.out.println(demo2.name);
		
		
		

	}

}
