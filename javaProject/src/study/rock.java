package study;

import java.util.Scanner;

public class rock {

	public static void main(String[] args) {
		int score = 0;
		 Scanner scanner = new Scanner(System.in);
		 
		 while(true) {
			 int random = (int)(Math.random()*3)+1;
			 System.out.println("가위바위보!");
			 System.out.println("=========================");
			 System.out.println(" 1. 가위 | 2. 바위 | 3. 보");
			 System.out.println("=========================");
			 System.out.print("선택> ");
			 int select = scanner.nextInt();
	
			 if (select == random) {
				 System.out.println("비김");
			 } else if( 
					 select == 2 && random ==1
					 || select == 3 && random == 2
					 || select == 1 && random == 3
					 ) {
				 System.out.println("이김");
				 score++;
			 } else {
				 System.out.println("짐");
			 }
			 System.out.println("user: " + select);
			 System.out.println("com: " + random);
			 if(score >= 3) {
				 System.out.println("완승!");
				 break;
				 
			 } 
			 
			 
		 }
		 
	}

}
