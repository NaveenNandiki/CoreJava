package com.Labprograms;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Enter year to check: ");
			Scanner sc = new Scanner(System.in);
			int year = sc.nextInt();
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println("Leap Year");
			} else {
				System.out.println("Not leap year");
			}
		}
	}

}
