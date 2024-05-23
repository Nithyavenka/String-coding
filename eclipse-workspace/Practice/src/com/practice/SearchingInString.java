package com.practice;

public class SearchingInString {

	public static void main(String[] args) {
		String name = "javaa";
		// char target = 'n';

		// System.out.println(search(name, target));
		System.out.println(commonChar(name));
	}

	// target element is available in the given string is available return true if
	// not return false
	static boolean search(String str, char target) {
		if (str.length() == 0) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (target == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}

	// this method to find the common char is available in given String
	static String commonChar(String str) {
		char a=str.charAt(0);
		for(int i=1;i<str.length();i++) {
			if (str.indexOf(i) == a) {
				a = str.charAt(i);
			}

		}
		return str;
	}

}
