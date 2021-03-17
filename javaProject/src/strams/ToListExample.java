package strams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import hr.EmpDAO;
import hr.Employee;

public class ToListExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hong","Hwang", "bak");
		//stream 중간처리 최종집계한 결과흫 다시 List<String>
		Collectors<String, ?, Set<String>> col = Collectors.toList();
		
		List<String> newList = list.stream()////Stream<String>
		.filter(s -> s.startsWith("H")) //Stream<String>
		.collect(Collectors.toList());
		
		
		
		System.out.println("=====================================");
		EmpDAO dao = new EmpDAO();
//		dao.getEmpList();
		Set<Employee> emps = dao.getEmps();//Set<Employee>
		List<Employee> empList = emps.stream() // 직무가 IT_PROG인 사람들을 가져와서 List<Employee>에 담으라
		.filter(new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				return t.getJobId().equals("IT_PROG");
			}
		})//Stream<Employee>
		.collect(Collectors.toList());
		
		empList.stream().forEach(s -> System.out.println(s));
		
		for (String str: list) {
			System.out.println(str);
		}

	}

}
