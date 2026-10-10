package com.dsaProblems.sortings;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 4, 51, 26, 17, 81, 9 };
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
