package collections;

import java.util.ArrayList;
import java.util.List;



public class BoardExample {
	public static void main(String[] args) {
		List<Board> boards = new ArrayList<Board>(50);
//		boards = new LinedList<>();
		Board b1 = new Board();
		b1.subject = "test";
		b1.content = "content";
		b1.writer = "user";
		Board b2 = new Board("java", "very good", "user2");
		Board b3 = new Board("java", "very good", "user2");
		
		boards.add(b1);
		boards.add(b2);
		boards.add(b3);
		boards.add(new Board("Javascript", "good", "user1"));
		
		String searchStr = "java";
		for (int i=0; i< boards.size(); i++) {
			if(subject.indexOf("java") != -1) {
				System.out.println(boards.get(i));
			} 
		}
		
		
	}

}
