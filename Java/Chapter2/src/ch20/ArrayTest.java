package ch20;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[10]; // new 키워드를 이용하면 초기화됨
		int total = 0;
		
		for(int i = 0, num = 1; i < arr.length; i++) {
			arr[i] = num++;
			System.out.println(arr[i]);
		}
		for(int num : arr) { 
			total += num;
		}
		// 향상된 for문, for(변수 : 배열){} 
		// 배열의 n개 요소를 0부터 n-1까지 순차적으로 순회할 때 간단하게 사용할 수 있다.
		System.out.println(total);
	}

}
