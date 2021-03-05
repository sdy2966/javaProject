package hr;

public class Department {
	private int departmentId; // 오라클에서는 대소문자를 구분하지않으니 _를 사용
	private String departmentname;
	private int managerid;
	private int locationid;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public int getManagerid() {
		return managerid;
	}

	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}

	public int getLocationid() {
		return locationid;
	}

	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentname=" + departmentname + ", managerid="
				+ managerid + ", locationid=" + locationid + "]";
	}

}
