package javaStudy.day12;

public class CalculationAccordingToLength_09 {
	public int solution(int[] num_list) {
		int answer = 0;
		if (num_list.length >= 11) {
			for (int num : num_list) {
				answer += num;
			}
		} else {
			answer = 1;
			for (int num : num_list) {
				answer *= num;
			}
		}
		return answer;
	}
}
