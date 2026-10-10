package com.dsaProblems.greedy;

import java.util.Arrays;

public class TotalWitingtime {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 7, 1, 2 };
		Arrays.sort(arr);
		int twt = 0;
		int cwt = 0;
		for (int i = 0; i < arr.length; i++) {
			twt += cwt;
			cwt += arr[i];
		}
		int n = arr.length;
		System.out.print(twt / n);
	}

}
