import java.util.Arrays;

public class ArrayEx5 {

	public static void main(String[] args) {
		//문제5 1~45사이의 정수를 6개를 뽑아서 로또 번호를 생성한다.
		//[1,2,3,4,~,43,44,45,] 배열 생성
		int[]pool = new int[45];
		for(int i=0;i<pool.length;i++) {
			pool[i] = i+1;
		}
		System.out.println(Arrays.toString(pool));
		// 해당 배열 안에서 섞는다(shuffle).
		int temp = 0;
		
		for(int i=0;i<6;i++) {
			//랜덤한 인덱스 번호 추출 [0~44]
			int k = (int)(Math.random()*45);
			temp = pool[i];
			pool[i] = pool[k];
			pool[k] = temp;
		}
		System.out.println(Arrays.toString(pool));
		
		// 랜덤하게 섞인 배열안에서 숫자 6개를 뽑아낸다.
		for(int i=0;i<6;i++) {
			System.out.print(pool[i]+" ");
		}
		
	}
}

