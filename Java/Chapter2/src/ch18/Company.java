package ch18;


//�̱��� ���� (������ Ŭ���� Company)

public class Company { 

	private static Company instance = new Company(); // ������ ��ü
	
	private Company() {} // private���� �����ڸ� ���� �����Ϸ��� �ڵ����� default constructor�� ����� ���� ����

	public static Company getInstance() { // �ܺο��� Ŭ���� �̸����� ȣ���ؼ� ����� �� �ֵ��� static ����
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}

}
