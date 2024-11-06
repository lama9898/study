package javaStudy.day13;

public class SpecificToUpperCase_05 {
	public String solution(String my_string, String alp) {
		String answer = my_string.replaceAll(alp, alp.toUpperCase());
		return answer;
	}
}
