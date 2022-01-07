package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
//		for(int num : arr) {
//			System.out.println(num);
//		}
		
		IntStream is = Arrays.stream(arr);
		is.forEach(n -> System.out.println(n));
		
		int sum = Arrays.stream(arr).sum();   // 이미 연산이 끝난 stream은 재사용이 불가하여 다시 stream으로 생성해야 한다.
		System.out.println(sum);
	}

}
