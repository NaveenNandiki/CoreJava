package com.dsaProblems.greedy;

public class Jumps2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, 1, 4, 1, 1, 1, 2 };
		int n = nums.length;
		int r = 0;
		int l = 0;
		int jumps = 0;
		while (r < n - 1) {
			int far = 0;
			for (int i = l; i <= r; i++) {
				far = Math.max(i + nums[i], far);
			}

			l = r + 1;
			r = far;
			jumps++;
//			if (far >= n - 1) {
//				System.out.println("true");
//				break;
//			}
		}
		System.out.println(jumps);
	}

}
