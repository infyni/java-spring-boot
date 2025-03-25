package interfacedemo;
interface A {
	
}
interface Abc extends A{
int A=10;
void dis1();
}

interface Mno {
int B=20;
void dis2();
}

interface Xyz extends Abc,Mno{
int C=30;
void dis3();
}

class Test implements Abc,Mno{
	public void dis1() {
		System.out.println("Abc interface method");
	}
	public void dis2() {
		System.out.println("Mno interface method");
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		Test tt = new Test();
		tt.dis1();
		tt.dis2();
	}
}
