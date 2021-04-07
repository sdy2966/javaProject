package study;

import java.util.Scanner;

public class wordChain2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = "끝말잇기";
		int count =0;
		String[] arr = new String[100];
		int i = 0;
		boolean sameWd = false;
		
		System.out.println("끝말잇기 시작~");
		System.out.println("단어를 입력해 주세요");
		
		while(true) {
			System.out.print(word+">> ");
			String inputWord = scanner.nextLine();
			char firWd = inputWord.charAt(0);
			char lastWd = word.charAt(word.length()-1);
			
			if(firWd==lastWd) {
				word = inputWord;
				arr[i] = inputWord;				
				i++;
				for(int j=0; j<i-1; j++) {
					if(arr[j].equals(inputWord)) {
						sameWd = true;					
						System.out.println("중복된 단어입니다.");
						word = arr[i-2];
						break;
					}
					
				}
			} else {
				count++;
				System.out.println(count + "번 틀렸습니다!");
				System.out.println("단어의 마지막 글자와 같은 글자로 시작하는 단어를 입력하세요");
			} if (count == 3) {
				System.out.println("게임 종료!");
				break;
			}
			
		}
	}

}
