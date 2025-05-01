package lambaexample;
interface Sample {
	void display();
	//void display1();
}
class SampleImp implements Sample {
	@Override
	public void display() {
		System.out.println("provide body for Sample interface method in SampleImp class");
	}
//	@Override
//	public void display1() {
//		System.out.println("provide body for Sample interface method in SampleImp class");
//	}
}
public class LambdaExpressionExample {

	public static void main(String[] args) {
		// 1st way. provide the body for any interface method 
		// we were/are using separate class and that class 
		// need to provide the body.
		Sample ss1 = new SampleImp();
		ss1.display();
		// 2nd way using anonymous class 
		Sample ss2 = new Sample() {
			@Override
			public void display() {
				System.out.println("provide body for Sample interface method using anonymous class");
			}
			
//			@Override
//			public void display1() {
//				System.out.println("provide body for Sample interface method in SampleImp class");
//			}
		};
		ss2.display();
		// 3rd way using lambda expression like anonymous method 
		Sample ss3 = ()->System.out.println("Providing body for Display using lamda style");
		ss3.display();
	}

}
