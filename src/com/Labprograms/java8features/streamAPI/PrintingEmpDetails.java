package com.Labprograms.java8features.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
	int id;
	String name;
	double sal;
	String deptname;

	public Employee1(int id, String name, double sal, String deptname) {
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

public class PrintingEmpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Employee1 emp1 = new Employee1(101, "nani", 20000, "Dev");
		Employee1 emp2 = new Employee1(102, "kiran", 30000, "Testing");
		Employee1 emp3 = new Employee1(103, "jayanth", 40000, "Design");
		Employee1 emp4 = new Employee1(104, "raju", 50000, "Dev");
		Employee1 emp5 = new Employee1(105, "tharun", 60000, "Dev");
		Employee1 emp6 = new Employee1(106, "praveen", 70000, "Testing");
		Employee1 emp7 = new Employee1(107, "sasi", 80000, "Design");
		Employee1 emp8 = new Employee1(108, "siva", 90000, "Deploy");

		ArrayList<Employee1> emps = new ArrayList<>(Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8));
		emps.stream().forEach(System.out::println);
		System.out.println("============Salaries=============");
		emps.stream().map(emp -> emp.getSal()).forEach(x -> System.out.println(x + " "));
		System.out.println("=========Names=================");
		emps.stream().map(emp -> emp.getName()).forEach(System.out::println);
		System.out.println("=============Employees sal > 50000================");
		emps.stream().filter(emp -> emp.getSal() > 50000).forEach(System.out::println);
		System.out.println("=============Employees Dept IT================");
		emps.stream().filter(emp -> emp.getDeptname().equals("Testing")).forEach(System.out::println);

		List<Integer> nums = List.of(1, 2, 3, 4, 5);

		nums.stream().peek(n -> System.out.println("Original: " + n)).filter(n -> n % 2 == 0)
				.peek(n -> System.out.println("After filter: " + n)).map(n -> n * 10)
				.peek(n -> System.out.println("After map: " + n)).forEach(System.out::println);

		try {
			System.out.println("statemenet 1");
			System.out.println("statemenet 1");
			System.out.println("statemenet 1");
			System.out.println("statemenet 1");
			System.out.println("statemenet 1");

		} finally {
			int a = 10 / 0;
			System.err.println("Erroe Occur");

		}

	}

}
