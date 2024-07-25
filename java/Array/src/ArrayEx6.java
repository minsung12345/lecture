import java.util.Arrays;

public class ArrayEx6 {

	public static void main(String[] args) {
		// 문제6) 1~9까지의 수를 shuffle한다. ->버블 정렬
		 int [] arr = new int[9];
		 for(int i=0;i<arr.length;i++) {
			 arr[i] = i+1;
		 }
		 int temp = 0;
		 for(int i=0;i<6;i++) {
				//랜덤한 인덱스 번호 추출 [0~9]
				int k = (int)(Math.random()*9);
				temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		 System.out.println(Arrays.toString(arr));
		 
		 for(int i=0;i<arr.length-1;i++) {
			 boolean isSort= false;
			 for(int j=0;j<arr.length-1-i;j++) {
				 if(arr[j]>arr[j+1]) {
							 temp = arr[j];
							 arr[j] = arr[j+1];
							 arr[j+1] = temp;
							 isSort =true;
				 }
		 
		 }
	}	
		 System.out.print(Arrays.toString(arr));
	}
}