package com.Labprograms.java8features;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String args[]) {
		// Type 1
		Supplier<Integer> s = () -> {

			int res = (int) (Math.random() * 100) + 1;
			return res;
		};
		for (int i = 0; i < 100; i++) {
			System.out.println(s.get());
		}
		///// ******************Type 2 ********************
		Supplier<Integer> s1 = () -> {
			Random r = new Random();
			int res = (int) (r.nextInt(100));
			return res;
		};
//		System.out.println(s1.get());
		for (int i = 0; i < 100; i++) {
			System.out.println(s1.get());
		}
	}
}
