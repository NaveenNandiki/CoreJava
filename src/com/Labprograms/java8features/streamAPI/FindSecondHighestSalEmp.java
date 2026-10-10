package com.Labprograms.java8features.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	double sal;
	String deptname;

	public Employee(int id, String name, double sal, String deptname) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.deptname = deptname;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSal() {
		return sal;
	}

	public String getDeptname() {
		return deptname;
	}

	public String toString() {
		return "[" + this.getId() + ":" + this.getName() + ":" + this.getDeptname() + ":" + this.getSal() + "]";
	}

	public Collectors stream() {
		// TODO Auto-generated method stub
		return null;
	}

}

public class FindSecondHighestSalEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101, "nani", 20000, "Dev");
		Employee emp2 = new Employee(102, "kiran", 30000, "Testing");
		Employee emp3 = new Employee(103, "jayanth", 40000, "Design");
		Employee emp4 = new Employee(104, "raju", 50000, "Dev");
		Employee emp5 = new Employee(105, "tharun", 60000, "Dev");
		Employee emp6 = new Employee(106, "praveen", 70000, "Testing");
		Employee emp7 = new Employee(107, "sasi", 80000, "Design");
		Employee emp8 = new Employee(108, "siva", 90000, "Deploy");

		ArrayList<Employee> emps = new ArrayList<>(Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8));
//		Optional<Employee> maxemp = emps.stream()
//				.sorted(Comparator.comparing((Employee emp) -> emp.getSal()).reversed()).skip(4).findFirst();
//		System.out.println(maxemp.get());
//
//		emps.stream().sorted(Comparator.comparing((Employee emp) -> emp.getSal()).reversed()).skip(4).limit(34)
//				.forEach(e -> System.out.println(e));
//		System.out.println(maxemp.get());

		Map<String, List<Employee>> empgroups = emps.stream().collect(Collectors.groupingBy(emp -> emp.getDeptname()));
//		System.out.println(empgroups);
		for (Entry emp : empgroups.entrySet()) {
			System.out.println(emp.getKey());
			System.out.println(emp.getValue());
			System.out.println("============================================");
		}
		for (Entry emp : empgroups.entrySet()) {
			System.out.println(emp.getKey());
			List<Employee> e = (List<Employee>) emp.getValue();
			System.out.println(e.stream().collect(Collectors.averagingDouble(x -> x.getSal())));
			double c = e.stream().collect(Collectors.averagingDouble(x -> x.getSal()));
			System.out.println("*******************************");
		}

	}

}
