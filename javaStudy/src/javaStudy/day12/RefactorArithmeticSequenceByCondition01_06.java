package javaStudy.day12;

public class RefactorArithmeticSequenceByCondition01_06 {
	public int[] solution(int[] arr) {
		int[] answer = arr.clone();
		for (int i = 0; i < answer.length; i++) {
			{
				if (arr[i] >= 50 && arr[i] % 2 == 0)
					answer[i] = arr[i] / 2;
				else if (arr[i] < 50 && arr[i] % 2 == 1)
					answer[i] = arr[i] * 2;
			}
		}
		return answer;
	}
}
