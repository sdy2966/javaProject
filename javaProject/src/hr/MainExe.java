package hr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainExe {
	
	public static void sort(int[] iary) {
		Arrays.sort(iary);
		

	}
	
   public static void main(String[] args) {
      int[] intAry = null;
      intAry = new int[] {3, 8, 4};
      Arrays.sort(intAry);
      for (int i=0; i<intAry.length; i++) {
    	  System.out.println(intAry[i]);
      }
//	   Arrays.asList(3,8,4);
      List<Integer> aList = new ArrayList<> ();
      aList.add(3);
      aList.add(8);
      aList.add(4);
      aList.add(2);
      aList.add(1);
      aList.add(0);
      int temp = -1;
      for(int j = 0; j<aList.size() -1; j++) {
	      for(int i = 0; i<aList.size() -1; i++) {
	    	  if (aList.get(i) > aList.get(i+1)) {
	        	  temp = aList.get(i);
	        	  aList.set(i, aList.get(i+1));
	        	  aList.set(i+ 1, temp);
	          }
	      }
      }
	   
	   EmpDAO dao = new EmpDAO();
//      Employee[] empList = dao.empList();
      Set<Employee> set = dao.getEmps();
      System.out.println("salary가 5000이상인 사원정보>>");
      for(Employee emp : set) {
         if(emp != null && emp.getSalary() > 5000) {
            System.out.println(emp.toString());
         }
      }
   
      
//      EmpDAO dao = new EmpDAO();
//      Department[] deptList = dao.deptList();
//      List<Employee> empList = dao.getEmpList();
//      System.out.println("부서번호가 10이상인 부서정보>>");
//      for(Employee emp : empList) {
//         if(emp != null && emp.getSalary() >= 5000) {
//            System.out.println(emp.toString());
//         }
//      }
   }
}