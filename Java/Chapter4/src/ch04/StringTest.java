package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("java.lang.String");
		
		// 리플렉션 프로그램
		// 주로 로컬에 오브젝트가 없을 때, 리모트에 있는 오브젝트 클래스를 인보케이션?? 시킬 때 사용한다.
		
		Constructor[] cons = c.getConstructors();
		for(Constructor co : cons) {
			System.out.println(co);
		}
		
		Method[] m = c.getMethods();
		for(Method mth : m) {
			System.out.println(mth);
		}
	}
}
