package com.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Reverse {

	public static void main(String[] args) {
		String str = "Hello World";
		String reverse = Arrays.stream(str.split(" ")).map(w -> new StringBuffer(w).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(reverse);

	}

}
