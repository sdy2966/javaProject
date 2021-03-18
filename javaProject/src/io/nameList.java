package io;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class nameList {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/file2.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("파일이 저장 되었습니다.");
				//모르겟다
				
			
		

	}

}
