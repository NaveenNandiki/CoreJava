package com.Labprograms;

class Account {
	Account() {
	};

	long accountNumber;
	String accountHolderName;

	Account(long aNo, String name) {
		this.accountHolderName = name;
		this.accountNumber = aNo;
	}
}

public class SavingsAccount extends Account {

	double balance;

	SavingsAccount() {
	}

	SavingsAccount(double balance, long ano, String name) {
		super(ano, name);
		this.balance = balance;
	}

	void display() {
		System.out.println("Account Holder Name: " + super.accountHolderName);
		System.out.println("Account Number: " + super.accountNumber);
		System.out.println("Balance: " + this.balance);

	}

	SavingsAccount getObj() {
		return this;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sa = new SavingsAccount(25000, 98765456321l, "Naveen");
		sa.display();
		SavingsAccount sa1 = new SavingsAccount(25000, 92765987651l, "Ravi");
		sa1.display();
		SavingsAccount s3 = sa.getObj();
		s3.display();

	}

}
