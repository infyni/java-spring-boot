package abc;

public class Car {
int wheel;
float price;
String colour;		// instance variable. 

	Car() {
		System.out.println("object created....");
		wheel=4;
		price = 1000000;
		colour="Unkown";	// whenever memory create we can do initialization 
	}
//	Car(int wheel1,float price1, String colour1){	// parameter variable like local variable. 
//		wheel = wheel1;
//		price= price1;
//		colour=colour1;
//	}
	// instance variable and local or parameter variable have same name. 
	Car(int wheel,float price, String colour){	// parameter variable like local variable. 
		this.wheel = wheel;		// this.wheel is instance variable and wheel is local variable. 
		this.price= price;
		this.colour=colour;
	}

void start() {
	System.out.println("Car Start");
}
void appliedGear() {
	System.out.println("Applied gear");
}
void moving() {
	System.out.println("Car is moving");
}
void stop() {
	System.out.println("Car Stop");
}

void displayCarInfo(String name) {
	String msg="Car Details of "+name;		// local variable 
	System.out.println(msg);
	System.out.println("wheel "+wheel);
	System.out.println("price "+price);
	System.out.println("colour "+colour);
}

}
