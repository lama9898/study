package javaStudy.day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SumHashSet {
	public int[] solution(int[] numbers) {
		int[] answer = {};
		HashSet<Integer> sums = new HashSet<>();
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				sums.add(numbers[i] + numbers[j]);
			}
		}
		answer = sums.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(answer);
		return answer;
	}

	public int[] otherSolution(int[] numbers) {
		int[] answer;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int tmp = numbers[i] + numbers[j];
				if (!list.contains(tmp)) {
					list.add(tmp);
				}
			}
		}

		int size = 0;
		answer = new int[list.size()];
		for (int num : list) {
			answer[size++] = num;
		}
		Arrays.sort(answer);
		return answer;
	}
}
