package javaStudy.day23;

import java.util.Arrays;

public class SortString01 {
	public int[] solution(String my_string) {
		String numStr = my_string.replaceAll("[a-z]", "");
		int[] answer = new int[numStr.length()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(numStr.charAt(i) + "");
		}
		/*
		for (int i = 0; i < my_string.length(); i++) {
			answer[i] = my_string.charAt(i) - '0';
		}
		 */
		Arrays.sort(answer);
		return answer;
	}
}
