package com.dsaProblems.recursion;

public class ClimbingStairs {

	public static int ways(int n, int steps) {

		if (n == steps) {
			return 1;
		}
		if (n >= steps)
			return 0;
		int l = ways(n + 1, steps);
		int r = ways(n + 2, steps);

		return l + r;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int steps = 4;
//		ArrayList<Integer> l = new ArrayList<>();
		System.out.println(ways(1, steps));
	}

}
