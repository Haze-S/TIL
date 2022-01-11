package ch02;

public class BinarySearchProblem {

	// ���� ���� ���� ���ĵ� ������ ���� �� Ư���� ���� ã�� ���
	// �ܼ� �ݺ����� �̿��ϸ� ���� ������ ���� �� Ƚ���� �����ϴ� O(n)�� ������ �̷������.
	// ���� ���ĵ� ���¿����� ���� Ž��(binary search)�� �̿��ϸ� �Ź� �񱳵Ǵ� ����� ���� �������� ���ҵ� �� �����Ƿ� O(logN)�� �������� ���ϴ� ���� ã�� �� �ִ�.
	// ���� �� : [12, 25, 31, 48, 54, 66, 70, 83, 95, 108]
	// 83�� ��ġ�� ã�ƺ�����
	
	// ���� ���ĵ� �����̹Ƿ� �߰��� ���� �ϳ� ������ �� ã������ ���� �׺��� ũ�� ������ ����������, ������ �������� ���� ���� �� �ִ�.
	// �ѹ� ���� �� ���� 1/2�� ������ ��������.
	public static void main(String[] args) {

		int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
		
		int target = 83;
		int left = 0;
		int right = numbers.length - 1;
		int mid = (left + right) / 2;
		
		int temp = numbers[mid];
		boolean find = false;
		
		while(left <= right) {
			
			if(target == temp) {
				find = true;
				break;
			}
			else if(target < temp) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
			
			mid = (left + right) / 2;
			temp = numbers[mid];
		}
		
		if(find == true) 
		{
			mid++;
			System.out.println("ã�� ���� " + mid + "��° �ֽ��ϴ�.");
		}
		else System.out.println("ã�� ���� �����ϴ�.");

	}

}
