package boking;

class TicketBooking implements Runnable {
	int avl=1;
	@Override
	public synchronized void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if(avl>=1) {
			System.out.println(name+" got the ticket");
			avl=avl-1;
		}else {
			System.out.println(name+"Sorry no ticket ");	
		}
		
	}
}


public class BookingApp {
	public static void main(String[] args) {
		TicketBooking tb1 = new TicketBooking();	// avl=1
		//TicketBooking tb2 = new TicketBooking();	//avl=1
		//TicketBooking tb3 = new TicketBooking();	//avl=1

		Thread t1 = new Thread(tb1);
		Thread t2 = new Thread(tb1);
		Thread t3 = new Thread(tb1);
		t1.setName("Raj");
		t2.setName("Ajay");
		t3.setName("Vijay");
		t1.start();
		t2.start();
		t3.start();
	}

}
