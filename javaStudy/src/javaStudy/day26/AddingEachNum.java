package javaStudy.day26;

public class AddingEachNum {
	public int solution(int n) {
		int answer = 0;
		String num = n + "";
		for (int i : num.toCharArray()) {
			answer += i - '0';
		}
		return answer;
	}

	public int otherSolution(int n) {
		int answer = 0;

		while (n > 0) {
			answer += n % 10;
			n /= 10;
		}

		return answer;
	}
}
