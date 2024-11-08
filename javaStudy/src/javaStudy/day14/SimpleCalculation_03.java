package javaStudy.day14;

public class SimpleCalculation_03 {
	public int solution(String binomial) {
		String[] math = binomial.split(" ");
		int answer = 0;

		switch (math[1]) {
		case "+":
			answer = Integer.parseInt(math[0]) + Integer.parseInt(math[2]);
			break;
		case "-":
			answer = Integer.parseInt(math[0]) - Integer.parseInt(math[2]);
			break;
		case "*":
			answer = Integer.parseInt(math[0]) * Integer.parseInt(math[2]);
			break;
		}
		return answer;
	}
}
