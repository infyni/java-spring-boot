package inheritance;

public class Manager extends Employee{
private int numberOfEmp;

public void readMgr() {
	readEmp();// calling employee class method
	System.out.println("Enter the number of employee working under him/her");
	numberOfEmp = sc.nextInt();
	// addressclassobject.readAdd();
}
public void disMgr() {
	disEmp();   // calling employee class method 
	System.out.println("Nubmer of employee working "+numberOfEmp);
	//addressclassobject.disAdd();
}
}
