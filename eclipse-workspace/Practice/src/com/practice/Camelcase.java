package com.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Camelcase {

	public static void main(String[] args) {
		String str = "nithya venkatasamy";
		System.out.println(camelCase(str));
	}

	public static String camelCase(String str) {
//		String[] words = str.split(" ");
//		StringBuilder camelCaseString = new StringBuilder(words[0].toLowerCase());
//		for (int i = 1; i < words.length; i++) {
//			camelCaseString.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1));
//		}
//		return camelCaseString.toString();
		return Arrays.stream(str.split(" ")).map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
				.collect(Collectors.joining(" "));
	}
}
