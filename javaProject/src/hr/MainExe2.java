package hr;

import java.util.Iterator;
import java.util.TreeSet;

public class MainExe2 {
	public static void main(String[] args) {
		//정렬 급여기준...
		EmpDAO dao = new EmpDAO();
		Set<Employee> set = dao.getEmps();
		
//		TreeSet<Employee> tSet = (TreeSet<Employee>) dao.getEmps();
		Iterator<Employee> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
