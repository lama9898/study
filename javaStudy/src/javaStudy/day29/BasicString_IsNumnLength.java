package javaStudy.day29;

public class BasicString_IsNumnLength {
	public boolean solution(String s) {
		boolean answer = true;
		if (s.length() != 4 && s.length() != 6) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				answer = true;
			} else {
				answer = false;
				break;
			}
		}
		return answer;
	}
	// 정규표현식 사용하는방법
	// s.matches("(^[0-9]*$)");
}
