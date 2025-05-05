package predefinedfucntionsinterfaces;

import java.util.function.Function;

class MyFunction implements Function<Integer, String>{
	@Override
	public String apply(Integer t) {
		return "You pass the number as "+t;
	}
}
public class MyFunctionExample {

	public static void main(String[] args) {
	// without lambda expression we need to write this way logic. 
	Function<Integer, String> f1 = new MyFunction();
	System.out.println(f1.apply(100));
	
	// using lambda expression 
	Function<Integer, String> f2 = (t)->"You pass number as in lambda style "+t;
	System.out.println(f2.apply(200));
	}

}
