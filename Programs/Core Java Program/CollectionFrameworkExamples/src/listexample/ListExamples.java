package listexample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListExamples {

	public static void main(String[] args) {
//	// 1st ArrayList 
//	ArrayList al = new ArrayList();
//	System.out.println("Size "+al.size());
//	al.add(10);
//	al.add(20);
//	al.add(60);
//	al.add(40);
//	al.add(30);		// add the element at last 
//	al.add("Ravi");
//	System.out.println(al);
//	System.out.println("find the element using index position "+al.get(1));
//	al.add(1, 100);
//	System.out.println("find the element using index position "+al.get(1));
//	System.out.println(al);
//	System.out.println("Remove element using index position "+al.remove(2));  // using index position 
//	Integer i = 40;		// auto- boxing. creating Integer class object using literal style like String 
//	System.out.println("Remove element using index position "+al.remove(i));  // using the value  
//	System.out.println(al);
		
	// 2nd example with LinkedList . by default LinkedList is consider as Double LinkedList. 
		// 1st ArrayList 
//		LinkedList al = new LinkedList();
//		System.out.println("Size "+al.size());
//		al.add(10);
//		al.add(20);
//		al.add(60);
//		al.add(40);
//		al.add(30);		// add the element at last 
//		al.add("Ravi");
//		System.out.println(al);
//		System.out.println("find the element using index position "+al.get(1));
//			al.add(1, 100);
//		System.out.println("find the element using index position "+al.get(1));
//		System.out.println(al);
//		System.out.println("Remove element using index position "+al.remove(2));  // using index position 
//		Integer i = 40;		// auto- boxing. creating Integer class object using literal style like String 
//		System.out.println("Remove element using index position "+al.remove(i));  // using the value  
//		System.out.println(al);
	
		// 3rd Example 
//		Vector vv = new Vector();
//		vv.add(100);
//		vv.addElement(101);
//		System.out.println(vv);
		
		// 4th exammple 
		
		Stack ss = new Stack();
		ss.push(100);
		ss.push(200);
		ss.push(300);
		System.out.println(ss);
		System.out.println("retrieve top most element and remove "+ss.pop());
		System.out.println(ss);
		System.out.println("retrieve top most element but doesn't remvove from a stack "+ss.peek());
		System.out.println(ss);
		System.out.println("Search "+ss.search(100));	// if present it retrieve position of that element count start from top. 
		System.out.println("Search "+ss.search(1000));	// if not present it return -1.
	}

}
