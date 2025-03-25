package statickeyword;

class Simple {
	int a;			// instance variable 
	static int b;	// static variable 
	void dis1() {
		System.out.println("non static method");
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
	static void dis2() {
		System.out.println("static method");
		//System.out.println("a "+a);	we can't access non static variable directly
		System.out.println("b "+b);
	}
}
public class StaticExample {

	public static void main(String[] args) {
		Simple ss = new Simple();
		ss.a=100;
		Simple.b=200;		// assign the value through class name;
		ss.b=300;				// even through object. 
		ss.dis1();
		Simple.dis2();		// we can call method with help of class name 
		ss.dis2();				// even through object. 

	}

}
