package javaStudy.day21;

public class StringReplace_01 {
	public String solution(String my_string, String letter) {
		String answer = my_string.replaceAll(letter, "");
		return answer;
	}
}
