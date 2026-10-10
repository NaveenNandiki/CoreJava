package com.Labprograms.oops;

public class FullTimeEmployee extends EmployeeDetails {

	public double netSal() {

		double hra = getBasicSal() * 0.2;
		double da = getBasicSal() * 0.1;
		double netsal = getBasicSal() + hra + da;
		return netsal;
	}
}
