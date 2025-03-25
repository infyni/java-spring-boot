package statickeyword;
class Employee {			// static memory only one copy 
	int empid;
	static int mgrid;
	void display() {
		System.out.println("empid "+empid);
		System.out.println("mgr id "+mgrid);
	}
}
public class AnotherStaticExample {

	public static void main(String[] args) {
		Employee emp1 = new Employee();		// heap memory 
		Employee emp2 = new Employee();		// another heap memory created 
		emp1.empid=100;
		emp1.mgrid=1;
		Employee.mgrid=2;
		emp2.empid=200;
		emp2.mgrid=3;
		Employee.mgrid=4;
		emp1.display();  //empid = 100, mgrid =4
		emp2.display();  // empid = 200, mgriid = 4;
	}

}
