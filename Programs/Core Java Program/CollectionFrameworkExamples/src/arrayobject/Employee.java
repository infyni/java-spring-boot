package arrayobject;

public class Employee {
private int eid;
private String ename;
private float salary;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}

public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Employee class object created with empty");
}
public Employee(int eid, String ename, float salary) {
	super();
	System.out.println("Employee class object created with parameter");
	this.eid = eid;
	this.ename = ename;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
}


}
