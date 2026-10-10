package com.Labprograms.oops;

public class PartTimeEmployee extends EmployeeDetails {

	public double netSal() {
		double al = getBasicSal() * 0.05;
		double netsal = getBasicSal() + al;
		return netsal;
	}
}
