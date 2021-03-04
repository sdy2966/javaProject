package object2;

import java.util.Scanner;

public class LibrarayApplocation {
	public static void main(String[] args) {
		Boook[] booklist = new Boook[10];
		Member user = new Member();
		Scanner scn = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1)도서정보등록  2) 회원정보등록   3) 도서대여  4) 도서반납  5) 대여도서목록  9) 종료");
			System.out.println("----------------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scn.nextInt();
			if (selectNo != 1 && booklist == null) {
				System.out.println("도서정보를 먼저 등록하시오.");
				System.out.println();
				continue;
			}
			if (selectNo == 1) {
				for (int i = 0; i < booklist.length; i++) {
					System.out.println("도서정보>");
					
				}
			}else if (selectNo ==2) {
				for (int i=0; i< booklist.length; i++) {
					System.out.println("");
					
				}
			}

		}

	}

}
