package ch03;

public class InsertionSort {

//	Insertion Sort의 기본 개념은 이미 정렬된 상태의 요소에 새로운 요소를 추가할 때 정렬하여 추가하는 개념이다.(손안의 카드)
//	두 번째 요소 부터 이전 요소들과 비교하면서 insert 될 위치를 찾아가며 정렬하는 알고리즘
	
	public static void insertionSort(int[] arr, int count) {
		
		int i = 0, j = 0;
		int temp = 0;
		
		for(i = 1; i < count; i++) {
			temp = arr[i];
			j = i;
			while((j > 0) && arr[j-1] > temp) {
				arr[j] = arr[j-1];
				j = j - 1;
			}
			arr[j] = temp;
			
			System.out.println("반복 -" + i);
			printSort(arr,count);
		}
	}
	
	public static void printSort(int value[], int count) {
		
		int i = 0;
		for(i = 0; i < count; i++) {
			System.out.print(value[i] + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] arr = {80, 50, 70, 10, 60, 20, 40, 30};
		
		insertionSort(arr, 8);
		
	}

}
