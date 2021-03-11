package boardPkg.control;

import java.util.Scanner;

import boardPkg.model.Board;
import boardPkg.model.Service;
import boardPkg.model.impl.ServiceImpl;

public class BoardMain {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int menu = 0;
		Service service = new ServiceImpl();

		while (true) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.입력 | 2. 수정  | 3. 삭제  | 4. 조회 | 5. 리스트 | 6. 종료");
			System.out.println("----------------------------------------------------------");
			System.out.println("선택> ");
			menu = scn.nextInt();
			if (menu == 1) { // 입력처리
				System.out.println("게시글 번호 입력> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.println("제목을 입력하시오> ");
				String title = scn.nextLine();
				System.out.println("내용입력> ");
				String content = scn.nextLine();
				System.out.println("작성자> ");
				String writer = scn.nextLine();
				Board board = new Board(boardNo, title, content, writer, null);
				service.createBoard(board);
			

			} else if (menu == 2) { // 게시글번호, 내용수정
				System.out.println("게시글 번호 입력> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.println("내용입력> ");
				String content = scn.nextLine();
				
				Board board = new Bo ard(boardNo, null, content, null, null);
				service.modifyBoard(board);

			} else if (menu == 3) { // 삭제
				System.out.println("게시글 번호 입력> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				
				Board board = new Board(boardNo, null, null, null, null);
				service.removeBoard(board);
				
			} else if (menu == 4) {// 조회
				System.out.println("게시글 번호 입력> ");
				int boardNo = scn.nextInt();
				scn.nextLine();
				Board board = service.getBoard(boardNo);
				System.out.println(board.toString());
				
			} else if (menu == 5) {// 리스트
				Board[] list = service.getBoardList();
				for (Board bo : list) {
					if (bo != null) {
						System.out.println(bo.toString());
					}
		
				}
			} else if (menu == 6) {// 종료
				break;
			} else {
				System.out.println("d");
			}
		}//end of while
		System.out.println("프로그램 종료.");
		
		
//		Service service = new serviceImpl2();
//		service.getBoard(15);
//		service.getBoardList();
//
//		Board[] list = service.getBoardList();
//		for (Board bo : list) {
//			if (bo != null) {
//				System.out.println(bo.toString());
//			}
//
//		}

//		BoardDAO dao = new BoardDAO();
//		dao.selectBoards();
//		

	}//end of main
}
