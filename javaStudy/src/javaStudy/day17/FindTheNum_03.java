package javaStudy.day17;

import java.util.stream.IntStream;

public class FindTheNum_03 {
	public int mySolution(int[] num_list, int n) {
		int answer = 0;
		for (int num : num_list) {
			if (num == n) {
				answer = 1;
				break;
			}
		}
		return answer;
	}

	public int otherSolution(int[] numList, int n) {
		return IntStream.of(numList).anyMatch(num -> num == n) ? 1 : 0;
	}
}
