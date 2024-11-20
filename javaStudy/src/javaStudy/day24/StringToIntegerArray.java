package javaStudy.day24;

public class StringToIntegerArray {
	public int[] solution(long n) {
		String num = n + "";
		int[] answer = new int[num.length()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int) (n % 10);
			n = n / 10;
		}
		return answer;
	}
}
