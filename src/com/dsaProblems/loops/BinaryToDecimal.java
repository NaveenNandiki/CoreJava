package com.dsaProblems.loops;

import java.util.Scanner;

public class BinaryToDecimal {

	static int binaryToDecimal(int n) {
		int res = 0;
		int pow = 0;
		while (n > 0) {
			int r = n % 10;
			n = n / 10;
			res += r * Math.pow(2, pow++);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number in Binary Representation");
		int bNum = sc.nextInt();
		int dNum = binaryToDecimal(bNum);
		System.out.println("Decimal Representation is " + dNum);
		sc.close();
	}

}
