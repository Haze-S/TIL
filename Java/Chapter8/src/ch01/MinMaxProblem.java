package ch01;

// 여러 개의 수가 배열에 있을 때 그 중 가장 큰 값과 가장 작은 값을 찾는다.
// 배열의 몇 번째에 있는지 순서를 찾는다.
// 반복문을 한번만 사용하여 문제를 해결한다.
// 수의 예 : [10, 55, 23, 2, 79, 101, 16, 82, 30, 45]


public class MinMaxProblem {

	public static void main(String[] args) {

		int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		
		int min = numbers[0];
		int max = numbers[0];
		
		int minPos = 0;
		int maxPos = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			
			if(min > numbers[i]) {
				min = numbers[i];
				minPos = i+1;
			}
			
			if(max < numbers[i]) {
				max = numbers[i];
				maxPos = i+1;
			}
		}
		System.out.println("max : " + max + "," + "position : " + maxPos);
		System.out.println("max : " + min + "," + "position : " + minPos);
	}

}
