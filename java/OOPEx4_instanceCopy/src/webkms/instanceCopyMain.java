package webkms;

public class instanceCopyMain {

	public static void main(String[] args) {
		Student s1 = new Student("24001","홍길동",80,98,77);
		s1.displayScore();
		
		// ????? 복사
		Student s2 = s1;
		s2.setKor(0);
		s1.displayScore();
		s2.displayScore();
		System.out.println("s1.hashCode: "+s1.hashCode());
		System.out.println("s2.hashCode: "+s2.hashCode());
		
		
		//깊은 복사 (생성자를 통해서 깊은 복사)
		Student originS3 = new Student("24002","둘리",80,98,77);
		Student deepcopyS3 = new Student(originS3);
		originS3.displayScore();
		deepcopyS3.displayScore();
		System.out.println("s1.originS3: "+s1.hashCode());
		System.out.println("s2.deepcopyS3: "+s2.hashCode());
		System.out.println("원본 수정 후....");
		originS3.setKor(20);
		originS3.displayScore();
		deepcopyS3.displayScore();
		System.out.println("s1.originS3: "+s1.hashCode());
		System.out.println("s2.deepcopyS3: "+s2.hashCode());
	}

}
