package setexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRetrieveExample {

	public static void main(String[] args) {
		// 
		Set<Integer> ss = new HashSet<Integer>();
		ss.add(10);ss.add(30);ss.add(20);ss.add(50);
		System.out.println(ss);		// output as string format 
		System.out.println("retrieve element using for each loop");
		for(int n :ss) {
			System.out.println(n);
		}
		System.out.println("Retrieve the element using Iterator interface");
		Iterator<Integer> ii = ss.iterator();
		while(ii.hasNext()) {
			int n  = ii.next();
			System.out.println(n);
		}
		
	}

}
