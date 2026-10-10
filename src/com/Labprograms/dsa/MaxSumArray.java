package com.Labprograms.dsa;

import java.util.Scanner;

public class MaxSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
//		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//		int[] nums = { 4, -1, 2, 1 };
		int sum = 0;
		int mi = 0;
		int mj = 1;
		int max = 0;
		for (int i = 0; i < n; i++) {
			sum = 0;
			for (int j = i; j < n; j++) {
				sum += nums[j];
				if (sum > max) {
					max = sum;
					mi = i;
					mj = j;
				}
			}

		}
		System.out.println("Max Sum is " + max);
		for (int i = mi; i < mj; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
