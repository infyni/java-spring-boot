package streamexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
class MyConsumer implements Consumer<String>{
	@Override
	public void accept(String t) {
		System.out.print(t+"===");
	}
}
public class StreamExamples {

	public static void main(String[] args) {
	List<String> names = new ArrayList<String>();
	names.add("Ravi");names.add("Vijay");names.add("Laximan");
	names.add("Rajesh");names.add("Raj");names.add("Reeta");
	names.add("Ajay");names.add("Vikash");names.add("Meeta");
	System.out.println(names);	// string format. 
	
	// retrieve the names using iterator. 
	System.out.println("Retrieve the names using iterator");
	Iterator<String> li = names.iterator();
	while(li.hasNext()) {
		System.out.print(li.next()+"-----> ");
	}
	System.out.println();
	// retrieve the names using stream api without lambda 
	Consumer<String> cc1 = new MyConsumer();
	names.stream().forEach(cc1);	// forEach takes consumer interface reference as parameter 
	
	// retrieve the names using stream api with lambda 
	System.out.println();
	names.stream().forEach(name->System.out.print(name+","));
	
	}

}
