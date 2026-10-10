package com.dsaProblems.recursion;

import java.util.ArrayList;

public class FindSubSeq {
	public static boolean subseq(int n, ArrayList<Integer> res, int sum, int target, int[] arr) {
		if (n == arr.length) {
			if (sum == target) {
				System.out.println(res);
				return true;

			}
			return false;
		}
		res.add(arr[n]);
		sum = sum + arr[n];
		if (subseq(n + 1, res, sum, target, arr) == true)
			return true;
		res.remove(res.size() - 1);
		sum = sum - arr[n];
		if (subseq(n + 1, res, sum, target, arr) == true)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 2;
		int[] arr = new int[] { 1, 2, 1 };
		ArrayList<Integer> res = new ArrayList<>();
		subseq(0, res, 0, target, arr);
	}

}
