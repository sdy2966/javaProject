package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamExample {
	public static void main(String[] args) throws IOException {
		try {
			InputStream is = new FileInputStream("C:/Dev/git/javaProject/javaProject/srt/io/FileExample.java");
					int data = 0;
					int cnt = 0;
					byte[] readBytes = new byte[100];
					while((data = is.read(readBytes)) != -1) {
						System.out.println(data);
						cnt++;				
					}
					
					is.close();
					System.out.println();
					System.out.println(cnt + "반복");
					System.out.println("====================end=====================");
		}
		
	}
	

}


