package javaStudy.day21;

public class IntegerToCharToString_06 {
	public static void main(String[] args) {
		IntegerToCharToString_06 test = new IntegerToCharToString_06();
		test.solution(53);
	}

	public String solution(int age) {
		String answer = "";
		String ageToStr = age + "";
		for (int i = 0; i < ageToStr.length(); i++) {
			int diff = (int) ageToStr.charAt(i) - '0';
			answer = answer + (char) ((int) 'a' + diff);
		}
		return answer;
	}

	public String otherSolution(int age) {
		String answer = "";
		String[] alpha = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };

		while (age > 0) {
			answer = alpha[age % 10] + answer;
			age /= 10;
		}

		return answer;
	}
}
