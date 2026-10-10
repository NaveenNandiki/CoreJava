package com.Labprograms.oops;

import java.util.Scanner;

public class PayrollSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		EmployeeDetails ed = new EmployeeDetails();
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter Employee Id");
//		ed.setEmpId(sc.nextInt());
//		System.out.println("Enter Employee Name");
//		sc.nextLine();
//		ed.setEmpName(sc.nextLine());
//		System.out.println("Enter Employee Type");
//		String type = sc.nextLine();
//		System.out.println("Enter Basic Salary");
//		ed.setBasicSal(sc.nextDouble());
//
//		if (type.equalsIgnoreCase("Full-Time")) {
//			FullTimeEmployee fe = new FullTimeEmployee();
//			System.out.println(fe.netSal());
//		} else if (type.equalsIgnoreCase("Part-Time")) {
//			PartTimeEmployee pe = new PartTimeEmployee();
//			System.out.println(pe.netSal());
//		} else {
//			ContractEmployee ce = new ContractEmployee();
//			System.out.println(ce.netSal());
//		}

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Type");
		String type = sc.nextLine();

		EmployeeDetails emp;

		if (type.equalsIgnoreCase("Full-Time")) {
			emp = new FullTimeEmployee();
		} else if (type.equalsIgnoreCase("Part-Time")) {
			emp = new PartTimeEmployee();
		} else {
			emp = new ContractEmployee();
		}

		System.out.println("Enter Employee Id");
		emp.setEmpId(sc.nextInt());

		sc.nextLine();

		System.out.println("Enter Employee Name");
		emp.setEmpName(sc.nextLine());

		System.out.println("Enter Basic Salary");
		emp.setBasicSal(sc.nextDouble());
		emp.setEmpType(type);
		System.out.println("\n------ Employee Details ------");
		System.out.println("Employee ID   : " + emp.getEmpId());
		System.out.println("Employee Name : " + emp.getEmpName());
		System.out.println("Employee Type : " + emp.getEmpType());
		System.out.println("Basic Salary  : " + emp.getBasicSal());
		System.out.println("Net Salary    : " + emp.netSal());
		sc.close();
	}

}
