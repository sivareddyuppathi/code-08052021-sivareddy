package com.coding.compitative;

public class FindInsertPositionForSortedArray {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 5, 6, 8 };
		int target = 9;

		System.out.println(searchAndInsertRecursive(nums, target)); // O(logn)

		System.out.println(searchAndInsertIterative(nums, target)); // O(logn)
	}

	private static int searchAndInsertIterative(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] == target)
				return mid;

			else if (nums[mid] > target)
				right = mid - 1;
			else
				left = mid + 1;
		}
		return left;
	}

	private static int searchAndInsertRecursive(int[] nums, int target) {

		return binarySearchRecursive(nums, target, 0, nums.length - 1);
	}

	private static int binarySearchRecursive(int[] nums, int target, int low, int high) {
		if (low > high)
			return low;

		int mid = low + (high - low) / 2;

		if (nums[mid] == target)
			return mid;
		else if (target < nums[mid])
			return binarySearchRecursive(nums, target, low, mid - 1);
		else if (target > nums[mid])
			return binarySearchRecursive(nums, target, mid + 1, high);
		else
			return low;
	}
}
