package io;

import java.io.Console;
//p1016
public class ConsoleExample {
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("아이디: ");
		String id = console.readLine();
		
		System.out.println("패스워드: ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);
		
		System.out.println("-----------------");
		

	}

}
