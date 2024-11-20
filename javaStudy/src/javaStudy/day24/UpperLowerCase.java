package javaStudy.day24;

public class UpperLowerCase {
	public String solution(String my_string) {
		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			char temp = my_string.charAt(i);
			if (temp <= 'Z') // 대문자
				answer += (char) ('a' + (temp - 'A'));
			else // 소문자
				answer += (char) ('A' + (temp - 'a'));
		}
		return answer;
	}
}
