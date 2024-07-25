package webkms.emp;

import java.util.ArrayList;

public class Department {
	private int deptNo;
	private String deptname;
	private ArrayList<Employee> empList;
	
	Department(int deptNo, String deptName){
		this.deptNo=deptNo;
		this.deptname = deptName;
		this.empList = new ArrayList<Employee>();
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public ArrayList<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(ArrayList<Employee> empList) {
		this.empList = empList;
	}
	
	public void addEmployee(Employee e) {
		this.empList.add(e);
		
	}
	
	public void outputEntireEmployees(){
		for(Employee e : this.empList) {
			System.out.println(e.toString());
		}
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptname=" + deptname + ", empList=" + empList + "]";
	}
	
	
}
