package com.Labprograms.logicalStatements;

import java.util.Scanner;

public class DistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array Elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
//		int[] res = new int[n];
//		int count = 0;
//		boolean[] bool = new boolean[n];
//		for (int i = 0; i < n; i++) {
//			if (bool[i] == false) {
//				res[count++] = arr[i];
//				bool[i] = true;
//			}
//			for (int j = i + 1; j < n; j++) {
//				if (arr[i] == arr[j]) {
//					bool[j] = true;
//				}
//			}
//		}
//		for (int i = 0; i < count; i++) {
//			System.out.print(res[i] + " ");
//		}

		// Second way with out Extra array
		for (int i = 0; i < n; i++) {
			boolean f = true;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					f = false;
				}
			}
			if (f) {
				System.out.print(arr[i] + " ");
			}

		}
	}

}
