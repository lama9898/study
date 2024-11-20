package javaStudy.day24;

import java.util.Arrays;

public class LongToReverseIntArray {
	public long solution(long n) {
		long answer = 0;
		char[] nums = (n + "").toCharArray();
		String num = "";
		Arrays.sort(nums);
		for (int i = 1; i <= nums.length; i++) {
			num += (nums[nums.length - i] - '0');
		}
		answer = Long.parseLong(num);
		return answer;
	}
}
