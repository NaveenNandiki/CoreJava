package com.Labprograms;

import java.util.Scanner;

public class DigOccurenceInArray {

	static int digitOccur(int num, int digit) {
		int count = 0;
		while (num != 0) {
			int r = num % 10;
			num = num / 10;
			if (r == digit)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr array size");
		int n = sc.nextInt();
		System.out.println("Eneter array Elements");
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("Enter target Digit");
		int target = sc.nextInt();
		int sum = 0;

		for (int num : nums) {
			sum += digitOccur(num, target);
		}
		System.out.println("target digit Occur in the Array " + sum);
		sc.close();
	}

}
