package javaStudy.day25;

import java.util.ArrayList;
import java.util.List;

public class GetTheDivisor {
	public int[] solution(int n) {
		int[] answer = {};
		String divisor = "1";
		String[] nums = {};
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				divisor = divisor + (" " + i);
			}
		}
		nums = divisor.split(" ");
		answer = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			answer[i] = Integer.parseInt(nums[i]);
		}
		return answer;
	}

	public int[] otherSolution(int n) {
		List<Integer> answer = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer.add(i);
			}
		}
		return answer.stream().mapToInt(x -> x).toArray();
	}
}
