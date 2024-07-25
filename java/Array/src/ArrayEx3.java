import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx3 {
	public static void main(String[] args) {
		//난수
//		System.out.println(Math.random());
		
		//문제 4 int배열에 1~100의 난수 20개를 넣어놓고
//		유저에게 찾을 숫자를 입력받아
//		출력 예) 찾는 값은 n번째에 있습니다
		int[] ar = new int[20];
		
		for(int i =0;i<ar.length;i++) {
			ar[i] = (int)(Math.random()*100+1);
		}
		System.out.println(Arrays.toString(ar));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 숫자 >>>");
		int searchNum = sc.nextInt();
		
		int i =1;
		boolean isFind = false;
		for(int num : ar) {
			if(num == searchNum) {
				isFind = true;
				System.out.println("찾는 값"+searchNum+"은"+i+"번째에 있습니다.");
				
			}
			i++;
		}
		
		if(isFind == false) {
			System.out.println(searchNum+"을 찾을 수 없습니다.");
		}
		
		
	}
}
