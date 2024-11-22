package javaStudy.day26;

public class IsItSquared {
	public int solution(int n) {
		int answer = 2;
		for (int i = 0; i * i < n + 1; i++) { //i*i이 계산 과정 중 소수점으로 인해 n보다 커질 수 있기 때문에
			if (i * i == n) {
				answer = 1;
				break;
			}
		}
		return answer;
	}
}
