import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
//		char[] charArr;
//		charArr = new char[3]; // 정의(생성)
		
		char[] charArr1 = new char[3];		
		
		//지역변수는 초기화를 하지 않으면 사용하지 못함.
		int a;//The local variable a may not have been initialized
//		System.out.println(a);
		
		int[] scores = new int[3];//객체는 자동 초기화된다. [0,0,0]
		System.out.println(scores); //[I@103f852 <= 타입@주소 (16진수)
		
		String[] names = new String[5]; //null로 자동 초기화된다.
		System.out.println(names); //[Ljava.lang.String;@587c290d
		
		boolean isOk[] = new boolean[2];
		System.out.println(isOk);
		
		//배열에 요소에 값 할당
		scores[0] = 45;
		scores[1] = 23;
		scores[2] = 100;
		
		System.out.println(scores[2]);
//		scores[3] = 50;
//		System.out.println(scores[3]);// 배열의 인덱스 범위 벗어남. - 런타임 에러
		
		//배열의 크기를 변경
		//1. 더 큰 배열을 새로 생성
		//2. 기존 배열의 내용을 새로운 배열에 복사
		scores = new int[4];
		System.out.println("scores[4] : "+scores.hashCode());
		
//		scores = new char[4]; //초기 배열의 타입과 다른 타입으로 할당이 불가하다.
		int[] scores2 = {100,20,30,55,25};
		System.out.println(Arrays.toString(scores2));
		
		String[] heroes = {"아이언맨","스파이더맨","헐크"};
		// 출력방법
		for(int i = 0; i <heroes.length;i++) {
			System.out.println(heroes[i]);
		}
		
		//확장 for문 (forEach문)
		for (String hero : heroes) {
			System.out.println(hero);
		
		}
		
		//2차원 배열의 선언과 생성
		int [][] arr1 = {{1,2,3},{3,4,6}};
		
		for(int r = 0; r< arr1.length;r++) {
			for(int c=0; c<arr1[r].length;c++) {
				System.out.print(arr1[r][c]+" ");
			}
			System.out.println();
		}
		
		//arr 배열에 1부터 1씩 증가된 값을 요소에 할당
		//int[][] arr = new int[3][4];
		int[][] arr = new int[3][4];
		int k = 1;
		for(int i =0; i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				arr[i][j]=k;
				System.out.print(arr[i][j]);
				k++;
			}
			System.out.println();
		}
		//학생 4명의 국어, 영어, 수학 점수를 입력받아서 2차원 배열에 저장하고, 출력하세요.
		//각 학생의 총점, 평균을 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 >>>>");
		int cntStudent = sc.nextInt();
		
		//학생 2차원 Stirng타입의 배열 생성
		String[][] students = new String[cntStudent][6];
		
		sc.nextLine();
		for(int i = 0; i < cntStudent;i++) {
			System.out.print(i+1 +"번째 학생의 이름>>>");
			students[i][0]=sc.nextLine();
			System.out.print(i+1 +"번째 학생의 국어점수>>>");
					students[i][1]=sc.nextLine();
			System.out.print(i+1 +"번째 학생의 수학점수>>>");
					students[i][2]=sc.nextLine();
			System.out.print(i+1 +"번째 학생의 영어점수>>>");
					students[i][3]=sc.nextLine();
			int studentSum = Integer.parseInt(students[i][1]) + Integer.parseInt(students[i][2]) + Integer.parseInt(students[i][3]);
			students[i][4] = String.valueOf(studentSum);
			students[i][5] = String.valueOf(studentSum /3f);
		}
		
		//student 배열 출력
		System.out.println("이 름\t 국어\t 영어\t 수학\t 총점\t 평균\t");
		System.out.println("------------------------------------------");
		for (int r = 0 ; r<cntStudent;r++) {
			for(int c = 0 ; c < students[r].length; c++) {
				System.out.print(students[r][c]+"\t");
				
			}
			System.out.println();
		}
		}
		
		
 	}


