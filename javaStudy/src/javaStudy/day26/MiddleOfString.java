package javaStudy.day26;

public class MiddleOfString {
	public String solution(String s) {
		String answer = s.length() % 2 == 0 ? s.substring(s.length() / 2 - 1, s.length() / 2 + 1)
				: s.substring(s.length() / 2, s.length() / 2 + 1);
		//return word.substring((word.length()-1)/2, word.length()/2 + 1);
		return answer;
	}
}
