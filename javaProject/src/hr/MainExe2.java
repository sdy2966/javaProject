package hr;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainExe2 {

	public static void main(String[] args) {
		// 정렬 급여기준
		EmpDAO dao = new EmpDAO();
		Set<Employee> set = dao.getEmps();// 전체리스트 Set저장.
		
		TreeSet<Employee> tset = new TreeSet<Employee>();//salary 저장. 트리셋ㅇ으ㄴ크다작다기준을 가짐
		
		Iterator<Employee> iter = set.iterator();
		while(iter.hasNext()) {
				tset.add(iter.next());//salary정렬되면서 저장 여기서 데베에서 가져온 것을 순위를 정
		}
		iter = tset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());//salary출력.
		
		}
	}

}
