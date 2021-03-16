package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import hr.EmpDAO;
import hr.Employee;

public class IteratorExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hong");
		list.add("Kim");
		list.add("Shin");

		list = Arrays.asList("Hong", "Kim", "Park");

		for (String str : list) {
			System.out.println(str);
		}
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println(val);
		}

		Stream<String> stream = list.stream();

		stream.forEach((String t) -> {
			System.out.println(t);
		});

		stream = list.stream();
		int sum = stream.mapToInt(s -> s.length()).sum();

		EmpDAO dao = new EmpDAO();
		List<Employee> empList = dao.getEmpList();
		Stream<Employee>eStream = empList.stream();
		
		int sum2 = eStream.filter(new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				return t.getSalary() > 10000;
			}
		}).mapToInt(new ToIntFunction<Employee>() {
			@Override
			public int applyAsInt(Employee t) {
				return t.getSalary();
			}
		}).sum();
		System.out.println("급여가 10000이상인 사원들의 급여합계: " + sum2);
		
		
		List<Integer> intList = Arrays.asList(10, 20);

	}
}
