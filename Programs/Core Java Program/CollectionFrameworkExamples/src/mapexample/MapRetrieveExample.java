package mapexample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapRetrieveExample {

	public static void main(String[] args) {
		Map<Integer, String> info = new HashMap<Integer, String>();
		info.put(1, "ravi");
		info.put(2, "ramesh");
		info.put(3, "rajesh");
		System.out.println(info);
		Set<Integer> keys = info.keySet();	// converting map keys to set 
		Iterator<Integer> li = keys.iterator();
		while(li.hasNext()) {
			int key = li.next();
			System.out.println("key is "+key+" Value "+info.get(key));
		}
	}

}
