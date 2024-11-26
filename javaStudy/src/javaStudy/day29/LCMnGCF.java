package javaStudy.day29;

public class LCMnGCF {
	// least common multiple
	// greatest common factor
	public static void main(String[] args) {
		LCMnGCF test = new LCMnGCF();
		test.solution(3, 12);
	}

	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		answer[0] = 1;
		answer[1] = n * m;
		for (int i = 2; i <= Math.min(n, m); i++) {
			if (n % i == 0 && m % i == 0)
				answer[0] = i;
		}
		for (int i = Math.max(n, m); i < n * m; i++) {
			if (i % n == 0 && i % m == 0) {
				answer[1] = i;
				break;
			}
		}
		// answer[1] = n * m / answer[0];
		return answer;
	}
}
