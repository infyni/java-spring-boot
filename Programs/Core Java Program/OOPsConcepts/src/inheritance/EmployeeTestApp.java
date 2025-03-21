package inheritance;

public class EmployeeTestApp {

	public static void main(String[] args) {
		System.out.println("Employee details");
		Employee emp1 = new Employee();
		emp1.readEmp();
		emp1.disEmp();
		System.out.println("Manager details");
		Manager mgr1 = new Manager();
		//mgr1.readEmp();
		mgr1.readMgr();
		
		//mgr1.disEmp();
		mgr1.disMgr();
	}

}
