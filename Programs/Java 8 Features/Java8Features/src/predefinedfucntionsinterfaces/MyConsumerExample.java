package predefinedfucntionsinterfaces;

import java.util.function.Consumer;

class MyConsumer implements Consumer<String>{
	@Override
	public void accept(String t) {
		System.out.println("your name is "+t);
	}
}
public class MyConsumerExample {

	public static void main(String[] args) {
	// without lambda 
		Consumer<String> c1 = new MyConsumer();
		c1.accept("Ravi");
		
		// with lambda 
		Consumer<String> c2 = (name)->System.out.println("Your name in lambda style is "+name);
		c2.accept("Ajay");
	}

}
