package webkms;

public class Student {
	//멤버 변수
	private String stuNo;
	private String stuName;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private float avg;
	private char grade;
	
	private static int totalTot;
	
	// 생성자
	public Student(String stuNo,String stuName, int kor, int eng, int math) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setTot();
		setAvg();
		setGrade();
//		this.tot = this.kor + this.eng + this.math;
//		this.avg = this.tot /3f;
	}
	//
	public static int getTotalTot() {
		return totalTot;
	}
	//메서드
	public String getStuNo() {
		return this.stuNo;
	}
	public String getStuName() {
		return this.stuName;
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}
	public int getTot() {
		return this.tot;
	}
	public float getAvg() {
		return this.avg;
	}
	public char getGrade() {
		return this.grade;
	}
	
	public void setKor(int kor) {
		this.kor=kor;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public void setMath(int math) {
		this.math=math;
	}
	
	public void setTot() {
		this.tot = this.kor + this.eng + this.math;
	}
	public void setAvg() {
		this.avg = this.tot /3f;
	}
	public void setGrade() {
		switch ((int)(Math.floor(this.avg/10d))) {
		case 10:
		case 9:
			this.grade = 'A';
			break;
		case 8:
			this.grade = 'B';
			break;
		case 7:
			this.grade = 'C';
			break;
		case 6:
			this.grade = 'D';
			break;
		default:
			this.grade = 'F';
			break;
		}
		totalTot = this.tot;
	}
	//메서드
	public String toString() {
		return "Student [stuNo=" + this.stuNo + ", stuName=" + stuName + ", 국어=" + kor + ", eng=" + eng + ", math=" + math
				+ ", tot=" + tot + ", avg=" + avg + ", grade=" + grade + "]";
	}
	
}
