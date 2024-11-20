package javaStudy.day23;

public class NNumbersWithIntervalOfX {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		int count = 0;
		for (long i = x; count < n; i += x) {
			answer[count] = i;
			count++;
		}
		return answer;
	}
}
