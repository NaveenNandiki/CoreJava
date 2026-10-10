package com.Labprograms;

import java.util.Scanner;

public class CountEvenAndOddnumsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr array size");
		int n = sc.nextInt();
		System.out.println("Eneter array Elements");
		int[] nums = new int[n];
		int ecount = 0;
		int ocount = 0;

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
			if ((nums[i] & 1) == 0)
				ecount++;
			else
				ocount++;
		}

		System.out.println("Even Count " + ecount);
		System.out.println("Odd count " + ocount);
	}

}
