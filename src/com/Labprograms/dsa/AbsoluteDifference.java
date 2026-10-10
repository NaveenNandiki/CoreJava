package com.Labprograms.dsa;

import java.util.Arrays;

public class AbsoluteDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 3, 19, 18, 25 };
		int n = arr.length;
		Arrays.sort(arr);
		int el1 = 0;
		int el2 = 0;
		int min = Integer.MAX_VALUE;
		int cmin = 0;
		for (int i = 0; i < n - 1; i++) {

			cmin = arr[i + 1] - arr[i];
			if (min > cmin) {
				el1 = arr[i];
				el2 = arr[i + 1];
				min = cmin;
			}
		}

		System.out.println("min: " + min);
		System.out.println("[ " + el1 + " , " + el2 + " ]");
	}

}
