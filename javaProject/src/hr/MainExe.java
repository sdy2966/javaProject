package hr;

public class MainExe {
	public static void main(String[] args) {//���θ޼ҵ�
		EmpDAO dao = new EmpDAO();
		Department[] dmtList= dao.dmtList();
		System.out.println("�μ���ȣ�� 30�̻��λ���");
		for (Department dmt :dmtList) {
			if(dmt != null && dmt.getDepartmentId() >=30) {
				System.out.println(dmt.toString());
			}
		}
	
	}

}


