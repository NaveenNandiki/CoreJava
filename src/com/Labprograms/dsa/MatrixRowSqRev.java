package com.Labprograms.dsa;

public class MatrixRowSqRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = new int[4][4];
		int num = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				nums[i][j] = num++;
			}
		}

		for (int i = 0; i < 4; i++) {
			if (i % 2 == 0) {
				for (int j = 0, k = 3; j < 2 && k >= 0; j++, k--) {
					int temp = nums[i][k];
					nums[i][k] = nums[i][j];
					nums[i][j] = temp;
					if (i == j) {
						nums[i][j] = nums[i][j] * nums[i][j];
					}
				}

			} else {
				for (int j = 0; j < 4; j++) {
					if (i == j)
						nums[i][j] = nums[i][j] * nums[i][j];
					else
						nums[i][j] *= 2;
				}
			}

		}
		nums[2][2] = nums[2][2] * nums[2][2];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

	}

}
