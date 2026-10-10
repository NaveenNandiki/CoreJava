package com.dsaProblems.greedy;

public class Jump1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 2, 1, 0, 4 };
		int n = nums.length;
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (i > max) {
				System.out.println("false");
				break;
			}
			max = Math.max(max, i + nums[i]);
		}
		if (max >= n) {
			System.out.println("reach");
		}
	}

}
