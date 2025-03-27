package extendsthreadexample;
class A extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();			// calling super class run method : empty code 
		for(int i=0;i<10;i++) {
			System.out.println("i "+i);
		}
	}
}
class B extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int j=0;j<10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class DemoTest {
	public static void main(String[] args) {
	A obj1 = new A();
	B obj2 = new B();		// thread class object created. 
	obj1.start();
	obj2.start();       // it is a pre defined method to start the thread. 
						// Runnable 
						// start method internally call run method. 
					// thread class contains run method with empty body. 
	}

}
