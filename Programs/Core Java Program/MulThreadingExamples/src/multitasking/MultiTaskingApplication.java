package multitasking;

class Task implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		//System.out.println("In Run method user defined thread "+t);
		String name = t.getName();
		System.out.println(name + " = Done the task");
	}
}

public class MultiTaskingApplication {

	public static void main(String[] args) {
		Task tt = new Task();	
		Thread t1 = new Thread(tt);		// 1st client 
		Thread t2 = new Thread(tt);		// 2nd client 
		Thread t3 = new Thread(tt);		// 3rd client 
		Thread t = Thread.currentThread();
		System.out.println("In Main method "+t);
		t1.setName("1st Client");
		t2.setName("2nd Client");
		t3.setName("3rd Client");
		t1.start();
		t2.start();
		t3.start();

	}

}
