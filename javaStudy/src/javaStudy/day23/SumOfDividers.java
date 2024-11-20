package javaStudy.day23;

public class SumOfDividers {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				answer = answer + i;
		}
		return answer;
	}

	public int otherSolution(int num) {
		int answer = 0;
		for (int i = 1; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				answer += i;
			}
		}
		return answer + num;
	}
}
