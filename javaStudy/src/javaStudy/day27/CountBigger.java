package javaStudy.day27;

public class CountBigger {
	public int solution(int[] array, int height) {
		int answer = 0;
		for (int a : array) {
			if (height < a)
				answer++;
		}
		return answer;
	}
}
