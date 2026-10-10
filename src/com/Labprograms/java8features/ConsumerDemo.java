package com.Labprograms.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

class Employee {
	int id;
	String name;
	double sal;

	public Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
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

}

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(101, "nani", 20000);
		Employee e1 = new Employee(102, "nani", 20000);
		Employee e2 = new Employee(103, "nani", 20000);
		Employee e3 = new Employee(104, "nani", 20000);
		Employee e4 = new Employee(105, "nani", 20000);
		Employee e5 = new Employee(106, "nani", 20000);
		ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(e, e1, e2, e3, e4, e5));

		Consumer<ArrayList<Employee>> c = (emps) -> {
			for (Employee emp : emps) {
				System.out.println("[" + emp.getId() + ":" + emp.getName() + ":" + emp.getSal() + "]");

			}
		};
		c.accept(employees);

	}

}
