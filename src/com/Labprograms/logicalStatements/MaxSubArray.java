package com.Labprograms.logicalStatements;

import java.util.Scanner;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Sub Array:
//			for (int i = 0; i < n - 1; i++) {
//				System.out.println("{" + arr[i] + "}");
//				System.out.print("{");
//	
//				for (int j = i; j < n; j++) {
//					System.out.print(arr[j] + " ");
//				}
//				System.out.print("}");
//				System.out.println();
//			}
//			System.out.println("{" + arr[n - 1] + "}");

		// Max SubArray
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < n; i++) {
			sum = 0;
			for (int j = i; j < n; j++) {
				sum += arr[j];
				if (sum > max) {
					start = i;
					end = j;
					max = sum;
				}
			}
		}
		System.out.print("{");
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("} " + max);
	}

}
