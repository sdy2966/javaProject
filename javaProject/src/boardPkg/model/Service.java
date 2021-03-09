package boardPkg.model;

public interface Service {
	public Board[] getBoardList();//전체목록
	public Board getBoard(int boardNo);//한건조회
	public void createBoard(Board board);//게시글 작성
	public void modifyBoard(Board board);//글수덩
	public void removeBoard(Board board);//글삭제
	
}
