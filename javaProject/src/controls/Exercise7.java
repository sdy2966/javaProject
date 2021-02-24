package controls;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scn = new Scanner(System.in);//ctl+shif+o 임포트 단축키
		 
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.ㅇㅖ금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.println("선택> ");
			int menu = scn.nextInt(); //숫자값을 읽어온다.
			if(menu == 1) { //예금기능
				System.out.println("입금액을 입력>>");
				balance = balance + scn.nextInt();//사용자 입력금
			} else if (menu == 2) { // 출금기능
				
			} else if (menu == 3) { // 잔고기능
				System.out.println("잔액은" + balance);
			} else if (menu == 4) { //반복문 종료
				System.out.println("종료");
				run = false;
			}
			
		}
	}

}
