package com.Labprograms.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		Predicate<Integer> p = (n) -> n % 2 == 0;

		for (int n : arr) {
			if (p.test(n)) {
				System.out.println(n);
			}
		}
//		Consumer
	}

}
