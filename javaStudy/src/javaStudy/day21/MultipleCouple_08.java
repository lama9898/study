package javaStudy.day21;

public class MultipleCouple_08 { // 약수의 개수
	public static void main(String[] args) {
		MultipleCouple_08 test = new MultipleCouple_08();
		test.solution(20);
	}

	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer++;
			}
		}
		return answer;
	}
}
