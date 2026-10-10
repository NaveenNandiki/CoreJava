package com.Labprograms.dsa;

public class PriceDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 10, 5, 7, 2, 1, 3 };
		int[] res = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			res[i] = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					res[i] = nums[i] - nums[j];
					break;
				}
			}
		}
		for (int n : res) {
			System.out.print(n + " ");
		}

	}

}
