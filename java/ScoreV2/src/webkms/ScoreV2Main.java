package webkms;

public class ScoreV2Main {

	public static void main(String[] args) {
		Student s1 = new Student("24001","홍길동",98,75,34);
		s1.displayScroe();
		System.out.println(s1.getKor());
		s1.setKor(100);
		s1.displayScroe();
		
		Student s2 = new Student("24002","이둘리",45,33,76);
		s2.displayScroe();
		s2.setEng(66);
		s2.displayScroe();
		
		Student s3 = new Student("24003","또치",45,73,57);
		//전체총점
		System.out.println("s1의 총점: "+s1.getTot());
		System.out.println("s2의 총점: "+s2.getTot());
		System.out.println("s3의 총점: "+s3.getTot());
		System.out.println("전체총점: "+Student.getTotalTot());
		
		//s2의 영어 점수 수정
	 System.out.println("s2의 영어 점수 수정");
	 s2.setKor(66);
	 s2.displayScroe();
	 System.out.println("s1의 총점: "+s1.getTot());
		System.out.println("s2의 총점: "+s2.getTot());
		System.out.println("s3의 총점: "+s3.getTot());
		System.out.println("전체총점: "+Student.getTotalTot());
	 
	}

}
