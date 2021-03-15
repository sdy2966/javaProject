package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentExample {
	public static void main(String[] args) {
		Map<Student, Integer> map= new HashMap<Student, Integer>();
		map.put(new Student(1, "홍길동"), 90);//해쉬코드랑 이꼴이 엉ㅎ게정의되냐에 따라서 중복을 같은 객체라고
		map.put(new Student(2, "김민수"), 85);
		map.put(new Student(1, "홍길동"), 42);//key값은 중복으로 들어 올 수 없다//다 다른 인스턴스~
		
		Set<Student> set = map.keySet();
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student student = iter.next();
			System.out.println(student.toString());
		}
	}

}
