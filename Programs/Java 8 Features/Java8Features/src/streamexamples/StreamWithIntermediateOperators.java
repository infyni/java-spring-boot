package streamexamples;

import java.util.ArrayList;
import java.util.List;

public class StreamWithIntermediateOperators {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ravi");names.add("Vijay");names.add("Laximan");
		names.add("rajesh");names.add("Raj");names.add("Reeta");
		names.add("Ajay");names.add("Vikash");names.add("Meeta");
		System.out.println(names);	// string format. 
		
		// Display all names one by one using stream
		//names.stream().forEach(name->System.out.print(name+" "));
		
		// display all names in upper case with help of map intermediate operator or method
		//names.stream().map(name->name.toUpperCase()).forEach(name->System.out.print(name+" "));
		
		// display only those names which contains ee character with filter intermediate operator 
		
		//names.stream().filter(v->v.contains("ee")).forEach(name->System.out.print(name+" "));
		// display only those names which start with r character 
		//names.stream().map(m->m.toLowerCase()).filter(v->v.startsWith("r")).forEach(name->System.out.print(name+" "));
		
		// applying two map operators 
		names.stream().map(m->m.toLowerCase()).map(m->"Welcome user "+m).forEach(v->System.out.println(v+" "));
	}

}
