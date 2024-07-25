package webkms.emp;

public class PartTimeWorker extends Employee{
	private int workTime; //근무시간
	private int payPerHour; //시급
	
	public PartTimeWorker(){
		
	}
	public PartTimeWorker(String empNo, String eName, int deptNo, int workTime, int payPerHour){
		super(empNo,eName,deptNo,0);
		this.workTime = workTime;
		this.payPerHour = payPerHour;
	}
	
	@Override
	public int calSalary() { 
		
		return this.workTime * this.payPerHour;
	}

}
