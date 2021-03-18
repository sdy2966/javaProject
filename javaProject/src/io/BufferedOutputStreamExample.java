package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream("C:/Dev/git/javaProject/javaProject/src/io/cap.PNG");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/Dir/cap.PNG");
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {fos.write(data);}
		
		fos.flush();
		end = System.currentTimeMillis();
		fos.close(); bis.close();
		System.out.println("사용하지 않았을때: " + (end-start) + "ms");
		
		fis = new FileInputStream("C:/Dev/git/javaProject/javaProject/src/io/cap.PNG");
		
		
		
				
		
	

	}

}
