package com.dsaProblems.loops;

import java.util.Scanner;

public class ArmstrongNumber {

	static boolean isArmstrongNumber(int n, int pow) {// 1,
		int sum = 0;
		int temp = n;
		while (n != 0) {
			int r = n % 10;
			n = n / 10;
			sum += Math.pow(r, pow);
		}

		return sum == temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		String num = sc.next();
		int pow = num.length();
		int n = Integer.parseInt(num);
		if (isArmstrongNumber(n, pow))
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}

}
