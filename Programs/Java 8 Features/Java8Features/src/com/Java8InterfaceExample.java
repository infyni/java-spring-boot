package com;
@FunctionalInterface
interface Abc {
	void dis1();	// by default public and abstract consider 
	default void dis2() {
		System.out.println("Default implementation provided by Abc interface dis2");
	}
	static void dis3() {
		System.out.println("Static implementation provided by Abc interface dis3 ");
	}
	default void dis4() {
		System.out.println("Default implementation provided by Abc interface dis4 ");
	}
	//void dis5();
}
class Test implements Abc{
	@Override
	public void dis1() {
		System.out.println("provided body for abstract method in Test class");
	}
	@Override
	public void dis2() {
		System.out.println("Default implementation provided by Abc interface dis2 but override by Test class");
	}
}
public class Java8InterfaceExample {
	public static void main(String[] args) {
	Test tt = new Test();
	tt.dis1();
	tt.dis2();
	tt.dis4();
	Abc.dis3();   // calling static method part of interface. 
	}

}
