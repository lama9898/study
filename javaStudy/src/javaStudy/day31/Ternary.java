package javaStudy.day31;

public class Ternary {
	public static void main(String[] args) {
		Ternary test = new Ternary();
		test.solution(45);
	}
	public int solution(int n) {
		int answer = 0;
		int num = n;
		String num3 = "";
		while (!(num / 3 == 0 && num % 3 == 0)) {
			int temp = num % 3;
			num3 += temp;
			num /= 3;
		}
		System.out.println(num3);
		for (int i = 0; i < num3.length(); i++) {
			answer += (num3.charAt(i) - '0') * Math.pow(3, num3.length() - i - 1);
		}
		System.out.println(answer);
		return answer;
	}
}
