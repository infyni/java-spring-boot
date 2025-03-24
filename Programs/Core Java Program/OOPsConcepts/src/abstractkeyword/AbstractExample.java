package abstractkeyword;
abstract class Bike {
	abstract void speed();
	void mailage() {
		System.out.println("55km/lt");
	}
}
class Honda extends Bike {
	@Override
	void speed() {						// override code 
		System.out.println("50km/hr");
	}
	void color() {
		System.out.println("Black");
	}
}
class Pulsar extends Bike {
	@Override
	void speed() {						// override code 
		System.out.println("90km/hr");
	}
	void color() {
		System.out.println("Red");
	}
	@Override
	void mailage() {
		System.out.println("40km/lt");
	}
}
public class AbstractExample {
	public static void main(String[] args) {
		Bike bb = new Pulsar();		// creating sub class object and super class reference. with help of pu object we can call only speed and mailage not color
		bb.speed();				// run time polymorphism 
		bb.mailage();
		//bb.color()
		Pulsar pu = new Pulsar();
		pu.speed();
		pu.color();
		pu.mailage();
		
	}
}
