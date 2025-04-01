package queueExample;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
	// PriorityQueue
	
	Queue q1 = new PriorityQueue();
	q1.add(3);q1.add(1);q1.add(6);q1.add(8);q1.add(4);
	System.out.println(q1);	// unorder but first element with low value ready to remove 
	System.out.println("remove element "+q1.poll());
	System.out.println(q1);
	System.out.println("-----------------------");
	//LinkedList queue 
	Queue q2 = new LinkedList();
	q2.add(3);q2.add(1);q2.add(6);q2.add(8);q2.add(4);
	System.out.println(q2);	// maintain the order 
	System.out.println("remove element "+q2.poll());
	System.out.println(q2);
	}

}
