package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutExample {

	public static void main(String[] args) throws IOException {//이미지 파일은 하나하나 바이트 타입으로 읽어와야헌다(FileInputStream)
		FileInputStream fis = new FileInputStream("C:/Temp/Dir/cap.PNG");
		FileOutputStream fos = new FileOutputStream("C:/Temp/Dir/copyARRRRRRy.PNG");
		
		int data = 0, cnt = 0;
		byte[] readBytes = new byte[100];//100바이트가 될떄까지는 작업을 하지 않겠다.
		while((data = fis.read(readBytes)) != -1) {
			fos.write(readBytes);
			cnt++;//몇번 반복했는지?
		}
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("===============end===============" + cnt);
	}

}
