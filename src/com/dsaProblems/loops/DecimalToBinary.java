package com.dsaProblems.loops;

import java.util.Scanner;

public class DecimalToBinary {

	static String decimalToBinary(int n) {
		String bnum = "";
		while (n > 0) {
			int r = n % 2;
			n = n / 2;
			bnum = r + bnum;
		}
		return bnum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		String bnum = decimalToBinary(n);
		System.out.println("Binary Representation Of Given number is " + bnum);
		sc.close();
	}

}
