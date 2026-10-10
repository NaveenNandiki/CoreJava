package com.Labprograms.stringHandling;

public class ArrangeStringNumber {
	public static String sort(StringBuilder s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length() - i - 1; j++) {
				if (s.charAt(j) > s.charAt(j + 1)) {
					char tem = s.charAt(j);
					s.setCharAt(j, s.charAt(j + 1));
					{
						s.setCharAt(j + 1, tem);
					}
				}
			}
		}
		return s.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " ACEBD534FG12";
		StringBuilder num = new StringBuilder("");
		StringBuilder cha = new StringBuilder("");
		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch)) {
				num.append(ch);
			} else
				cha.append(ch);
		}

//		System.out.println(cha.append(num));
		System.out.println(sort(cha) + sort(num));

	}

}
