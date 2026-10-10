package com.Labprograms.exceptionhandling.userdefined;

import java.util.Scanner;

public class BankAccountManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user Name");
		String name = sc.nextLine();
		System.out.println("Enetr balance to withdraw");
		double wbal = sc.nextDouble();
		Account a1 = new Account(1000);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		if (wbal > a1.getBal()) {
			throw new InsufficentBalanceException();
		}
		double b = 0.0;
		double res = wbal / b;
		System.out.println(res);
		System.out.println(wbal);
		System.out.println("check");
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//		}
	}

}
