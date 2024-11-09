package javaStudy.day15;

import java.util.Arrays;

public class Smallest5_05 {
	public int[] mySolution(int[] num_list) {
		int[] answer = new int[5];
		Arrays.sort(num_list); // 오름차순
		for (int i = 0; i < 5; i++) {
			answer[i] = num_list[i];
		}
		return answer;
	}

	public int[] otherSolution(int[] num_list) {
		Arrays.sort(num_list);

		return Arrays.copyOfRange(num_list, 0, 5);
	}
}
