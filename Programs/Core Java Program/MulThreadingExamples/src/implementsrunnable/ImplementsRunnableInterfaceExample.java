package implementsrunnable;

class A implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i "+i);
		}
	}
}
class B implements Runnable {
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j "+j);
		}
		
	}
}
public class ImplementsRunnableInterfaceExample {
	public static void main(String[] args) {
		Runnable obj1 = new A();
		Runnable obj2 = new B();
		Thread t1 = new Thread(obj1);	// passing runnable interface reference. 
		Thread t2 =new Thread(obj2);	// passing runnable interface reference 
		t1.start();
		t2.start();
	}

}
