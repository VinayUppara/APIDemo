
class Car {



	String color;

	String type;

	int gears;

	int power;

	int a =10;




	Car(String color, String type, int gears,int power) {

		this.color = color;

		this.type = type;

		this.gears = gears;

		this.power = power; 

	}


	public void getCarDetails() {

		System.out.println(color+" "+type+" "+gears + " "+power);

	}




	public static void main(String...strings) {

		Car innova = new Car("white", "manual","6",500);

		Car indica = new Car("black", "automatic",5,600);


		//indica.getCarDetails();

		//innova.getCarDetails();

		//innova.cleancar();

	}


}
