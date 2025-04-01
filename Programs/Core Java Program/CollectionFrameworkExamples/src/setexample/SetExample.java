package setexample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
class A {}
class B {}
public class SetExample {

	public static void main(String[] args) {
		// 1st example storing different types of values using HashSet 
		
//		HashSet hs  = new HashSet();
//		System.out.println("Size "+hs.size());		// 0 
//		System.out.println("Is empty "+hs.isEmpty());	// true 
//		int a=10;	// primitive data types 
//		Integer b = new Integer(a);    // b is consider as integer object. 
//		hs.add(b);				
//		hs.add(20);   // auto-boxing : converting to primitive to object. 
//		hs.add(100.10);
//		hs.add(true);
//		hs.add("Ravi");
//		A obj1 = new A();
//		B obj2 = new B();
//		hs.add(obj1);
//		hs.add(obj2);
//		System.out.println(hs);
		
		//2nd example HashSet/LinkedHashSet/TreeSet  with different method with same data type values;
		//HashSet hs  = new HashSet();
		//LinkedHashSet hs = new LinkedHashSet();
		TreeSet hs = new TreeSet();
		System.out.println("Size "+hs.size());		// 0 
		System.out.println("Is empty "+hs.isEmpty());
		hs.add(4);
		hs.add(3);
		hs.add(1);
		hs.add(8);
		//hs.add("A");
		hs.add(7);
		hs.add(5);
		hs.add(4);
		System.out.println("Size "+hs.size());		// 0 
		System.out.println("Is empty "+hs.isEmpty());
		System.out.println(hs);  // display these information in string format. 
		System.out.println("remove "+hs.remove(3));	// we can remove using value 
		System.out.println("remove "+hs.remove(30));
		System.out.println(hs);  // display these information in string format.
		System.out.println("search "+hs.contains(3));	// we can remove using value 
		System.out.println("search "+hs.contains(4));
		hs.clear();
		System.out.println("Size "+hs.size());		// 0 
		System.out.println("Is empty "+hs.isEmpty());
	}

}
