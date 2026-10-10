package com.Labprograms;

class Account1 {
	long accountNo;

	Account1() {
		this(9876654322l);
	}

	Account1(long ano) {
		this.accountNo = ano;
	}

	void displayAmount() {
		System.out.println("Account number: " + this.accountNo);

	}

	static void hlo() {
		System.out.println("hlo");
	}

}

public class SavingsAccount1 extends Account1 {
	String name;
	int id;
	double balance;

	SavingsAccount1() {
		this("Naveen", 101, 250000);
	}

	SavingsAccount1(String name, int id, double balance) {
		super();
		this.name = name;
		this.id = id;
		this.balance = balance;
		this.display();
	}

	void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Account NO: " + super.accountNo);
		System.out.println("Id :" + this.id);
		System.out.println("balance : " + this.balance);
		super.displayAmount();
	}

	SavingsAccount1 getObj() {
		return this;
	}

	public static void main(String[] args) {
		SavingsAccount1 s1 = new SavingsAccount1();
		s1.display();
		s1.displayAmount();
		SavingsAccount1 s3 = s1.getObj();
		s3.display();

//		System.out.println(super.accountNo);
//		Account1 a=new Account1();
//		super.a.hlo();
	}

}
