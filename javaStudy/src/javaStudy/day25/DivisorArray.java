package javaStudy.day25;

import java.util.Arrays;

public class DivisorArray {
	public static void main(String[] args) {
		DivisorArray test = new DivisorArray();
		int[] arr = { 5, 9, 7, 10 };
		test.solution(arr, 5);
	}

	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		String element = "";
		String[] eleArr = {};
		for (int a : arr) {
			if (a % divisor == 0) {
				element = element + a + " ";
			}
		}
		if (element.trim().length() == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			eleArr = element.trim().split(" ");
			answer = new int[eleArr.length];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = Integer.parseInt(eleArr[i]);
			}
			Arrays.sort(answer);
		}
		return answer;
	}
	
	public int[] otherSolution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        Arrays.sort(answer);
        return answer;
	}
}
