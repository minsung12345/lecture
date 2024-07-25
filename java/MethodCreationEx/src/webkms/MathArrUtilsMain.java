package webkms;

import java.util.Arrays;

public class MathArrUtilsMain {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("sum : " + MathArrUtils.sum(arr));
		System.out.println("avg : " + MathArrUtils.average(arr));
		System.out.println("min : " + MathArrUtils.min(arr));
		System.out.println("max : " + MathArrUtils.max(arr));
		System.out.println("sort : " + Arrays.toString(MathArrUtils.sort(arr)));
	}

}
