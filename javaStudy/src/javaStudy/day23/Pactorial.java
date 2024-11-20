package javaStudy.day23;

public class Pactorial {
	public int solution(int n) {
		int answer = 1;
		int i = 1;
		while (n > i) {
			i = i * answer;
			if (i > n) {
				answer--;
				break;
			} else if (i == n)
				break;
			else
				answer++;
		}
		return answer;
	}

	public int otherSolution(int n) {
		int answer = 1;
		int factorial = 1;

		while (n >= factorial) {
			answer++;
			factorial *= answer;
		}
		return answer - 1;
	}
}
