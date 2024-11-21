package javaStudy.day25;

public class ChangeIndexInString {
	public String solution(String my_string, int num1, int num2) {
		String answer = my_string.substring(0, num1) + my_string.charAt(num2) + my_string.substring(num1 + 1, num2)
				+ my_string.charAt(num1) + my_string.substring(num2 + 1);
		return answer;
	}

	public String otherSolution(String my_string, int num1, int num2) {
		String answer = "";

		char[] ch = my_string.toCharArray();

		ch[num1] = my_string.charAt(num2);
		ch[num2] = my_string.charAt(num1);

		answer = String.valueOf(ch);
		return answer;
	}
}
