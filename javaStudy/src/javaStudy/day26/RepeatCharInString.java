package javaStudy.day26;

public class RepeatCharInString {
	public String solution(String phone_number) {
		String answer = "*";
		answer = answer.repeat(phone_number.length() - 4);
		answer += phone_number.substring(phone_number.length() - 4);
		return answer;
	}
}
