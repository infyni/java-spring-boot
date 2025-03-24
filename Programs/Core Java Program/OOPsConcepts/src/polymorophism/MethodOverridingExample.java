package polymorophism;
class Bike {
	void speed() {
		System.out.println("60km/hr");
	}
}
class Honda extends Bike {
	//@Override
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
}
public class MethodOverridingExample {
	public static void main(String[] args) {
	//Pulsar pu = new speed(); 
	Honda hh = new Honda();
	hh.color();
	hh.speed();
	Pulsar pu = new Pulsar();
	pu.color();
	pu.speed();
	}

}
