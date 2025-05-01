package lambaexample;

@FunctionalInterface
interface Operation {
	public int add(int x, int y);
}
class OperationImp implements Operation {
	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		int sum = x+y;
		return sum;
	}
}
public class OperationExample {

	public static void main(String[] args) {
	// 1st way 
		// lambda expression by default return the value without return keyword. 
		Operation op1 = (x,y)->x+y;
		System.out.println("Addition of two number is "+op1.add(100, 200));
		// 2nd way 
		Operation op2 = (a,b)->a+b;
		System.out.println("Addition of two number is "+op2.add(1000, 2000));
		// 3rd way 
				Operation op3 = (int x,int y)->x+y;
				System.out.println("Addition of two number is "+op3.add(1000, 2000));
				
		// 4th way 
				Operation op4 = (int x,int y)->{
					int sum = x+y;
					return sum;
				};
				System.out.println("Addition of two number is "+op4.add(10000, 20000));
	}

}
