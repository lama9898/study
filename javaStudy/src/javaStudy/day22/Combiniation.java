package javaStudy.day22;

public class Combiniation { // ★★★★★★★★★★★★★ Big Integer
	public int solution(int balls, int share) {
		int answer = 1;
		for (int i = 1; i <= share; i++) {
			answer = answer * balls / i;
			balls--;
		}
		return answer;
	}

	public int otherSolution(int balls, int share) {
		double answer = 0;
		double u = 1, d = 1;
		for (int i = share; i > 0; i--) {
			u *= balls;
			d *= i;
			balls--;
		}
		answer = u / d;
		return (int) answer;
	}
}
