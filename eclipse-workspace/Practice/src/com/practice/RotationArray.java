package com.practice;

public class RotationArray {

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(count(nums));
	}

	static int count(int[] arr) {
		int rotate = findPivot(arr);
		return rotate + 1;
	}

	static int findPivot(int[] nums) {
		int start = 0;
		int end = nums.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] > nums[mid + 1]) {
				return mid;
			}
			if (nums[mid] < nums[mid - 1]) {
				return mid + 1;
			}
			if (nums[mid] <= nums[start]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
