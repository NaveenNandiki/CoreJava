package com.Labprograms.threads;

class EmployeeThread extends Thread {
	String name;
	double sal = 0;

	public EmployeeThread(String name, double sal) {
		this.name = name;
		this.sal = sal;
	}

	@Override
	public void run() {
		System.out.println("[Name: " + name + ", sal " + sal + " ]");
		double temp = sal;
		for (int i = 0; i < 4; i++) {
			sal += temp;
		}
	}

	public double getSal() {
		return sal;
	}
}

public class Employees {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EmployeeThread emp1 = new EmployeeThread("Naveen", 3000);
		EmployeeThread emp2 = new EmployeeThread("Jayanth", 4000);
		EmployeeThread emp3 = new EmployeeThread("Mani", 5000);
		emp1.start();
		emp2.start();
		emp3.start();

		emp1.join();
		emp2.join();
		emp3.join();

		System.out.println(emp1.name + " " + emp1.getSal());
		System.out.println(emp2.name + " " + emp2.getSal());
		System.out.println(emp3.name + " " + emp3.getSal());
	}

}
