package com.dsaProblems.recursion;

public class CountNoOfSubSeq {
//	public static int subseq(int n, ArrayList<Integer> res, int sum, int target, int[] arr) {
	public static int subseq(int n, int sum, int target, int[] arr) {

		if (n == arr.length) {
			if (sum == target) {
//				System.out.println(res);
				return 1;

			}
			return 0;
		}
//		res.add(arr[n]);
//		sum = sum + arr[n];
//		if (subseq(n + 1, res, sum, target, arr) == true)
//			return true;
		sum = sum + arr[n];
		int l = subseq(n + 1, sum, target, arr);

//		res.remove(res.size() - 1);
//		sum = sum - arr[n];
//		if (subseq(n + 1, res, sum, target, arr) == true)
//			return true;
		sum = sum - arr[n];
		int r = subseq(n + 1, sum, target, arr);

		return l + r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 2;
		int[] arr = new int[] { 1, 2, 1 };
//		ArrayList<Integer> res = new ArrayList<>();
//		System.out.println(subseq(0, res, 0, target, arr));
		System.out.println(subseq(0, 0, target, arr));

	}

}
