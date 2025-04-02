package listexample;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListRetrive {

	public static void main(String[] args) {
	List<String> names = new ArrayList<String>();
	names.add("ravi");names.add("raj");names.add("ramesh");names.add("rajesh");names.add("ram");names.add("rahim");
	System.out.println(names);
	System.out.println("retrieve element using for each loop");
	for(String name:names) {
		System.out.println(name);
	}
	System.out.println("retrieve using list iterator - forwawrd direction");
	ListIterator<String> li = names.listIterator();
	while(li.hasNext()) {
		String name = li.next();
		System.out.println(name);
	}
	System.out.println("retrieve using list iterator - backward direction");
	while(li.hasPrevious()) {
		String name = li.previous();
		System.out.println(name);
	}
	}

}
