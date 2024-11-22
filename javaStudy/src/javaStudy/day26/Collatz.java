package javaStudy.day26;

public class Collatz {
	public static void main(String[] args) {
		Collatz test = new Collatz();
		test.solution(626331);
	}

	public int solution(int num) {
		int answer = 0;
		long n = num;
		while (n != 1) {
			if (n % 2 == 0)
				n = n / 2;
			else
				n = n * 3 + 1;
			answer++;
		}
		answer = answer > 500 ? -1 : answer;
		return answer;
	}
}
