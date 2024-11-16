package javaStudy.day20;

public class StringToBackward_05 {
	public String solution(String my_string) {
		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			answer = my_string.charAt(i) + answer;
		}
		return answer;
	}

	public String otherSolution(String myString) {
		return new StringBuilder(myString).reverse().toString();
	}
}
