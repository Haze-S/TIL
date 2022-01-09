package ch17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	
	String name;
	transient String job;
	
	public Person() {}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
}

public class SerializationTest {

	public static void main(String[] args) {

		Person personLee = new Person("이순신", "대표이사");
		Person personKim = new Person("김유신", "상무");
		
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
			oos.writeObject(personKim);
		} catch (IOException e){
			System.out.println(e);
		}
		
		try(FileInputStream fos = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fos)){
			
			Person pLee = (Person)ois.readObject();
			Person pKim = (Person)ois.readObject();
			
			System.out.println(pLee);
			System.out.println(pKim);
			
		} catch (IOException e){
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
	}

}
