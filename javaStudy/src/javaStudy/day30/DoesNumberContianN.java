package javaStudy.day30;

public class DoesNumberContianN {
	public static void main(String[] args) {
		DoesNumberContianN test = new DoesNumberContianN();
		test.solution(1, 13, 1);
	}

	public int solution(int i, int j, int k) {
		int answer = 0;
		for (int x = i; x <= j; x++) {
			String temp = x + "";
			for (int y = 0; y < temp.length(); y++) {
				if (temp.charAt(y) - '0' == k)
					answer++;
			}
		}
		return answer;
	}

	public int otherSolution(int i, int j, int k) {
		int answer = 0;

		for (int num = i; num <= j; num++) {
			int tmp = num;
			while (tmp != 0) {
				if (tmp % 10 == k)
					answer++;
				tmp /= 10;
			}
		}
		return answer;
	}
}
