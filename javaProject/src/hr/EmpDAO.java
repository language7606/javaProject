package hr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class EmpDAO {
	Connection conn = null;

	public EmpDAO() {
		String path = "config/database.properties";
		Properties prop = new Properties();
		FileReader fr = null;
		try {
			fr = new FileReader(path);
			try {
				prop.load(fr);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String passwd = prop.getProperty("pass");

		conn = DBUtil.getConnection(url, user, passwd);
	}

	public Map<String, String> getJobList() {
		String sql = "select * from jobs";
		Statement stmt = null;
		ResultSet rs = null;
		Map<String, String> map = new HashMap<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				map.put(rs.getString("job_id"), rs.getString("job_title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, conn);
		}
		return map;
	}
	public Department[] deptList() {
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "select * from departments";
		Department[] departments = new Department[100];
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Department dep = new Department();
				dep.setDepartmentId(rs.getInt("department_id"));
				dep.setDepartmentName(rs.getString("department_name"));
				dep.setManagerId(rs.getInt("manager_id"));
				dep.setLocationId(rs.getInt("location_id"));
				// System.out.println(emp.toString());
				// System.out.println("------------------------------");
				departments[i++] = dep;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}
		System.out.println("메소드 호출 완료");
		return departments;
	}


	public List<Employee> getEmpList() {
		String sql = "select * from emp_java";
		List<Employee> list = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()){
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFristName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp);				
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt,  conn);
		}
		System.out.println("메소드 호출 완료");
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
				emp.setEmail(rs.getString("email"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFristName(rs.getString("first_name"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setLastName(rs.getString("last_name"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setSalary(rs.getInt("salary"));
				// System.out.println(emp.toString());
				// System.out.println("------------------------------");
				employees[i++] = emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}
		System.out.println("메소드 호출 완료");
		return employees;
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
}

