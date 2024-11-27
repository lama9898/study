package javaStudy.day30;

public class AddingContinuousNum {
	public int[] solution(int num, int total) {
		int[] answer = new int[num];
		if (num % 2 == 1) {
			for (int i = 0; i < num; i++) {
				answer[i] = (total / num) - (num / 2) + i;
			}
		}
		else {
			for (int i = 0; i < num; i++) {
				answer[i] = (total - num * (num - 1) / 2) / num + i;
			}
		}
		return answer;
	}
	
	//등차수열
	public int[] otherSolution(int num, int total) {
		// 초항 계산
		int a = (total - (num * (num - 1) / 2)) / num;

		// 결과 배열 생성
		int[] result = new int[num];
		for (int i = 0; i < num; i++) {
			result[i] = a + i;
		}

		return result;
	}
}
