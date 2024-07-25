package webkms.emp;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Department 아이티부서 = new Department(10, "IT");
		아이티부서.addEmployee(new FullTimeEmployee("24001", "강백호", 10, 2000000));
		아이티부서.outputEntireEmployees();
		
		Employee 채치수 = new FullTimeEmployee("24002","채치수",10,2000000);
		아이티부서.addEmployee(채치수);
		아이티부서.outputEntireEmployees();
		
	}

}
