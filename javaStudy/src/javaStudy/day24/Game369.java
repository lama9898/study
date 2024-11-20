package javaStudy.day24;

public class Game369 {
	public int solution(int order) {
		int answer = 0;
		String str = order + "";
		for (char c : str.toCharArray()) {
			if (c == '3' || c == '6' || c == '9') {
				answer++;
			}
		}
		return answer;
	}

	public int otherSolution(int order) {
		int answer = 0;
		int count = 0;
		while (order != 0) {
			if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
				count++;
			}
			order = order / 10;
		}
		answer = count;
		return answer;
	}
}
