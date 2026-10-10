package com.Labprograms.operators;

import java.util.Scanner;

public class DisvisibleBy3or7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check: ");
		int a = sc.nextInt();
		System.out.println(a % 3 == 0 ? "Divisible by 3" : (a % 7 == 0) ? "Divisible By 7" : "Not Divisible By 3 or 7");

	}

}
