package webkms.emp;

public abstract class Employee {
 private String empNo;
 private String eName;
 private int deptNo;
 protected int salary;

 public Employee() {
}
 public Employee(String empNo, String eName, int deptNo, int salary){
	 this.empNo = empNo;
	 this.eName = eName;
	 this.deptNo=deptNo;
	 this.salary = salary;
 }
 
 public void setEmpNo(String empNo) {
	this.empNo = empNo;
}

public void setEname(String eName) {
	this.eName = eName;
}

public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}


public String getEmpNo() {
	return empNo;
}

public String getEname() {
	return eName;
}

public int getdeptNo() {
	return deptNo;
}

//정규직과 알바직 사원의 급여 계산 방법이 다르므로 abstracte메서드로 만든다
 public abstract int calSalary();
@Override
public String toString() {
	return "Employee [empNo=" + empNo + ", eName=" + eName + ", deptNo=" + deptNo + ", salary=" + salary + "]";
}





}

