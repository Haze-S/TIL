package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest11 {

	public static void main(String[] args) {

		System.out.println("���ĺ��� ���� [Enter]�� ��������.");
		
		int i;
		
		try {
			InputStreamReader irs = new InputStreamReader(System.in); 
			// System.in�� ����Ʈ ������ ó���ϱ� ������ �ѱ��� ���� ������ �Ǵ� �� �����ϱ� ���� InputStreamReader�� ��. 
			// InputStreamReader�� ����Ʈ ������ ó���ϴ� ��Ʈ���� ��� ���� �� �ִ�.
			while((i = irs.read()) != '\n') {
				//System.out.println(i);
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
