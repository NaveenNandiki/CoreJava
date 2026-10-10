package com.Labprograms;

import java.util.Scanner;

public class Reverse100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		String rnum = "";
		while (n != 0) {
			int r = n % 10;
			n = n / 10;
			rnum = rnum + r;
		}
		System.out.println(rnum);
	}

}
