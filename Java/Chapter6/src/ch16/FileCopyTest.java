package ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {

		long millisecond = 0;
		
		try( BufferedInputStream fis = new BufferedInputStream(new FileInputStream("a.zip")) ;
				BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {
			
			millisecond = System.currentTimeMillis();
			
			int i;
			while( (i = fis.read() ) != -1) {
				fos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("소요시간 : " + millisecond);
	}

}
