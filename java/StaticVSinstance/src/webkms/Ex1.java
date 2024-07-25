package webkms;

import java.util.Arrays;

public class Ex1 {
	public static int sumNum(int[] aArr) {
		int sum = 0;
		for(int i=0;i<aArr.length;i++) {
			sum += aArr[i];
		}
		return sum;
	}

	public static float avgNum(int[] aArr) {
		float sum = 0;
		for(int i=0;i<aArr.length;i++) {
			sum += aArr[i];
		}
		return ((float)sum/aArr.length);
	}
	public static int minNum(int[] aArr) {
		int min = aArr[0];
		for(int i=1;i<aArr.length;i++) {
			if(min>aArr[i]) {
				min = aArr[i];
			}
		}
		return min;
	}
	public static int maxNum(int[] aArr) {
		int max = aArr[0];
		for(int i=1;i<aArr.length;i++) {
			if(max<aArr[i]) {
				max = aArr[i];
			}
		}
		return max;
	}
	public static int[] ascNum(int[] aArr) {
		int temp = 0;
		for(int i=0;i<aArr.length-1;i++) {
			 for(int j=0;j<aArr.length-1-i;j++) {
				 if(aArr[j]>aArr[j+1]) {
							 temp = aArr[j];
							 aArr[j] = aArr[j+1];
							 aArr[j+1] = temp;
				 }
		 
		 }
	}
		return aArr;
	}

	public static void main(String[] args) {
		int aArr [] = {1,2,3,4,5,6};
		
		System.out.println(sumNum(aArr));
		System.out.println(avgNum(aArr));
		System.out.println(minNum(aArr));
		System.out.println(maxNum(aArr));
		System.out.println(Arrays.toString(ascNum(aArr)));
	}

	

}
