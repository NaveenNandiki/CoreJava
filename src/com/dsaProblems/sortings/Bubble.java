package com.dsaProblems.sortings;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 8, 7, 6, 5, 4 };
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			boolean stat = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j + 1] ^ arr[j];
					arr[j + 1] = arr[j + 1] ^ arr[j];
					arr[j] = arr[j + 1] ^ arr[j];
					stat = true;
				}
			}
			if (!stat) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
