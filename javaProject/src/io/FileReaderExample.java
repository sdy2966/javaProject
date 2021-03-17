package io;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
//		FileReader fr =new FileReader("C:/Dev/git/javaProject/javaProject/srt/io/FileReaderExample.java");
//		int readCharNo;
//		char[] cbuf = new char[100];
//		while ((readCharNo = fr.read(cbuf)) != -1) {
//			String data new String(cbuf,0,readCharNo);
//			System.out.println(data);
//		}
//		---------------------------------------------
		int data = 0;
		char[] readChars = new char[100];
		FileReader fr =new FileReader("C:/Dev/git/javaProject/javaProject/src/io/FileReaderExample.java");
		FileWriter fw =new FileWriter("C:/Temp/Dir/file1.txt");
		while ((data = fr.read(readChars)) != -1) {
		String readLines = new String(readChars, 0, data);//0번째부터 읽어온 크기 마안큼 뭐 대상에서 제외하겠다????
//			System.out.println(new String(readChars));
		fw.write(readLines);
		}
		
		fw = new FileWriter("C:/Temp/Dir/emp.txt");
		fw.write(readChars);		
		
		fw.flush();
		fw.close();
		fr.close();
			
		System.out.println("end........");
		

	}

}
