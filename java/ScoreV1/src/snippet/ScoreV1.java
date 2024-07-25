package snippet;

import java.util.Iterator;

public class ScoreV1 {

	public static void main(String[] args) {
		// 성적표
		// 국어, 영어, 수학, 총점, 평균, 학점을 계산해서 출력하세요.
		
		String name = "홍길동";
		int kor = 80;
		int eng = 80;
		int math = 79;
		float sum = kor + eng + math;
		float avg = sum / 3f;
		System.out.println("이름:"+name);
		System.out.println("국어점수:"+ kor);
		System.out.println("수학점수:"+ eng);
		System.out.println("영어점수:" + math);
		System.out.println("총점수:" + sum);
		System.out.printf("평균:" + "%.2f", avg);
		System.out.println("");
		switch((int)(avg/10)) {
		case 10:
		case 9:
			System.out.println("학점은:A");
			break;
		case 8:
			System.out.println("학점은:B");
			break;
		case 7:
			System.out.println("학점은:C");
			break;
		case 6:
			System.out.println("학점은:D");
			break;
		default:
			System.out.println("학점은:F");
		}
		
		// 구구단, 별찍기
		for(int i =1 ;i<10;i++) {
			for(int j=1;j<10;j++) {
			System.out.println(i+"*"+j+ "=" +i*j);
			}
		}
		int tot = 0;
		int odd = 0;
		int even = 0;
		// 1~100까지 총합, 홀수 총합, 짝수 총합구하기
		for(int i=0;i<100;i++) {
			tot+=i;
			if(i%2==1){
				odd += i;
			}else {
				even += i;
			}
			
		}
		System.out.println("1~100까지 총합: "+ tot);
		System.out.println("1~100까지 홀수 총합: "+ odd);
		System.out.println("1~100까지 짝수 총합: "+ even);
		
		
		
		//숫자 -> 문자열
		String str1 = 3 + "";
		System.out.println(str1);
		
		String str2 = String.valueOf(10);
				System.out.println(str2);
		
		String str3 = String.valueOf(true);
		System.out.println(str3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
