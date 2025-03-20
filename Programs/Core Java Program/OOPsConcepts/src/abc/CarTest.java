package abc;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car innova = new Car();
//		innova.start();
//		innova.stop();
//		
//		Car ertiga = new Car();
//		ertiga.start();
//		ertiga.stop();
		
		Car innova = new Car();		// object creation it call  empty constructor 
		innova.displayCarInfo("Innova Car");		// default value display 
		innova.colour="White";
		innova.price=4500000.50f;
		innova.wheel=4;
		innova.displayCarInfo("Innova car");		// updated value display 
		
		//Car ertiga = new Car();				// it call empty constructor 
		Car ertiga = new Car(4,1500000,"Gray");	// calling parameter constructor. 
		ertiga.displayCarInfo("Ertiga Car");		// default value display 
//		ertiga.colour="Gray";
//		ertiga.price=1500000;
//		ertiga.wheel=4;
		ertiga.displayCarInfo("Ertiga Car");			// updated value display 
	}

}
