package generics;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics {

	public static void main(String[] args) {
	// Collection framework without generics 
		List ll1 = new ArrayList();
		ll1.add(10);
		ll1.add(10.10);
		ll1.add("Ravi");
		ll1.add(20);
		System.out.println(ll1);
		Object obj = ll1.get(1);		// return type of this method is Object class reference. 
		Integer i = (Integer)obj;		// type casting (down level type casting on object level)
		int n = i.intValue();    // convert integer object to int primitive data types. 
		//int n = (int)ll1.get(2);
		System.out.println(n);
	// collection framework with Generics 
		List<Integer> ll2 = new ArrayList<Integer>();	// it allow to store only integer type 
		ll2.add(10);		// auto-boxing : converting primitive to object. 
		ll2.add(20);
		ll2.add(30);
		//ll2.add("Ravi");
		int m = ll2.get(0);		// auto-unboxing : converting object to primitive 
		System.out.println(m);
	}

}
