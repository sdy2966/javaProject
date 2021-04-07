package study;

import java.util.Scanner;

public class wordChain {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = "끝말잇기";
		int n =0;
		int count = 0;
		boolean sameWd = false;
		String[] arr = new String[100];
		
		System.out.println("끝말잇기 시작~");
		System.out.println("단어를 입력해 주세요");
		
		while(n==0) {
			System.out.print(word + ">> ");
			String inputWord = scanner.nextLine();
			char firWd = inputWord.charAt(0);//마지막 글자
			char lastWd = word.charAt(word.length()-1);//첫번째 글짜
//			stored[count] = word;
			
			if(firWd == lastWd) {
				word = inputWord;
				
			} else if(firWd != lastWd) {
				System.out.println("단어의 마지막 글자와 같은 글자로 시작하는 단어를 입력하세요");
			}
//			for(int i=0; i<count; i++) {
//			
//				sameWd = true;
//				break;
//			} if (sameWd) {
//				System.out.println(">> X");
//				System.out.println("이미 사용된 단어입니다.");
//				sameWd = false;
//			}
//			
//			inputWord = word;
//			count++;
//			System.out.println(count + "회");
//			} else if (word.equals("종료")) {
//				System.out.println("끝말잇기를 종료합니다.");
//				n = 1;
//			} else {
//				
//			}
		}

	}

}
