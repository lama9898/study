package javaStudy.day27;

public class Count7 {
	public int solution(int[] array) {
		int answer = 0;
		for (int i = 0; i < array.length; i++) {
			String num = array[i] + "";
			for (int j = 0; j < num.length(); j++) {
				if (num.charAt(j) == '7') {
					answer++;
				}
			}
		}
		return answer;
	}

	public int otherSolution(int[] array) {
		int answer = 0;
		for (int a : array) {
			while (a != 0) {
				if (a % 10 == 7) {
					answer++;
				}
				a /= 10;
			}
		}
		return answer;
	}
}
