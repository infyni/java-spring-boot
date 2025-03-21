package encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//id=100;
		//display();
		Employee emp1 = new Employee();
		//emp1.id=100;
		//emp1.name="Ravi";
		//emp1.salary=-45000;
		emp1.setValue(100, "Ravi", 12000); // helper method to set the value 
		emp1.display();
	}

}
