package javaStudy.day35;

import java.util.Arrays;

public class AppleFarmer {
	public static void main(String[] args) {
		AppleFarmer test = new AppleFarmer();
		int[] arr = { 1, 2, 3, 1, 2, 3, 1 };
		test.solution(3, 4, arr);
	}

	public int solution(int k, int m, int[] score) {
		int answer = 0;
		int[] apples = score.clone();
		Arrays.sort(apples);
		for (int i = m; i <= apples.length; i += m) {
			answer += apples[apples.length - i] * m;
		}
		return answer;
	}
}
