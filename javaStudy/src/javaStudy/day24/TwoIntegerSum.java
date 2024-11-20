package javaStudy.day24;

public class TwoIntegerSum {
	public long solution(int a, int b) {
		long answer = 0;
		if (a == b)
			return a;
		int bigger = a > b ? a : b;
		int smaller = a > b ? b : a;

		for (int i = smaller; i <= bigger; i++) {
			answer += i;
		}
		return answer;
	}

	// 다른 풀이, 등차수열의 합
	public long otherSolution(int a, int b) {
		return sumAtoB(Math.min(a, b), Math.max(b, a));
	}

	private long sumAtoB(long a, long b) {
		return (b - a + 1) * (a + b) / 2;
	}
}
