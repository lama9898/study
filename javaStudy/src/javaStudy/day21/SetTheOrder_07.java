package javaStudy.day21;

public class SetTheOrder_07 {
	public static void main(String[] args) {
		SetTheOrder_07 test = new SetTheOrder_07();
		int[] arr = { 3, 76, 24 };
		test.solution(arr);
	}

	public int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
		int[] priority = emergency.clone();
		for (int i = 0; i < priority.length; i++) {
			int max = 0, maxIdx = 0;
			for (int j = 0; j < priority.length; j++) {
				if (max < priority[j]) {
					max = priority[j];
					maxIdx = j;
				}
			}
			answer[maxIdx] = i + 1;
			priority[maxIdx] = 0;
		}
		return answer;
	}

	
	// 자신보다 큰 값 count하기
	public int[] otherSolution(int[] emergency) {
		int[] answer = new int[emergency.length];

		for (int i = 0; i < answer.length; i++) {
			if (answer[i] != 0) {
				continue;
			}
			int idx = 1;
			for (int j = 0; j < answer.length; j++) {
				if (emergency[i] < emergency[j]) {
					idx++;
				}
			}
			answer[i] = idx;
		}
		return answer;
	}
}
