package com.Labprograms.java8features;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, String> f = (str) -> str.toUpperCase();
		String s = "naveen";
		System.out.println(f.apply(s));

	}

}
