package hr;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainExe {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();

		Map<String, String> map = dao.getJobList();
		map.keySet();
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> iter = set.iterator();
		while (iter.hasNext()) {
			Entry<String, String> ent = iter.next();
			System.out.println("jobId: " + ent.getKey() + " jobTitle: " + ent.getValue());
		}
	}
}

//		Employee[] empList = dao.empList();
//		System.out.println("salary가 5000 이상인 사원정보>>");
//		for (Employee emp : empList) {
//			if (emp != null && emp.getSalary() > 5000) {
//				System.out.println(emp.toString());
//		EmpDAO dao = new EmpDAO();
//		Department[] deptList = dao.deptList();
//		System.out.println("사원번호가 100 이상인 사원정보>>");
//		for (Department dep : deptList) {
//			if (dep != null && dep.getDepartmentId() > 100) {
//				System.out.println(dep.toString());
//			}
//		}
