package hr;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Set;

public class EmpDAO {
	Connection conn = null;

	EmpDAO() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "hr";
		conn = DBUtil.getConnection(url, user, passwd);
	}

	public Department[] dmtList() {
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "select * from departments";
		Department[] Departments = new Department[100];
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Department dmt = new Department();
				dmt.setDepartmentId(rs.getInt("department_id"));
				dmt.setDepartmentname(rs.getString("department_name"));
				dmt.setManagerid(rs.getInt("manager_id"));
				dmt.setLocationid(rs.getInt("location_id"));
//				System.out.println(emp.toString());
				Departments[i++] = dmt;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}
		System.out.println("메소드 호출 완료.");
		return Departments;
	}

	public Set<Employee> getEmps() {
		return null;
	}

	public List<Employee> getEmapList() {
		String sql = "select *from emp_java";
		List<Employee> list = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			Employee emp = new Employee();
			emp.setEmployeeId(rs.getInt("employee_id"));
			emp.setFirstname(rs.getString("first_name"));
			emp.setLastname(rs.getString("last_name"));
			emp.setSalary(rs.getInt("salary"));
			list.add(emp);
		}
	} catch (SQLException e) {
		e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, conn);
		}
		System.out.println("메소드 호출 완료.");
		return list;
	}

	public Employee[] empList() {

		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "select * from emp_java";
		Employee[] employees = new Employee[100];
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmail(rs.getNString("email"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstname(rs.getString("first_name"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setLastname(rs.getNString("last_name"));
				emp.setPhoneNumber(rs.getNString("phone_number"));
				emp.setSalary(rs.getInt("salary"));
//				System.out.println(emp.toString());
				employees[i++] = emp;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}
		System.out.println("메소드 호출 완료.");
		return employees;
	}
}
