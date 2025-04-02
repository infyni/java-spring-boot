package mapexample;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
	// HashMap example 
		
	//HashMap hm = new HashMap();	// unorder
	//LinkedHashMap hm = new LinkedHashMap();  // maintain the order 
	//TreeMap hm = new TreeMap();		// sorted by key. so key must same data types. 
	Hashtable hm = new Hashtable();  // legacy and all methods are synchronized
	hm.put(2, "Ravi");
	hm.put(1, "Ramesh");
	hm.put(4, "Rajesh");
	//hm.put("a", "b");
	hm.put(6, "Ajay");
	System.out.println(hm);
	System.out.println("get value "+hm.get(2));
	System.out.println("get value "+hm.get(20));
	hm.put(2, "Balaji");// value replace if key already present 
	hm.put(10, "Ramesh");
	System.out.println(hm);
	System.out.println("Search key "+hm.containsKey(1));
	System.out.println("Search value "+hm.containsValue("Ramesh"));
	}

}
