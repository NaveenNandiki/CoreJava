package com.dsaProblems.sortings;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 51, 26, 17, 81, 9 };
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}

			if (min != i) {
				arr[min] = arr[i] ^ arr[min];
				arr[i] = arr[i] ^ arr[min];
				arr[min] = arr[i] ^ arr[min];
			}
			System.out.println("hello");
		}

		System.out.println(Arrays.toString(arr));
	}

}
