package com.practice;

public class SumOfNumbers {

	public static void main(String[] args) {
		int num = 4;
		System.out.println(sum(num));
	}

	static int sum(int x) {
		int count = 0;
		for (int i = 1; i <= x; i++) {
			count += i;


		}
		return count;
	}

}
