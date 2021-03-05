package hr;

public class MainExe {
	public static void main(String[] args) {//메인메소드
		EmpDAO dao = new EmpDAO();
		Department[] dmtList= dao.dmtList();
		System.out.println("부서번호가 30이상인새럼");
		for (Department dmt :dmtList) {
			if(dmt != null && dmt.getDepartmentId() >=30) {
				System.out.println(dmt.toString());
			}
		}
	
	}

}


