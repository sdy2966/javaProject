package controls;

import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		boolean run = true;
		int studenNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();
			if(selectNo !=1 && scores == null) {
				System.out.println("학생수를 먼저 입력하세요");
				System.out.println();
				continue;
			}
			if (selectNo == 1) {  //배열의 크기
				int
				for(int i =0; i<scores.length; i++) {
					System.out.println("학생수> ");
					int studentNum = scanner.nextInt();
					scores = new int[studentNum];
			} else if (selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i +"]>");
					scores[i] = scanner.nextInt();
				}
                                              
			} else if (selectNo == 3) {

			} else if (selectNo == 4) {

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}