package webkms.emp;

public class FullTimeEmployee extends Employee{
	public FullTimeEmployee(String empNo, String eName, int deptNo, int salary) {
		super(empNo, eName, deptNo, salary);
	}
	@Override
	public int calSalary() {
		return super.salary;
	}
//	public String toString() {
//		return "FullTimeEmployee"+
//	}

}
